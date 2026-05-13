package com.example.petstore.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @Column(name = "user_id")
    @JsonIgnore
    private String userId; // Standard numeric ID

    private String username;

    @Column(name = "phone_number", unique = true, nullable = false)
    @Pattern(
            regexp = "^[6-9]\\d{9}$",
            message = "Phone number must start with 6-9 and be exactly 10 digits long"
    )
    private String phoneNumber;

    private String email;
    private String gender; // Male, Female, Other

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dob; // Date of Birth

    @Column(name = "vendor_id")
    private String vendorId;

    @Transient
    private String otp; // For verification only, not in DB

    @Lob
    @Column(columnDefinition = "LONGTEXT")
    private String profileImg;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public String getProfileImg() {
		return profileImg;
	}

	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}
    
    

    }