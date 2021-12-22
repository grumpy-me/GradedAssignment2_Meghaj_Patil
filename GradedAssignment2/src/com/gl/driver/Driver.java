package com.gl.driver;

import java.util.Scanner;

import com.gl.logic.Logic;

public class Driver {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in) ;
		
		System.out.println("enter the no of companies");
		int numberOfCompanies = scanner.nextInt();
		
		int[] stockPrices = new int[numberOfCompanies];
		boolean[] stockStatus = new boolean[numberOfCompanies] ;
		
		for (int i = 0; i < numberOfCompanies; i++) {
			System.out.println("Enter the stock price of Company " + (i+1)) ;
			stockPrices[i] = scanner.nextInt();
			System.out.println("Whether company's stock price rose today compare to yesterday?") ;
			stockStatus[i] = scanner.nextBoolean();
		}
		
		presentQuesionnaire() ;
		
		Logic logic = new Logic(stockPrices, stockStatus);
		logic.processRequest(scanner.nextInt());
		
	}
	
	static void presentQuesionnaire() {
		System.out.println("\n Enter the operation that you want to perform\n"
				+ "1. Display the companies stock prices in ascending order\n"
				+ "2. Display the companies stock prices in descending order\n"
				+ "3. Display the total no of companies for which stock prices rose today\n"
				+ "4. Display the total no of companies for which stock prices declined today\n"
				+ "5. Search a specific stock price\n"
				+ "6. press 0 to exit") ;
	}

}
