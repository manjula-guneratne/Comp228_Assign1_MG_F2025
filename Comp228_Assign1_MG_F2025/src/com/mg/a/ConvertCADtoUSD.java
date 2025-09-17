package com.mg.a;

import java.util.Scanner;
import java.util.Currency;

public class ConvertCADtoUSD {
	
	public void CADtoUSD(Scanner scanner) {
		
		//Canadian currency instance
		Currency currencyCAD = Currency.getInstance("CAD");
		
		//American currency instance
		Currency currencyUSD = Currency.getInstance("USD");
		
		System.out.println("Enter the "+currencyCAD.getDisplayName()+"("+currencyCAD.getSymbol()+") amount: ");
		double cadValue = scanner.nextDouble();
		
		//Exchange rate
		double usdValue = 0.15 * cadValue;
		
		System.out.printf("The amount you'd recieve in "+currencyUSD.getDisplayName()+" is "+currencyUSD.getSymbol()+"%.2f %n",usdValue);
	}

}
