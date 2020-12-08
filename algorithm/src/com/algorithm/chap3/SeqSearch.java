package com.algorithm.chap3;

import java.util.Scanner;

public class SeqSearch {

	static int seqSearch(int[] a, int n, int key) {
		/*
		int i =0;
		
		while(true)
		{
			if(i==n) return -1;
			if(a[i]==key) return i;
			i++;
		}
		*/
		
		for(int i =0; i<n; i++)
		{
				if(a[i]==key) return i;
		}
		return -1;
	}
	
	static int searchIdx(int[] a, int n, int key, int[] idx) {
	
		int count = 0;
		int[] temp = new int[n];
		for(int i=0; i<n; i++)
		{
			if(a[i]==key)
			{
				temp[count++]=i;				
			}
		}
		
		if(idx.length<count)
		{
			System.out.println("배열의 길이가 부족합니다.");
			return -1;
		}else if(count ==0)
		{
			System.out.println("요소안에 값이 없습니다.");
			return 0; 
		}else
		{
			for(int i =0; i<count; i++)
			{
				idx[i]=temp[i];
			}
			return count;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("요솟수 :");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for(int i=0; i<num; i++)
		{
			System.out.printf("x[%d] :",i);
			x[i]=stdIn.nextInt();
		}
		System.out.println("검색할 값 :");
		int ky = stdIn.nextInt();
		
		int idx = seqSearch(x, num, ky);
		
		if(idx==-1) System.out.println("그 값의 요소가 없습니다.");
		else System.out.printf("%d은(는) x[%d]에 있습니다.",ky,idx);
		
		
		
		/*  Q3
		int[] a = {1,9,2,9,4,6,7,9};
		int n = 8;
		int key = 9;
		int[] idx = new int[3];
		
		int b = searchIdx(a, n, key, idx);
		
		for(int c : idx)
		{
			System.out.printf("%3d,",c);
		}
		*/
	}
}
