package com.subjectspercentagecal;

public class Main {
	public static void main(String[] args) {
		PercentageCal percentageCal=new PercentageCal();
		float total=percentageCal.data(55,60, 70, 80, 90);
		String name=percentageCal.stdDetails("sampath");
		System.out.println("Name = "+name+" \nmarks = "+total);
		UsingScanner usingScanner=new UsingScanner();
		usingScanner.classdatainput();
		
	}

}
