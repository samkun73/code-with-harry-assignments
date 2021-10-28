package com.programe_to_Kilometers_to_miles;

public class Main {
	public static void main(String[] args) {
		Kilometers_to_miles kilometers_to_miles=new Kilometers_to_miles();
		double total_miles =kilometers_to_miles.convert(500);
		System.out.println("Total miles "+total_miles);
		kilometers_to_miles.convert1();
		
		
	}

}
