package com.programe_to_Kilometers_to_miles;

import java.util.Scanner;

public class Kilometers_to_miles {
	public double convert(double kilometers) {
		return kilometers*0.621371;
	}

	
	
	public void convert1() {
		System.out.println("Enter no of kilometers");
		Scanner scanner=new Scanner(System.in);
		double kilometers=scanner.nextDouble();
		double miles=kilometers*0.621371;
		System.out.println(miles);
	
	}

}
