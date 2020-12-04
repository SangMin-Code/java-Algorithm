package com.algorithm.chap1;

import java.util.Scanner;

public class SumForPos {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		/*
		int n =0;		
		System.out.println("1부터 n까지의 합을 구합니다.");		
		do {
			System.out.println("n의 값");
			n = stdIn.nextInt();
		}while(n<=0);
		
		int sum = 0;
		for(int i=1; i<=n; i++)
		{
			sum+= i;
		}
		System.out.printf("1부터 %d 까지의 합은  %d 입니다 \n",n,sum);
		*/
		//q10(stdIn);
		q11(stdIn);
	}
	static void q10(Scanner stdIn) {
		
		int a =0;
		int b =0;
		
		System.out.print("a의 값 :");
		a = stdIn.nextInt();
		do {
			System.out.print("b의 값 :");
			b = stdIn.nextInt();
			if(b<a) System.out.println("a 보다 큰 값을 입력하세요!");
		}while(a>=b);
		System.out.printf("b-a 는 %d 입니다.",b-a);
	}
	
	static void q11(Scanner stdIn) {
		int a = 0;
		do {
			System.out.println("양의 정수를 입력하세요");
			a = stdIn.nextInt();
		}while(a<=0);
		
		String length = a+"";
		System.out.println("그 수는 "+length.length() +"자리 입니다.");
		
	}
}
