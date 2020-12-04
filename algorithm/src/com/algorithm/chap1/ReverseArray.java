package com.algorithm.chap1;

import java.util.Scanner;

public class ReverseArray {

	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=t;		
	}
	static void reverse(int[] a) {
		for(int i=0; i<a.length/2; i++)
		{
			swap(a,i,a.length-1-i);
		}
	}
	static void reversePrint(int[] a) {
		for(int i=0; i<a.length/2; i++)
		{
			listPrint(a);
			System.out.printf("a[%d]과(와) a[%d]를 교환합니다.\n",i,a.length-i-1);
			swap(a,i,a.length-1-i);
		}
	}
	static void listPrint(int[] a) {
		for(int i=0; i<a.length; i++)
		{
			System.out.printf("%3d",a[i]);
		}
		System.out.println();
	}
	static int sumOf(int[] a) {
		int sum =0;
		for(int i =0; i<a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("요솟수 :");
		int num = stdIn.nextInt();
		
		int[]x = new int[num];
		
		for(int i = 0; i<num; i++) {
			System.out.printf("x[%d] : ",i);
			x[i]=stdIn.nextInt();
		}
		//reverse(x);
		
		reversePrint(x);
		listPrint(x);
		System.out.println("역순 정렬을 마쳤습니다.");
		System.out.printf("요소 합계 : %d", sumOf(x));
		/*
		System.out.println("요소를 역순으로 정렬했습니다.");
		for(int i =0; i<num; i++) {
			System.out.printf("x[%d] = %d\n",i,x[i]);
		}
		*/			
		
	}
}
