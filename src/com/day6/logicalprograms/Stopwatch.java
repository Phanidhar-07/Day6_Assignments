package com.day6.logicalprograms;

import java.util.Scanner;

class Measure {
	long start_Time = 0;
	long end_Time = 0;
	long elapsed_Time = 0;

	void start() {
		start_Time = System.currentTimeMillis();
		System.out.println("Start Time of Stopwatch is: " + start_Time);
	}

	void end() {
		end_Time = System.currentTimeMillis();
		System.out.println("End Time of Stopwatch is: " + end_Time);
	}

	long elapsedTime() {
		elapsed_Time = end_Time - start_Time;
		return elapsed_Time;
	}
}

public class Stopwatch {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		Measure m = new Measure();

		System.out.println("click any number to Start the Stopwatch");
		int s = scan.nextInt();
		m.start();

		System.out.println();

		System.out.println("click any number to End the Stopwatch");
		int e = scan.nextInt();
		m.end();

		System.out.println();

		System.out.println("The elapsed Time of Stopwatch is: " + m.elapsedTime() + " millseconds");
	}
}
