package com.algorithm.chap1;

import java.util.Scanner;

public class TriangleLB {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = 5;
		
		/*
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		
		do {
			System.out.println("몇 단 삼각형입니까?");
			n = stdIn.nextInt();
		}while(n<=0);
		*/
		
		/*
		for(int i = 1; i<=n; i++)
		{
			for (int j=1 ; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		npira(n);
	}
	//왼쪽 아래가 직각인 이등변 삼각형
	static void triangleLB(int n)
	{
		for(int i = 1; i<=n; i++)
		{
			for (int j=1 ; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//왼쪽 위가 직각인 이등변 삼각형
	static void triangleLU(int n)
	{
		for(int i =1; i<=n; i++)
		{
			for(int j=1; j<=n+1-i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//오른쪽 위가 직각인 이등변 삼각형
	static void triangleRU(int n)
	{
		for(int i =1; i<=n; i++)
		{
			for(int j =1; j<=i-1; j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1; j<=n+1-i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//오른쪽 아래가 직각인 이등변 삼각형
	static void triangleRB(int n)
	{
		for(int i =1; i<=n; i++)
		{
			for(int j =1; j<=n-i; j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void spira(int n) {
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n-i; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void npira(int n) {
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n-i; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
