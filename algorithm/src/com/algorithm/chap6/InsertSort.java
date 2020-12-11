package com.algorithm.chap6;

import java.util.Scanner;

public class InsertSort {
	static void insertionSrot(int[] a, int n) {
		for(int i=1; i<n; i++)
		{
			int j;
			int tmp = a[i];
			for(j=i; j>0 && a[j-1]>tmp; j--) a[j] =a[j-1];
			a[j]=tmp;
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("단순 삽입 정렬");
		System.out.println("요솟수 :");
		int nx = stdIn.nextInt();
		int[]x = new int[nx];
		
		for(int i=0; i<nx; i++) {
			System.out.printf("x[%d] :",i);
			x[i] = stdIn.nextInt();
		}
		insertionSrot(x, nx);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0; i<nx; i++) System.out.printf("x[%d] = %d\n",i,x[i]);
	}
}
