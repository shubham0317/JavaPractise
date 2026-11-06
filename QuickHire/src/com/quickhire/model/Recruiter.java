package com.quickhire.model;

import java.util.Objects;

public class Recruiter implements Cloneable{

	private final int recruiterId;
	private String recruiterName;
	private String recruiterEmail;
	private String recruiterPhone;
	
	
	
	
	public Recruiter(int recruiterId, String recruiterName, String recruiterEmail, String recruiterPhone) {
		
		
		
		
		this.recruiterId = validateId(recruiterId);
		this.recruiterName = validateName(recruiterName);
		this.recruiterEmail = validateEmail(recruiterEmail);
		this.recruiterPhone = validatePhone(recruiterPhone);
	}


   

	public String getRecruiterName() {
		return recruiterName;
	}




	public void setRecruiterName(String recruiterName) {
		this.recruiterName = validateName(recruiterName);
	}




	public String getRecruiterEmail() {
		return recruiterEmail;
	}




	public void setRecruiterEmail(String recruiterEmail) {
		this.recruiterEmail = validateEmail(recruiterEmail);
	}




	public String getRecruiterPhone() {
		return recruiterPhone;
	}




	public void setRecruiterPhone(String recruiterPhone) {
		this.recruiterPhone = validatePhone(recruiterPhone);
	}




	public int getRecruiterId() {
		return recruiterId;
	}

	



	@Override
	public int hashCode() {
		return Objects.hash(recruiterId);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Recruiter other = (Recruiter) obj;
		return recruiterId == other.recruiterId;
	}




	@Override
	public String toString() {
		return "Recruiter [recruiterId=" + recruiterId + ", recruiterName=" + recruiterName + ", recruiterEmail="
				+ recruiterEmail + ", recruiterPhone=" + recruiterPhone + "]";
	}




	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
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
	
	private String validatePhone(String phone) {

		Objects.requireNonNull(phone, "Phone cannot be null");

	    if (!phone.matches("^[6-9]\\d{9}$")) {
	        throw new IllegalArgumentException(
	            "Invalid phone number"
	        );
	    }

	    return phone;
	}
	
	private int validateId(int id) {
	    if (id <= 0) {
	        throw new IllegalArgumentException(
	            "Recruiter ID must be positive"
	        );
	    }
	    return id;
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
	
	
}
