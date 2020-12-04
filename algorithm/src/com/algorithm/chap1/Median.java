package com.algorithm.chap1;

import java.util.Scanner;

public class Median {
	static int med3(int a, int b, int c){
		if(a>=b)
		{
			if(b>=c)
			{
				return b;
			}
			else if(a<=c)
			{
				return a;
			}
			else
			{
				return c;
			}
		}
		else if(a>c)
		{
			return a;
		}
		else if(b>c)
		{
			return c;
		}
		else
		{
			return b;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		/*
		System.out.println("세 정수의 중앙값을 구합니다.");
		System.out.println("a의 값 :");
		int a = stdIn.nextInt();
		System.out.println("b의 값 :");
		int b = stdIn.nextInt();
		System.out.println("c의 값 :");
		int c = stdIn.nextInt();		
		System.out.println("중앙 값은 "+med3(a,b,c)+"입니다");
		*/
		
		//Q4
		System.out.println("med(3,2,1) = "+med3(3,2,1));
		System.out.println("med(3,2,2) = "+med3(3,2,2));
		System.out.println("med(3,1,2) = "+med3(3,1,2));
		System.out.println("med(3,2,3) = "+med3(3,2,3));
		System.out.println("med(2,1,3) = "+med3(2,1,3));
		System.out.println("med(3,3,2) = "+med3(3,3,2));
		System.out.println("med(3,3,3) = "+med3(3,3,3));
		System.out.println("med(2,2,3) = "+med3(2,2,3));
		System.out.println("med(2,3,1) = "+med3(2,3,1));
		System.out.println("med(1,3,2) = "+med3(1,3,2));
		System.out.println("med(2,3,3) = "+med3(2,3,3));
		System.out.println("med(1,2,3) = "+med3(1,2,3));
		System.out.println("med(2,3,2) = "+med3(2,3,2));
	}
}
