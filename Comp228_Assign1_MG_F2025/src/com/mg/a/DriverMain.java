package com.mg.a;

import java.util.Scanner;

public class DriverMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		GradeCalculation gc = new GradeCalculation();
		System.out.println("Grade calculation - Part(a)");
		//gc.GradeCal(scanner);
		
		ConvertMilesToKm mk = new ConvertMilesToKm();
		System.out.println("Converting Miles to Kilometers - Part(b)");
		//mk.MilesToKm(scanner);
		
		ConvertLitersToGallons lg = new ConvertLitersToGallons();
		System.out.println("Converting Miles to Kilometers - Part(c)");
		//lg.LitersToGallons(scanner);
		
		ConvertCADtoUSD cu = new ConvertCADtoUSD();
		System.out.println("Converting CAD to USD - Part(d)");
		cu.CADtoUSD(scanner);
		
		scanner.close();
	}

}
