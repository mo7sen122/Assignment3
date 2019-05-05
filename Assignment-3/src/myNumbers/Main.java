package myNumbers;

import java.util.Scanner;

public class Main {

	private static Scanner value;

	public static void main(String[] args) {
		
		System.out.print("Please enter number which you want to reverse it: ");
		value = new Scanner(System.in);
		int num = value.nextInt();
		
		
		MyNumbers.Reverse(num);
		MyNumbers.asterisks();
		MyNumbers.ternary();
		MyNumbers.print_Largest();
		MyNumbers.coinToss();
	}

}
