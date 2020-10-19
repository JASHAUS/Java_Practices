package com.main;

//inheritance concept

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int select;
		Scanner scan = new Scanner(System.in);
		System.out.println("Select the Card");
		System.out.println("1.PaybackCard\n2.MembershipCard\n");
		select = scan.nextInt();
		switch (select) {
		case 1:
			System.out.println("Enter the Card Details");
			PaybackCard pbc = new PaybackCard("usha", "12323", "14/01/1001", 1000, 2000.00);
			String card = pbc.getCardNumber();
			String name = pbc.getHolderName();
			String date = pbc.getExpiryDate();
			System.out.println("Enter the points in card ");
			int point = pbc.getPointsEarned();
			System.out.println("Enter the amount :");

			Double amnt = pbc.getTotalAmount();
			System.out.println(name + " Payback card Details:");
			System.out.println("Card Number : " + card);
			System.out.println("Points Earned :" + point);
			System.out.println("Total Amount :" + amnt);

		}
	}
}
