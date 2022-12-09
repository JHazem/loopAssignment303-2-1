package com.perscholas;

import java.util.Scanner;

public class LoopsAssignment {

	public static void main(String[] args) {
			
		/*
		 * Question 1: Print a Multiplication Table
			Write a program that uses nested for loops to print a multiplication table.	*/
		
		int x;
		for(int i = 1; i <= 12; i++) {
			for(int j=1; j<= 12; j++) {
				x = i * j;
				System.out.print(x + " ");
				
			}//inner loop
			
			System.out.println(); // to move to next line

		}
				
		
			/*
		  	Question 2: Find the Greatest Common Divisor
			 
			❑ Write a program that prompts the user to enter two positive integers, and find their greatest common divisor (GCD).
			❑ Examples:
				➢ Enter2and4.Thegcdis2.
				➢ Enter 16 and 24. The gcd is 8.
			❑ How do you find the gcd?
				➢ Name the two input integers n1 and n2.
				➢ You know number 1 is a common divisor, but it may not be the gcd.
				➢ Check whether k (for k = 2, 3, 4, and so on) is a common divisor for
			n1 and n2, until k is greater than n1 or n2.
			 */
							
				Scanner num = new Scanner(System.in);
				System.out.print("Enter first number : ");
				int  a = num.nextInt(); 
				System.out.print("Enter second number : ");
				int  b = num.nextInt(); 
				
				int max, min;
				int gcd = 1;
				if(a < b) {
					min = a;
					max = b;
				}else {
					min = a; 
					max = b;
				}// if
				
				for(int i = 2; i < min; i++) {
					if(max % i == 0 && min % i == 0) {
						gcd = i;
					}
					
				}//for loop
				
				System.out.println("GCD = " + gcd);
	

	/*
	 Question 3: Predict Future Tuition
		❑ Suppose the tuition for a university is $10,000 for the current year 
		  and increases by 7 percent every year.
		❑ In how many years will the tuition be doubled?
	 */
 
		double tuition = 10000;
		int year = 0;
		
			while (tuition < 20000) { 
			tuition += tuition * 0.07;
			year++;
			}
			System.out.println("The cost of tuition will be doubled $"  + (int)tuition + " after  years " +year);
		}	

}
