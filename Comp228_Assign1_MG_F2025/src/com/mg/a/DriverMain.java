package com.mg.a;

import java.util.Scanner;

public class DriverMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		GradeCalculation gc = new GradeCalculation();
		System.out.println("Grade calculation - Part(a)");
		gc.GradeCal(scanner);
		
		ConvertMilesToKm mk = new ConvertMilesToKm();
		System.out.println("Converting Miles to Kilometers - Part(b)");
		mk.MilesToKm(scanner);
		
		scanner.close();
	}

}
