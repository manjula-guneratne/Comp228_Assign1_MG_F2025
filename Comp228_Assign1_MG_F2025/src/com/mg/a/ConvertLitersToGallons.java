package com.mg.a;

import java.util.Scanner;

public class ConvertLitersToGallons {
	
	public void LitersToGallons(Scanner scanner) {		

		System.out.println("Enter the value in Liters:");
		double liters = scanner.nextDouble();

		double gallons = 0.2641720524 * liters;
		
		System.out.printf("The same value in Gallons is: %.2f %n%n",gallons);
	}
}
