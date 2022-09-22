package ControlStructures;

import java.util.*;

/*
 * Write a program in Java to display the n terms of odd natural number
and their sum
*/

public class OddNaturalNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the num of terms");
		
		int x = s.nextInt();
		
		primeSum(x);
	}

	private static void primeSum(int x) {
		int sum = 0;
		for (int i = 1; i < 2*x; i++) {
			if (i%2 == 1) {
				sum = sum + i;
				System.out.println(i);
			}
		}
		System.out.println("Sum of prime num of "+ x + " terms is " + sum);
		
	}

}
