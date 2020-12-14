package com.algorithm.chap6;

import java.util.Scanner;

public class ShellSort {

	static void shellSort(int[]a, int n) {
	
		int cnt =0;
		for(int h = n/2; h>0; h/=2)
		{
			for( int i = h; i<n; i++)
			{
				int j;
				int tmp = a[i];
				for(j=i-h; j>=0 && a[j]>tmp; j-=h)
				{
					a[j+h] = a[j];
					cnt++;
				}
				a[j+h]=tmp;
			}
		}
		System.out.printf("Shellsort cnt : %d\n",cnt);
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("셀 정렬(버전1)");
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
	}
	
}
