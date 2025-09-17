package com.mg.a;

import java.util.Scanner;

public class ConvertMilesToKm {

	public void MilesToKm(Scanner scanner) {		

		System.out.println("Enter the value in Miles:");
		double miles = scanner.nextDouble();

		double km = 0.6214 * miles;
		
		System.out.printf("The same value in Kilometers is: %.2f %n%n",km);

		}
}
