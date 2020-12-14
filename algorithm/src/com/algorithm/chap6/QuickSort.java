package com.algorithm.chap6;

import java.util.Scanner;

import com.algorithm.chap4.IntStack;

public class QuickSort {
	static void swap(int[]a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=t;
	}
	static void quickSort(int[]a, int left, int right) {
		int pl = left;
		int pr = right;
		int x = a[(pl+pr)/2];
		
		System.out.printf("a[%d]~a[%d] : {",left,right);
		for(int i =left; i<right; i++) System.out.printf("%d, ",a[i]);
		System.out.printf("%d}\n",a[right]);
		do
		{
			while(a[pl]<x) pl++;
			while(a[pr]>x) pr--;
			if(pl<=pr) swap(a,pl++,pr--);
		}while(pl<=pr);
		if(left<pr)quickSort(a, left, pr);
		if(pl<right)quickSort(a, pl, right);
	}
	
	static void quickSort2(int[]a, int left, int right) {
		int pl =left;
		int pr = right;
		if(right-left+1>=9) insertion(a, left, right);
		else
		{
			int x = a[(pr+pl)/2];
			
			while(pl<=pr)
			{
				while(a[pl]>x) pl++;
				while(a[pr]<x) pr--;
				if(pl<=pr) swap(a, pl++, pr--);
			}
			//left pr pl rigt
			/*
			 * int t = left;
			 * left = pl;
			 * pl = t;
			 * t =pr;
			 * pr = right;
			 * right = t;
			 */
			
			if(pr-left > right-pl)
			{
				if(pl<right) quickSort2(a, pl, right);
				if(left<pr) quickSort2(a, left, pr);
			}else
			{
				if(left<pr) quickSort2(a, left, pr);
				if(pl<right) quickSort2(a, pl, right);
				
			}
		}
	}
	
	static void quickSort3(int[]a , int n) {
		quickSort(a,0,n-1);
	}
	
	static void insertion(int[]a, int left, int right) {
		for(int i=left+1; i<right; i++)
		{
			int j;
			int tmp =a[i];
			for(j=i; j>=left && a[j-1]>tmp; j--)
			{
				a[j]=a[j-1];
			}
			a[j]=tmp;
		}
	}
	
	static void quickSort3(int[] a, int left, int right ) {
		IntStack lstack = new IntStack(right-left+1);
		IntStack rstack = new IntStack(right-left+1);

		lstack.push(left);
		rstack.push(right);
		
		
		while(lstack.isEmpty()!=true)
		{
			System.out.printf("pop pl : %d, pr : %d\n",lstack.peek(),rstack.peek());
			int pl = left = lstack.pop();
			int pr = right = rstack.pop();
			int x = a[(left+right)/2];
			
			if(right-left+1 <=9)
			{
				insertion(a, left, right);
			}
			else {
				
			do
			{
				while(a[pl]<x)pl++;
				while(a[pr]>x)pr--;
				if(pl<=pr) swap(a,pl++,pr--);
			}while(pl<=pr);
			
			if(pr-left >= right-pl)
			{
				if(left<pr)
				{
					lstack.push(left);
					rstack.push(pr);
					System.out.printf("push pl : %d, push : %d\n",lstack.peek(),rstack.peek());
					
				}
				if(pl<right)
				{
					lstack.push(pl);
					rstack.push(right);
					System.out.printf("push pl : %d, push : %d\n",lstack.peek(),rstack.peek());
				}
			}else
			{
				if(pl<right)
				{
					lstack.push(pl);
					rstack.push(right);
					System.out.printf("push pl : %d, push : %d\n",lstack.peek(),rstack.peek());
				}
				if(left<pr)
				{
					lstack.push(left);
					rstack.push(pr);
					System.out.printf("push pl : %d, push : %d\n",lstack.peek(),rstack.peek());
					
				}
				
			}
			}
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("퀵 정렬");
		System.out.print("요솟수 :");
		int nx = stdIn.nextInt();
		int[]x = new int[nx];
		
		for(int i=0; i<nx; i++)
		{
			System.out.printf("x[%d] :",i);
			x[i]=stdIn.nextInt();
		}
		quickSort3(x, 0, nx-1);
		//System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0; i<nx; i++)  System.out.printf("x[%d] = %d\n",i,x[i]);
	}
}
