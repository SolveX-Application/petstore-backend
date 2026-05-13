package com.example.petstore.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "promo_banners")
@Data
public class PromoBanner {

    @Id
    private String id;

    @Column(name = "vendor_id")
    private String vendorId;

    private Integer discount;

    @Column(columnDefinition = "TEXT")
    private String bio;

    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private byte[] image;

    // ✨ MUST HAVE THIS FOR CREATION TIMESTAMP
    @Column(name = "G_AUG_ADD_TS", updatable = false)
    private LocalDateTime createdDate;

    // ✨ MUST HAVE THIS FOR UPDATE TIMESTAMP
    @Column(name = "G_AUD_TS")
    private LocalDateTime updatedDate;

    // ✨ THIS METHOD IS CRITICAL: It runs right before saving a NEW ad
    @PrePersist
    protected void onCreate() {
        this.createdDate = LocalDateTime.now();
        this.updatedDate = LocalDateTime.now();
    }

    // ✨ THIS METHOD IS CRITICAL: It runs right before UPDATING an existing ad
    @PreUpdate
    protected void onUpdate() {
        this.updatedDate = LocalDateTime.now();
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}
    
    
    
}