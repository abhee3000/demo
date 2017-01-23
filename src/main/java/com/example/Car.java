package com.example;

import java.time.Year;

public class Car {
    private int id;
    private String model;
    private Year yearOfMake;
    private String trim;
    private String color;
    private boolean reversingCamera;
    private long price;
	
    
    public Car(int id, String model, Year yearOfMake, String trim, String color, boolean reversingCamera,
			long price) {
		this.id = id;
		this.model = model;
		this.yearOfMake = yearOfMake;
		this.trim = trim;
		this.color = color;
		this.reversingCamera = reversingCamera;
		this.price = price;
	}


	public int getId() {
		return id;
	}


	public String getModel() {
		return model;
	}


	public Year getYearOfMake() {
		return yearOfMake;
	}


	public String getTrim() {
		return trim;
	}


	public String getColor() {
		return color;
	}


	public boolean isReversingCamera() {
		return reversingCamera;
	}


	public long getPrice() {
		return price;
	}
    
    
    
}
