package com.bazoud.springbatch.towns.batch.configuration;

import com.bazoud.springbatch.towns.batch.configuration.step.DepartmentStepConfiguration;
import com.bazoud.springbatch.towns.batch.configuration.step.FailedStepConfiguration;
import com.bazoud.springbatch.towns.batch.configuration.step.TownStepConfiguration;
import com.bazoud.springbatch.towns.batch.configuration.step.UnzipStepConfiguration;
import com.bazoud.springbatch.towns.batch.listener.TraceJobExecutionListener;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@Import(value = {DepartmentStepConfiguration.class, TownStepConfiguration.class, UnzipStepConfiguration.class, FailedStepConfiguration.class})
public class TownJobConfiguration {
  @Autowired
  private JobBuilderFactory jobBuilders;

  @Bean
  public static PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer() {
    return new PropertySourcesPlaceholderConfigurer();
  }

  @Autowired
  @Qualifier("unzipStep")
  private Step unzipStep;

  @Autowired
  @Qualifier("departmentStep")
  private Step departmentStep;

  @Autowired
  @Qualifier("townStep")
  private Step townStep;

  @Autowired
  @Qualifier("failedStep")
  private Step failedStep;

  @Bean
  public Job townJob() throws Exception {
    return jobBuilders.get("townJob")
         .listener(traceJobExecutionListener())
         .start(unzipStep)
         .next(departmentStep)
         .next(townStep)
        .build();

    /*
    return jobBuilders.get("townJob")
        .listener(traceJobExecutionListener())
        .start(unzipStep)
            .on("*").to(departmentStep)
            .on("FAILED").to(failedStep)
        .from(departmentStep)
            .on("*").to(townStep)
            .on("FAILED").to(failedStep)
        .from(townStep)
          .on("FAILED").to(failedStep)
        .from(failedStep)
          .on("*").fail()
        .end()
        .build();
    */
  }

  @Bean
  public TraceJobExecutionListener traceJobExecutionListener() {
    return new TraceJobExecutionListener();
  }

}
