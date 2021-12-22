package com.gl.logic;

//import com.greatlearning.services.MergeSort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;  


public class Logic {
	
	private int[] stockPrices;
	private boolean[] stockStatus;
	
	public Logic(int[] stockPrices, boolean[] stockStatus) {
		this.stockPrices = stockPrices;
		this.stockStatus = stockStatus;
	}
	
	public void processRequest(int operation) {
		switch (operation) {
		case 1: stocksInAscending();
		case 2:	stocksInDescending();
		case 3: companiesForWhichStocksRose();
		case 4: companiesForWhichStocksFell();
		case 5: searchStock();
		default: System.out.println("Exited");
		}
	}
	
	private void stocksInAscending() {
		MergeSort mergeSort = new MergeSort() ;
		mergeSort.sort(stockPrices, 0, stockPrices.length - 1) ;
		reverse(stockPrices, stockPrices.length) ;
		System.out.println("Stock prices in ascending order are :\n") ;
		System.out.println(Arrays.toString(stockPrices));  
	}
	
	private void stocksInDescending() {
		MergeSort mergeSort = new MergeSort() ;
		mergeSort.sort(stockPrices, 0, stockPrices.length - 1) ;
		System.out.println("Stock prices in descending order are :\n") ;
		System.out.println(Arrays.toString(stockPrices));  
	}
	
	private void companiesForWhichStocksRose() {
		int stockRoseCompanies = 0 ;
		for (int i = 0; i < stockStatus.length; i++) {
			if (stockStatus[i] == true) {
				stockRoseCompanies++ ;
			}
		}
		System.out.println("Total no of companies whose stock price rose today : " + stockRoseCompanies) ;
	}
	
	private void companiesForWhichStocksFell() {
		int stockFellCompanies = 0 ;
		for (int i = 0; i < stockStatus.length; i++) {
			if (stockStatus[i] == false) {
				stockFellCompanies++ ;
			}
		}
		System.out.println("Total no of companies whose stock price fell today : " + stockFellCompanies) ;
	}

	private void searchStock() {
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("enter the key value") ;
		int value = scanner.nextInt();
		for(int i = 0 ; i < stockPrices.length; i ++) {
			if (stockPrices[i] == value) {
				System.out.println("Value present");
				return ;
			}
		}
		System.out.println("Value not found");
	}
	
	private void reverse(int a[], int n)
    {
        int i, k, t;
        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
    }
  
}
