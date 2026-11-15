package com.quickhire.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Candidate {

	private final int candidateId;
	private String candidateName;
	private String email;
	private String phoneNo;
	private List<JobApplication> jobAppliaction;
	
	public Candidate(int candidateId, String candidateName, String email, String phoneNo) {
		this.candidateId = validateId(candidateId);
		this.candidateName = validateName(candidateName);
		this.email = validateEmail(email);
		this.phoneNo = validatePhone(phoneNo);
		this.jobAppliaction = new ArrayList();
	}
	
	private int validateId(int id) {
		if (id <= 0) {
	        throw new IllegalArgumentException(
	            "Recruiter ID must be positive"
	        );
	    }
	    return id;
	}
	
	private String validateEmail(String email) {
		 Objects.requireNonNull(email, "Email cannot be null");

		    email = email.trim();

		    if (!email.matches(
		        "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {

		        throw new IllegalArgumentException("Invalid email");
		    }

		    return email;
	}
	
	private String validateName(String name) {
		Objects.requireNonNull(name, "Name cannot be null");

	    name = name.trim();

	    if (name.isEmpty()) {
	        throw new IllegalArgumentException(
	            "Name cannot be blank"
	        );
	    }

	    return name;
	}
	
	private String validatePhone(String phone) {

		Objects.requireNonNull(phone, "Phone cannot be null");

	    if (!phone.matches("^[6-9]\\d{9}$")) {
	        throw new IllegalArgumentException(
	            "Invalid phone number"
	        );
	    }

	    return phone;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = validateName(candidateName);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = validateEmail(email);
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = validatePhone(phoneNo);
	}

	public List<JobApplication> getJobAppliaction() {
		return jobAppliaction;
	}

	public void setJobAppliaction(List<JobApplication> jobAppliaction) {
		this.jobAppliaction = jobAppliaction;
	}

	public int getCandidateId() {
		return candidateId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(candidateId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null ||getClass() != obj.getClass())
			return false;
		Candidate other = (Candidate) obj;
		return candidateId == other.candidateId;
	}

	@Override
	public String toString() {
		return "Candidate [candidateId=" + candidateId + ", candidateName=" + candidateName + ", email=" + email
				+ ", phoneNo=" + phoneNo + ", jobAppliaction=" + jobAppliaction + "]";
	}
	
	
}
