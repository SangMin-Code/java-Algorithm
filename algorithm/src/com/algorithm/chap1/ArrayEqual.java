package com.algorithm.chap1;

import java.util.Scanner;

public class ArrayEqual {

	static boolean equals(int[] a ,int[] b) {
		if(a.length != b.length)
		{
			return false;
		}
		for(int i =0; i<a.length; i++)
		{
			if(a[i]!=b[i]) return false;
		}
		return true;
	}
	
	static void copy(int[] a, int[] b) {
		//배열 b의 모든 요소를 배열 a에 복사
		
		if(a.length < b.length) {
			System.out.println("배열의 길이가 부족합니다.");
			return;
		}
		
		for(int i=0; i< b.length; i++) {
			a[i] = b[i];
		}
	}
	static void rcopy(int[] a, int[] b) {
		//배열 b의 모든 요소를 배열 a에 역순으로 복사
		
		if(a.length < b.length) {
			System.out.println("배열의 길이가 부족합니다.");
			return;
		}
		
		for(int i=0; i< b.length; i++) {
			a[i] = b[b.length-i-1];
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("배열 a의 요솟수: ");
		int na = stdIn.nextInt();
		
		int[]a = new int[na];
		
		for(int i=0; i<na; i++)
		{
			System.out.printf("a[%d] :",i);
			a[i] = stdIn.nextInt();
		}

		System.out.println("배열 b의 요솟수: ");
		int nb = stdIn.nextInt();
		
		int[]b = new int[nb];
		
		for(int i=0; i<nb; i++)
		{
			System.out.printf("a[%d] :",i);
			b[i] = stdIn.nextInt();
		}
		
		//System.out.printf("배열 a와 b는 %s", equals(a,b) ? "같습니다." : "같지 않습니다");
		System.out.println("copy 전");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+",");
		}
		System.out.println();
		rcopy(a,b);
		System.out.println("copy 후");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+",");
		}
	}
	
}
