package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		System.out.println("What is the value of n?");
		int n = in.nextInt();

		boolean [] sieve;
		sieve = new boolean [n];

		for (int i = 0; i < sieve.length; i++)
		{
			sieve [i] = true;
		}

		for (int i = 2; i < sieve.length; i++) {
			if (sieve [i] == true) {

				for (int x = 2; x < sieve.length; x++) {
					if (i * x < n) {
						sieve [i * x] = false;	
					}

				}
				System.out.println("The prime numbers are " + i);

			}
		}

	}
}
