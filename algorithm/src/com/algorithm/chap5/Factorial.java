package com.algorithm.chap5;

import java.util.Scanner;

public class Factorial {

	static int factorial(int n) {
		if(n>0)  return n*factorial(n-1);
		else return 1;
	}
	static int factorial2(int n) {
		
		int a = 1;
		while(n>0) a= a*(n--);		
		return a;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int x = stdIn.nextInt();		
		//System.out.printf("%d 의 팩토리얼1은 %d 입니다.\n",x,factorial(x));
		System.out.printf("%d 의 팩토리얼2은 %d 입니다.\n",x,factorial2(x));
	}
}
