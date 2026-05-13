package com.example.petstore.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_addresses")
@Data
public class UserAddress {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    @JsonIgnore
    private String addressId;

    @Column(name = "user_id") // Hibernate will automatically link to User's Primary Key
    private String userId;
    @Column(name = "full_name")
    private String fullName;
    private String mobile;
    @Column(name = "alt_mobile")
    private String altMobile;
    @Column(name = "house_details")
    private String houseDetails;
    @Column(name = "area_locality")
    private String areaLocality;
    @Column(name = "pincode")
    private String pincode;
    @Column(name = "city")
    private String city = "Hyderabad"; //
    @Column(name = "address_type")
    private String addressType;

    @Column(name = "begin_date", updatable = false)
    private LocalDate beginDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    // Hibernate will auto-fill this on creation and NEVER let it update
    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    // Hibernate will auto-update this every time the row changes
    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @PrePersist
    public void prePersist() {
        if (this.beginDate == null) {
            this.beginDate = LocalDate.now(); // Sets to today's date
        }
        if (this.endDate == null) {
            this.endDate = LocalDate.of(9999, 12, 31); // Sets to 31-Dec-9999
        }
    }

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAltMobile() {
		return altMobile;
	}

	public void setAltMobile(String altMobile) {
		this.altMobile = altMobile;
	}

	public String getHouseDetails() {
		return houseDetails;
	}

	public void setHouseDetails(String houseDetails) {
		this.houseDetails = houseDetails;
	}

	public String getAreaLocality() {
		return areaLocality;
	}

	public void setAreaLocality(String areaLocality) {
		this.areaLocality = areaLocality;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public LocalDate getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(LocalDate beginDate) {
		this.beginDate = beginDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
    
    
    
}
