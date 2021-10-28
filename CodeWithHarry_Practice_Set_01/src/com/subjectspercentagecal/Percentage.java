package com.subjectspercentagecal;

public class Percentage {
	String name;
	float Subject1;
	float Subject2;
	float Subject3;
	float Subject4;
	float Subject5;
	
	public float Date(float Subject1,float Subject2,float Subject3,float Subject4,float Subject5) {
		//this.name= name;
		this.Subject1= Subject1;
		this.Subject2= Subject2;
		this.Subject3= Subject3;
		this.Subject4= Subject4;
		this.Subject5= Subject5;
		
		float percentage= Subject1+ Subject2+ Subject3+ Subject4+ Subject5;
		
		return percentage;
	}

}
