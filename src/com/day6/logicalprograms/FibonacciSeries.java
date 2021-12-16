package com.day6.logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int f1 = 0, f2 = 1, k;

		System.out.println("Enter the number: ");
		int n = scan.nextInt();

		for (int i = 0; i <= n; i++) 
		{
			k = f1 + f2;
			f1 = f2;
			f2 = k;
			System.out.println(k);
		}
	}
}
