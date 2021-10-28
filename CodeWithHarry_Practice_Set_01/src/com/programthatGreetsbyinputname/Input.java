package com.programthatGreetsbyinputname;

import java.util.Scanner;

public class Input {
	public void input() {
		Scanner scanner=new Scanner(System.in);
		String name=scanner.nextLine();
		System.out.println("Hii "+name+" Good Morning");
		
	}
	public String input_Using_Return_type(String name) {
		System.out.println();
		System.out.println("Hii "+name+" Good Morning");
		return name;
		
	}

}
