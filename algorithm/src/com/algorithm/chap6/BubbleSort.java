package com.algorithm.chap6;

import java.util.Scanner;

public class BubbleSort {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2]=t;
	}
	
	static void bubbleSort(int[] a, int n) {
		int c = 0; //비교
		int e = 0; //교환
		
		for(int i=0; i<n-1; i++)
		{
			//패스 중 교환 횟수
			int exchg = 0;
			System.out.printf("패스 %d:\n",i+1);
			for(int j=n-1; j>i; j--)
			{	
				for(int k =0; k<j; k++ ) System.out.printf(" %2d",a[k]);				
				c++;				
				if(a[j-1]>a[j])
					{
						System.out.print("+");
						for(int k=j; k<n; k++) System.out.printf(" %2d",a[k]);
						swap(a, j-1, j);
						e++;
						exchg++;
					}
				else
					{
						System.out.printf("-"); 
						for(int k=j; k<n; k++) System.out.printf(" %2d",a[k]);
					}
				System.out.println();
			}
			for(int k=0; k<n; k++) System.out.printf("%3d",a[k]);
			System.out.println();
			if(exchg==0) break;
		}
		System.out.printf("비교를 %d회 했습니다.\n",c);
		System.out.printf("교환를 %d회 했습니다.\n",e);
	}
	static void bubbleSort2(int[] a, int n) {
		for( int i=0; i<n-1; i++)
		{
			for( int j=0; j<n-1-i; j++)
			{
				if(a[j]>a[j+1]) swap(a, j,j+1);
			}
		}
	}
	static void bubbleSort3(int[]a, int n) {
		int k =0;
		int c = 0; //비교
		int e = 0; //교환
		int pass =0;
		while(k<n-1) {
			int last = n-1;
			System.out.printf("패스 %d\n",++pass);
			for(int j=n-1; j>k; j--)
			{
				c++;
				for(int l=0; l<j; l++) System.out.printf("%3d",a[l]);
				if(a[j-1]>a[j])
				{
					System.out.print(" + ");
					for(int l=j; l<n; l++) System.out.printf("%3d",a[l]);
					e++;
					swap(a,j-1,j);
					last =j;
				}else
				{
					System.out.print(" - ");
					for(int l=j; l<n; l++) System.out.printf("%3d",a[l]);
				}					
				System.out.println();
			}
			for(int l=0; l<n; l++) System.out.printf("%3d",a[l]);
			System.out.println();
			k=last;
		}
		System.out.printf("비교를 %d회 했습니다",c);
		System.out.printf("교환를 %d회 했습니다",e);
	}
	
	static void bubbleSort4(int[]a, int n) {
		int left = 0;
		int right = n - 1;
		int last = right;
		int c= 0;
		int e = 0;
		while (left < right) {
			for (int j = right; j > left; j--) {
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					last = j;
				}
			}
			left = last;

			for (int j = left; j < right; j++) {
				if (a[j] > a[j + 1]) {
					swap(a, j, j + 1);
					last = j;
				}
			}
			right = last;
		}
			
		System.out.printf("비교 : %d\n",c);
		System.out.printf("교환 : %d\n",e);
	}
	
	static void selectionSort(int[]a, int n) {
		for(int i=0; i<n-1; i++)
		{
			int min = i;
			for(int j=i+1; j<n; j++)
			{
				if(a[j]<a[min]) min =j;
			}
			swap(a,i,min);
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("버블 정렬(버전1)");
		System.out.print("요솟수 :");
		int nx = stdIn.nextInt();
		int[] x = new int [nx];
		
		for(int i=0; i<nx; i++)
		{
			System.out.printf("x[%d] :",i);
			x[i] = stdIn.nextInt();
		}
		bubbleSort4(x, nx);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0; i<nx; i++)
		{
			System.out.printf("x[%d] = %d\n",i,x[i]);
		}
	}
}
