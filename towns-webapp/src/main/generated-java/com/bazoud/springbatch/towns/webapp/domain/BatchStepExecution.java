/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/main/java/domain/Entity.e.vm.java
 */
package com.bazoud.springbatch.towns.webapp.domain;

import static javax.persistence.CascadeType.MERGE;
import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.TemporalType.TIMESTAMP;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.persistence.Version;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.validator.constraints.NotEmpty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Objects;

@Entity
@Table(name = "BATCH_STEP_EXECUTION")
public class BatchStepExecution implements Identifiable<Long>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(BatchStepExecution.class);

    // Raw attributes
    private Long id;
    private Long version;
    private String stepName;
    private Date startTime;
    private Date endTime;
    private String status;
    private Long commitCount;
    private Long readCount;
    private Long filterCount;
    private Long writeCount;
    private Long readSkipCount;
    private Long writeSkipCount;
    private Long processSkipCount;
    private Long rollbackCount;
    private String exitCode;
    private String exitMessage;
    private Date lastUpdated;

    // Many to one
    private BatchJobExecution jobExecution;

    // -- [id] ------------------------

    @Override
    @Digits(integer = 19, fraction = 0)
    @NotNull
    @Column(name = "STEP_EXECUTION_ID", precision = 19)
    @Id
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public BatchStepExecution id(Long id) {
        setId(id);
        return this;
    }

    @Override
    @Transient
    @XmlTransient
    public boolean isIdSet() {
        return id != null;
    }

    // -- [version] ------------------------

    @NotNull
    @Column(name = "VERSION", nullable = false, precision = 19)
    @Version
    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public BatchStepExecution version(Long version) {
        setVersion(version);
        return this;
    }

    // -- [stepName] ------------------------

    @NotEmpty
    @Size(max = 100)
    @Column(name = "STEP_NAME", nullable = false, length = 100)
    public String getStepName() {
        return stepName;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    public BatchStepExecution stepName(String stepName) {
        setStepName(stepName);
        return this;
    }

    // -- [startTime] ------------------------

    @NotNull
    @Column(name = "START_TIME", nullable = false, length = 19)
    @Temporal(TIMESTAMP)
    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public BatchStepExecution startTime(Date startTime) {
        setStartTime(startTime);
        return this;
    }

    // -- [endTime] ------------------------

    @Column(name = "END_TIME", length = 19)
    @Temporal(TIMESTAMP)
    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public BatchStepExecution endTime(Date endTime) {
        setEndTime(endTime);
        return this;
    }

    // -- [status] ------------------------

    @Size(max = 10)
    @Column(name = "STATUS", length = 10)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BatchStepExecution status(String status) {
        setStatus(status);
        return this;
    }

    // -- [commitCount] ------------------------

    @Digits(integer = 19, fraction = 0)
    @Column(name = "COMMIT_COUNT", precision = 19)
    public Long getCommitCount() {
        return commitCount;
    }

    public void setCommitCount(Long commitCount) {
        this.commitCount = commitCount;
    }

    public BatchStepExecution commitCount(Long commitCount) {
        setCommitCount(commitCount);
        return this;
    }

    // -- [readCount] ------------------------

    @Digits(integer = 19, fraction = 0)
    @Column(name = "READ_COUNT", precision = 19)
    public Long getReadCount() {
        return readCount;
    }

    public void setReadCount(Long readCount) {
        this.readCount = readCount;
    }

    public BatchStepExecution readCount(Long readCount) {
        setReadCount(readCount);
        return this;
    }

    // -- [filterCount] ------------------------

    @Digits(integer = 19, fraction = 0)
    @Column(name = "FILTER_COUNT", precision = 19)
    public Long getFilterCount() {
        return filterCount;
    }

    public void setFilterCount(Long filterCount) {
        this.filterCount = filterCount;
    }

    public BatchStepExecution filterCount(Long filterCount) {
        setFilterCount(filterCount);
        return this;
    }

    // -- [writeCount] ------------------------

    @Digits(integer = 19, fraction = 0)
    @Column(name = "WRITE_COUNT", precision = 19)
    public Long getWriteCount() {
        return writeCount;
    }

    public void setWriteCount(Long writeCount) {
        this.writeCount = writeCount;
    }

    public BatchStepExecution writeCount(Long writeCount) {
        setWriteCount(writeCount);
        return this;
    }

    // -- [readSkipCount] ------------------------

    @Digits(integer = 19, fraction = 0)
    @Column(name = "READ_SKIP_COUNT", precision = 19)
    public Long getReadSkipCount() {
        return readSkipCount;
    }

    public void setReadSkipCount(Long readSkipCount) {
        this.readSkipCount = readSkipCount;
    }

    public BatchStepExecution readSkipCount(Long readSkipCount) {
        setReadSkipCount(readSkipCount);
        return this;
    }

    // -- [writeSkipCount] ------------------------

    @Digits(integer = 19, fraction = 0)
    @Column(name = "WRITE_SKIP_COUNT", precision = 19)
    public Long getWriteSkipCount() {
        return writeSkipCount;
    }

    public void setWriteSkipCount(Long writeSkipCount) {
        this.writeSkipCount = writeSkipCount;
    }

    public BatchStepExecution writeSkipCount(Long writeSkipCount) {
        setWriteSkipCount(writeSkipCount);
        return this;
    }

    // -- [processSkipCount] ------------------------

    @Digits(integer = 19, fraction = 0)
    @Column(name = "PROCESS_SKIP_COUNT", precision = 19)
    public Long getProcessSkipCount() {
        return processSkipCount;
    }

    public void setProcessSkipCount(Long processSkipCount) {
        this.processSkipCount = processSkipCount;
    }

    public BatchStepExecution processSkipCount(Long processSkipCount) {
        setProcessSkipCount(processSkipCount);
        return this;
    }

    // -- [rollbackCount] ------------------------

    @Digits(integer = 19, fraction = 0)
    @Column(name = "ROLLBACK_COUNT", precision = 19)
    public Long getRollbackCount() {
        return rollbackCount;
    }

    public void setRollbackCount(Long rollbackCount) {
        this.rollbackCount = rollbackCount;
    }

    public BatchStepExecution rollbackCount(Long rollbackCount) {
        setRollbackCount(rollbackCount);
        return this;
    }

    // -- [exitCode] ------------------------

    @Size(max = 100)
    @Column(name = "EXIT_CODE", length = 100)
    public String getExitCode() {
        return exitCode;
    }

    public void setExitCode(String exitCode) {
        this.exitCode = exitCode;
    }

    public BatchStepExecution exitCode(String exitCode) {
        setExitCode(exitCode);
        return this;
    }

    // -- [exitMessage] ------------------------

    @Size(max = 2500)
    @Column(name = "EXIT_MESSAGE", length = 2500)
    public String getExitMessage() {
        return exitMessage;
    }

    public void setExitMessage(String exitMessage) {
        this.exitMessage = exitMessage;
    }

    public BatchStepExecution exitMessage(String exitMessage) {
        setExitMessage(exitMessage);
        return this;
    }

    // -- [lastUpdated] ------------------------

    @Column(name = "LAST_UPDATED", length = 19)
    @Temporal(TIMESTAMP)
    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public BatchStepExecution lastUpdated(Date lastUpdated) {
        setLastUpdated(lastUpdated);
        return this;
    }

    // -----------------------------------------------------------------
    // Many to One support
    // -----------------------------------------------------------------

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: BatchStepExecution.jobExecution ==> BatchJobExecution.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @NotNull
    @JoinColumn(name = "JOB_EXECUTION_ID", nullable = false)
    @ManyToOne(cascade = { PERSIST, MERGE }, fetch = LAZY)
    public BatchJobExecution getJobExecution() {
        return jobExecution;
    }

    /**
     * Set the {@link #jobExecution} without adding this BatchStepExecution instance on the passed {@link #jobExecution}
     */
    public void setJobExecution(BatchJobExecution jobExecution) {
        this.jobExecution = jobExecution;
    }

    public BatchStepExecution jobExecution(BatchJobExecution jobExecution) {
        setJobExecution(jobExecution);
        return this;
    }

    /**
     * Apply the default values.
     */
    public BatchStepExecution withDefaults() {
        return this;
    }

    /**
     * Equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof BatchStepExecution && hashCode() == other.hashCode());
    }

    private IdentifiableHashBuilder identifiableHashBuilder = new IdentifiableHashBuilder();

    @Override
    public int hashCode() {
        return identifiableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this BatchStepExecution instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Objects.toStringHelper(this) //
                .add("id", getId()) //
                .add("version", getVersion()) //
                .add("stepName", getStepName()) //
                .add("startTime", getStartTime()) //
                .add("endTime", getEndTime()) //
                .add("status", getStatus()) //
                .add("commitCount", getCommitCount()) //
                .add("readCount", getReadCount()) //
                .add("filterCount", getFilterCount()) //
                .add("writeCount", getWriteCount()) //
                .add("readSkipCount", getReadSkipCount()) //
                .add("writeSkipCount", getWriteSkipCount()) //
                .add("processSkipCount", getProcessSkipCount()) //
                .add("rollbackCount", getRollbackCount()) //
                .add("exitCode", getExitCode()) //
                .add("exitMessage", getExitMessage()) //
                .add("lastUpdated", getLastUpdated()) //
                .toString();
    }
}