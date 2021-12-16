package com.day6.logicalprograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// NOTE: To check whether prime or not we should initialize for loop with 2 and
		// condition less than(<) the number

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Number: ");
		int num = scan.nextInt();

		boolean flag = true;

		for (int i = 2; i < num; i++) 
		{
			if (num % i == 0) 
			{
				flag = false;
			}
		}

		if (flag == true) 
		{
			System.out.println(num + " is a Prime Number");
		}

		else 
		{
			System.out.println(num + " is not a Prime Number");
		}
	}
}
