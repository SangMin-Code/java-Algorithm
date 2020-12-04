package com.algorithm.chap1;

import java.util.Scanner;

public class SumWhile {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		/*
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값");
		int n = stdIn.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i<=n)
		{
			sum +=i;
			if(i++==n) System.out.println("i :" + i);
			
		}
		System.out.println("1부터 "+n + "까지의 합은 "+sum+" 입니다.");
		*/
		System.out.println("a부터 b까지의 합을 구합니다.");
		System.out.println("a의 값");
		int a = stdIn.nextInt();
		System.out.println("b의 값");
		int b = stdIn.nextInt();
		
		q9(a,b);
	}
	
	static void q7 (int n) {
		
		int sum = 0;
		
		for(int i=1; i<=n; i++)
		{
			sum +=i;
			if(i<n)
			{
				System.out.printf("%d + ",i);
			}
			else
			{
				System.out.printf("%d = %d",i,sum);
			}
		}
	}
	
	static void q8(int n) {
		int sum = n*(n+1)/2;
		System.out.printf("SUM : %d \n",sum);
		
	}
	
	static void q9(int a, int b) {
		int max = a;
		int min = b;
		int sum = 0;
		if(min>max)
		{
			max = b;
			min = a;
		}
	
		
		for(int i = min; i<=max; i++)
		{
			sum += i;
		}
		
		//sum = (max-min+1)*(max+min)/2;
		System.out.printf("SUM : %d \n",sum);
		
	}
}
