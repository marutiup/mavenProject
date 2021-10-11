package com.sriram.Maven_demo;

import java.util.Scanner;

public class Java_practics01 {
	static {
		System.out.println
		("Housing Loan EMI and Education Loan EMI should be considered and can be deducted from salary before calculating tax ");
	}
	
	public void tax() {

		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Enter your annul Salary");
		a=sc.nextInt();
		if(a>=1000000) {
			double b=(a*0.30);
			
			System.out.println("You have to pay 30% of your income is:   "+ b);
		}
		else if(a>=500000) {
			double c=(a*0.20);
			System.out.println("You have to pay 20% of your income is :   "+c);
		}
		else{
			double d=(a*0.05);
			System.out.println("You have to pay 5 % of your income is    "+d);
			
		}
		
	}
	
	public static void main(String[] args) {
		Java_practics01 ob=new Java_practics01();
	ob.tax();
		
	}

}
