package Conditions;

import java.util.Scanner;

public class IfElseifElse {

	public static void main(String[] args) {
		 
		System.out.println("What is the light color?");
		Scanner ui= new Scanner(System.in);
		String color = ui.nextLine();
	    
		if(color.equalsIgnoreCase("red")) {
			System.out.println("Stop the car!");
			
		}
		
		else if(color.equalsIgnoreCase("yellow")) {
			System.out.println("Slow the car!");
		}
		
		else if(color.equalsIgnoreCase("green")) {
			System.out.println("Keep driving!");
		}
		
		else if(color.contains("e")) {
			System.out.println("hi5");
		}
		
		else {
			System.out.println("Wrong traffic color");
		}
		
		System.out.println("end code");

	}

}

