package com.algorithm.chap6;

import java.util.Scanner;

public class ShellSort2 {
	
	static void shellSort(int[] a , int n) {
		int h;
		for(h=1; h<n/9; h=h*3+1)
			;
		
		int cnt =0;
		for(; h>0; h/=3)
		{
			for(int i = h; i<n; i++)
			{
				int j;
				int tmp = a[i];
				for(j=i-h; j>=0 && a[j]>tmp; j--)
				{
					a[j+h]=a[j];
					cnt++;
				}
				a[j+h]=tmp;
			}
		}
		System.out.printf("ShellSort2 cnt : %d\n",cnt);
	}
	
	public static void main(String[] args) {
	/*
		Scanner stdIn = new Scanner(System.in);
		System.out.println("셀 정렬(버전2)");
		System.out.print("요솟수 :");
		int nx = stdIn.nextInt();
		int[]x = new int[nx];
		
		for(int i=0; i<nx; i++)
		{
			System.out.printf("x[%d] :",i);
			x[i] = stdIn.nextInt();
		}
		shellSort(x, nx);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0; i<nx; i++) System.out.printf("x[%d] = %d\n",i,x[i]);
	*/
		int[]x = {22,5,11,32,120,68,70,3,1,6,99,47,98,40,123,45};
		int[]y = {22,5,11,32,120,68,70,3,1,6,99,47,98,40,123,45};
		int[]z = {22,5,11,32,120,68,70,3,1,6,99,47,98,40,123,45};
		int n = x.length;
		shellSort(x,n);
		ShellSort sort = new ShellSort();
		sort.shellSort(y, n);
		InsertSort sort2 = new InsertSort();
		sort2.insertionSrot(z, n);
		/* 45, 27, 15 ....? */
	}
}
