package com.example.petstore.dto; // Or put it in your model package

import com.example.petstore.model.Pet;
import lombok.Data;
import java.util.List;

@Data
public class DashboardResponse {
    private List<Pet> justArrived;
    private List<Pet> bestSelling;
    private List<Pet> popular;
	public List<Pet> getJustArrived() {
		return justArrived;
	}
	public void setJustArrived(List<Pet> justArrived) {
		this.justArrived = justArrived;
	}
	public List<Pet> getBestSelling() {
		return bestSelling;
	}
	public void setBestSelling(List<Pet> bestSelling) {
		this.bestSelling = bestSelling;
	}
	public List<Pet> getPopular() {
		return popular;
	}
	public void setPopular(List<Pet> popular) {
		this.popular = popular;
	}
    
    
}