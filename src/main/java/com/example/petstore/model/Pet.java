package com.example.petstore.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pets")
@Data 
public class Pet {

    @Id
    private String id;

    @Column(name = "vendor_id")
    private String vendorId;

    private String category;

    private String breed;

    // ✨ FIX: Ensures it maps to your 'color' DB column
    @Column(name = "color")
    private String color;

    private String dob;

    private Double price;

    private String quantity;

    @Column(name = "male_quantity")
    private String maleQuantity;

    @Column(name = "female_quantity")
    private String femaleQuantity;

    // Notice how these match the camelCase in your screenshot!
    @Column(name = "isVaccinated")
    private String isVaccinated;

    @Column(name = "vaccinationDose")
    private String vaccinationDose;

    // ✨ FIX: Changed back from 'bio' to 'description'
    @Column(columnDefinition = "TEXT", name = "description")
    private String description;

    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private byte[] image;

    @Transient
    private String vendorName;

    @OneToMany(mappedBy = "pet", cascade = CascadeType.ALL)
    private List<PetImage> images = new ArrayList<>();

    @Column(name = "discount_percentage")
    private Integer discountPercentage = 0; // Default to 0%

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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getMaleQuantity() {
		return maleQuantity;
	}

	public void setMaleQuantity(String maleQuantity) {
		this.maleQuantity = maleQuantity;
	}

	public String getFemaleQuantity() {
		return femaleQuantity;
	}

	public void setFemaleQuantity(String femaleQuantity) {
		this.femaleQuantity = femaleQuantity;
	}

	public String getIsVaccinated() {
		return isVaccinated;
	}

	public void setIsVaccinated(String isVaccinated) {
		this.isVaccinated = isVaccinated;
	}

	public String getVaccinationDose() {
		return vaccinationDose;
	}

	public void setVaccinationDose(String vaccinationDose) {
		this.vaccinationDose = vaccinationDose;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public List<PetImage> getImages() {
		return images;
	}

	public void setImages(List<PetImage> images) {
		this.images = images;
	}

	public Integer getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(Integer discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
    
    
    
}