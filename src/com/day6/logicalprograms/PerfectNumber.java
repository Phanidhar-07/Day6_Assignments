package com.day6.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int sum = 0;

		System.out.println("Enter a Number: ");
		int n = scan.nextInt();

		for (int i = 1; i < n; i++) 
		{
			if (n % i == 0) 
			{
				sum += i;
			}
		}

		if (sum == n) 
		{
			System.out.println(n + " is a Perfect Number");
		}
		else 
		{
			System.out.println(n + " is not a Perfect Number");
		}
	}
}
