package com.day6.logicalprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int rem, rev = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Number to reverse: ");
		int num = scan.nextInt();

		while (num != 0) 
		{
			rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;
		}

		System.out.println("Reverse of the Number is: " + rev);
	}
}
