package com.subjectspercentagecal;

import java.util.Scanner;

public class UsingScanner {
	
	public void classdatainput() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your name");
		String str=scanner.nextLine();
		float subject1=scanner.nextFloat();
		float subject2=scanner.nextFloat();
		float subject3=scanner.nextFloat();
		float subject4=scanner.nextFloat();
		float subject5=scanner.nextFloat();
		scanner.close();
		
		float totalMarks =(subject1+subject2+subject3+subject4+subject5)*500.0f/100;
		System.out.println("Name = "+str+" \nTotal marks = "+totalMarks);
	}

}
