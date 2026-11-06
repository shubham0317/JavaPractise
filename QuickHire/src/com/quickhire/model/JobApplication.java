
package com.quickhire.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class JobApplication implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    private final int applicationId;
    private String companyName;
    private String jobRole;
    private ApplicationStatus status;
    private LocalDate appliedDate;
    private Recruiter recruiter;

    // Constructor

    public JobApplication(
            int applicationId,
            String companyName,
            String jobRole,
            ApplicationStatus status,
            LocalDate appliedDate,
            Recruiter recruiter) {

        if (applicationId <= 0) {
            throw new IllegalArgumentException(
                "Application ID must be positive"
            );
        }

        this.applicationId = applicationId;
        this.companyName = validateRequiredText(
            companyName, "Company name"
        );
        this.jobRole = validateRequiredText(
            jobRole, "Job role"
        );
        this.status = Objects.requireNonNull(
            status, "Status cannot be null"
        );
        this.appliedDate = Objects.requireNonNull(
            appliedDate, "Applied date cannot be null"
        );
        this.recruiter = Objects.requireNonNull(
            recruiter, "Recruiter cannot be null"
        );
    }

    // Common validation method (Java 8 compatible)

    private String validateRequiredText(String value, String fieldName) {

        Objects.requireNonNull(
            value, fieldName + " cannot be null"
        );

        value = value.trim();

        if (value.isEmpty()) {
            throw new IllegalArgumentException(
                fieldName + " cannot be blank"
            );
        }

        return value;
    }

    // Getters

    public int getApplicationId() {
        return applicationId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getJobRole() {
        return jobRole;
    }

    public ApplicationStatus getStatus() {
        return status;
    }

    public LocalDate getAppliedDate() {
        return appliedDate;
    }

    public Recruiter getRecruiter() {
        return recruiter;
    }

    // Setters

    public void setCompanyName(String companyName) {
        this.companyName = validateRequiredText(
            companyName, "Company name"
        );
    }

    public void setJobRole(String jobRole) {
        this.jobRole = validateRequiredText(
            jobRole, "Job role"
        );
    }

    public void setStatus(ApplicationStatus status) {
        this.status = Objects.requireNonNull(
            status, "Status cannot be null"
        );
    }

    public void setAppliedDate(LocalDate appliedDate) {
        this.appliedDate = Objects.requireNonNull(
            appliedDate, "Applied date cannot be null"
        );
    }

    public void setRecruiter(Recruiter recruiter) {
        this.recruiter = Objects.requireNonNull(
            recruiter, "Recruiter cannot be null"
        );
    }

    // equals()

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        JobApplication other = (JobApplication) obj;

        return applicationId == other.applicationId;
    }

    // hashCode()

    @Override
    public int hashCode() {
        return Objects.hash(applicationId);
    }

    // toString()

    @Override
    public String toString() {
        return "JobApplication {" +
                "applicationId=" + applicationId +
                ", companyName='" + companyName + '\'' +
                ", jobRole='" + jobRole + '\'' +
                ", status=" + status +
                ", appliedDate=" + appliedDate +
                ", recruiter=" + recruiter +
                '}';
    }

    // Deep cloning

    @Override
    public JobApplication clone() throws CloneNotSupportedException {

        JobApplication ja = (JobApplication) super.clone();

        ja.recruiter = (Recruiter) this.recruiter.clone();

        return ja;
    }
}
