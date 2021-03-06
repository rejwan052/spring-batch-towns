package com.bazoud.springbatch.towns.batch.configuration.step;

import com.bazoud.springbatch.towns.batch.tasklet.UnzipTaslet;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UnzipStepConfiguration {
  @Autowired
  private StepBuilderFactory stepBuilders;

  @Bean(name = "unzipStep")
  public Step step() {
    return stepBuilders.get("unzipStep")
        .tasklet(tasklet())
        .build();
  }

  @Bean(name = "unzipTasklet")
  public Tasklet tasklet() {
    UnzipTaslet unzipTaslet = new UnzipTaslet();
    return unzipTaslet;
  }

}
