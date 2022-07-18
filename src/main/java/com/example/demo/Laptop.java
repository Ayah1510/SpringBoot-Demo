package com.example.demo;

import org.springframework.stereotype.Component;

//needs to be written (@Component); to prevent null pointer exception when calling it in the Alien class

@Component
public class Laptop {
	
	private int lid;
	private String brand;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + "]";
	}
	
	public void compile(){
		System.out.println("Compiling..");
	}
}
