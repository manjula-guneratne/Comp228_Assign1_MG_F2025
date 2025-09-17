package com.mg.a;

import java.util.Scanner;

public class GradeCalculation {
	
	public void GradeCal(Scanner scanner) {		
		
		System.out.println("How many courses are you studying? ");
		int courseNumber = scanner.nextInt();
		
		int[] courseMark = new int[courseNumber];
		
		for(int i=0; i<courseNumber; i++) {
			System.out.println("What is the Mark you received for your cousrse No."+(i+1)+": ");
			courseMark[i] = scanner.nextInt();
		}
		
		System.out.print("Here are the Grade for each Course");
		for(int i=0; i<courseNumber; i++) {
			
			System.out.print("\nGrade for your "+(i+1)+" course is ");
			if (courseMark[i] >= 80) {
				System.out.print("A");
			} else if ((courseMark[i] <80) && (courseMark[i] >=60)) {
				System.out.print("B");
			} else if ((courseMark[i] <60) && (courseMark[i] >=40)) {
				System.out.print("C");
			} else {
				System.out.print("D");
			}
		}	
		
		System.out.print("\n\n");
	}
}
