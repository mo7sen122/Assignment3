package myNumbers;
import java.util.Scanner;


public class MyNumbers {

	
	private static Scanner value1;//print_Largest value
	private static Scanner value2;//print_Largest value
	private static Scanner value3;//print_Largest value
	
	private static Scanner value4;//ternary value

	private static Scanner value5;//coinToss vakue
	
	
	//Number 1
	public static void Reverse(int number) { 
       
		int reversed =0;
		
		while(number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
	}

	
	//Number 2
	public static void asterisks() { 
		
		for (int counter = 0;counter<500;counter++) { //print 500 asterisks
			
			System.out.print("*");
		}
		System.out.println();
	}
	
	
	//Number 3
	public static void ternary() {
		
		System.out.print("Please enter your number to compare ");

		value4 = new Scanner(System.in);
		
		int number = value4.nextInt();

		
		if(number > 10) {
			System.out.println("Number is greater than 10");
		}
		else {
			System.out.println("Number is less than or equal to 10");
		}
		
		System.out.println(number > 10 ? "Number is greater than 10 using ternary Operator" : "Number is less than or equal to 10 using ternary Operator");
		System.out.println();
	}
	
	
	//Number 4
	public static void print_Largest() {
		
		System.out.println("Please enter 3 different numbers to find the largest of them ");
		value1 = new Scanner(System.in);
		int first_Num = value1.nextInt();
		value2 = new Scanner(System.in);
		int second_Num = value2.nextInt();
		value3 = new Scanner(System.in);
		int third_Num = value3.nextInt();
		
		if (first_Num >=second_Num && first_Num >=third_Num ) {
			System.out.println("the largest number is "+first_Num);
		}else if( second_Num >= first_Num &&  second_Num >=third_Num) {
			System.out.println("the largest number is "+second_Num);
		}else if(third_Num >= first_Num && third_Num >= second_Num) {
			System.out.println("the largest number is "+third_Num);
		}	
	}
	
	
	//Number 5
	public static void coinToss() {
		int counter = 0;
		System.out.println("Please enter tosses number");
		value5 = new Scanner(System.in);
		int tosses_Num = value5.nextInt();
		while (counter < tosses_Num ) {
		if (Math.random() < 0.5){
			System.out.println("Heads");
			}else{
			System.out.println("Tails");
			}
		counter++;
		}
	}
	
}

