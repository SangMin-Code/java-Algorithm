package com.algorithm.chap5;

import java.util.Scanner;

public class EuclidGCD {

	static int gcd(int x, int y) {
		if(y==0) return x;
		else return gcd(y,x%y);
	}
	
	static int gcd2(int x , int y) {
		while(y !=0) {
			int t =x;
			x=y;
			y = t%y;
		}
		return x;		
	}
	static int q3(int[] a) {
		
		if(a.length<2) 
		{
			System.out.println("배열이 너무 작습니다.");
			return -1;
		}		
		int gcd = gcd(a[0],a[1]); 
		for(int i=1; i <a.length; i++ ) {
				gcd = gcd(gcd,a[i]);
		}			
		return gcd;
	}
	public static void main(String[] args) {
		/*
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("두 정수의 최대공약수를 구합니다.");
		
		System.out.println("정수를 입력하세요 :"); int x = stdIn.nextInt();
		System.out.println("정수를 입력하세요 :"); int y = stdIn.nextInt();
		System.out.printf("최대공약수1는 %d 입니다.\n",gcd(x,y));
		System.out.printf("최대공약수2는 %d 입니다.\n",gcd2(x,y));
		*/
		
		int [] a = {6,6,54,12,30};
		System.out.printf("%d",q3(a));
	}
}
