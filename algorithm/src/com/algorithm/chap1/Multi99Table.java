package com.algorithm.chap1;

import java.util.Scanner;

public class Multi99Table {
	public static void main(String[] args) {
		
		//System.out.println("----곱셈표-----");
		/*
		for(int i=1; i <=9; i++)
		{
			for(int j=1; j<=9; j++)
			{
				System.out.printf("%3d",i*j);
			}
			System.out.println();
		}
		*/
		q14(); 
		
	}
	static void q12()
	{
		System.out.printf("   |%3d%3d%3d%3d%3d%3d%3d%3d%3d\n",1,2,3,4,5,6,7,8,9);
		System.out.printf("---+---------------------------\n");
		for(int i = 1 ; i<=9; i++)
		{
			System.out.printf("%3d|",i);
			for(int j=1; j<=9; j++)
			{
				System.out.printf("%3d",i*j);
			}
			System.out.println();
		}
	}
	static void q13()
	{
		System.out.printf("   |%3d%3d%3d%3d%3d%3d%3d%3d%3d\n",1,2,3,4,5,6,7,8,9);
		System.out.printf("---+---------------------------\n");
		for(int i = 1 ; i<=9; i++)
		{
			System.out.printf("%3d|",i);
			for(int j=1; j<=9; j++)
			{
				System.out.printf("%3d",i+j);
			}
			System.out.println();
		}
	}
	static void q14()
	{
		Scanner stdIn = new Scanner(System.in);
		System.out.println("사각형을 출력합니다.");
		System.out.println("단 수 :");
		int n = stdIn.nextInt();
		
		for(int i = 0; i <n; i++) {
			for (int j =0; j<n; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
