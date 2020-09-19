package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double bill=0;
		double paid=0;
		double change=0;
		
		System.out.println("Please enter the amount of the bill: ");
		bill=input.nextDouble();
		System.out.println("Please enter the amount  tendered: ");
		paid=input.nextDouble();
		change=bill-paid;
		System.out.println("Change: $"+ change);

	}

}
