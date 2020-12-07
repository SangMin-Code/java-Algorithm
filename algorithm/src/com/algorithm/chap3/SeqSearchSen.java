package com.algorithm.chap3;

import java.util.Scanner;

public class SeqSearchSen {

	static int seqSearchSen(int[] a, int n, int key) {
		a[n] = key;		
		int i=0;
		/*
		while(true)
		{
			if(a[i]==key) break;
			i++;
		}
		*/
		// | 0 1 2 3 4 5
		System.out.print("   |");
		for(int j = 0; j<a.length; j++)
		{			
			System.out.printf("%3d",j);
		}
		System.out.println();
		//---+---------
		System.out.print("---|");
		for(int j = 0; j<a.length; j++)
		{			
			System.out.printf("---",i);
		}	
		System.out.println();
		
		for(i =0; i<a.length; i++)
		{	
			System.out.print("   |  ");
			for(int j=0; j<i; j++)
			{
				System.out.print("   ");
			}
			System.out.print("*");
			System.out.println();
			
			System.out.printf("%3d|",i);
			for(int j =0; j<a.length; j++)
			{
				System.out.printf("%3d",a[j]);
			}
			System.out.println();
			
			if(a[i]==key) break;			
		}
		return i==n ? -1 :i;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("요솟수 :");
		int num = stdIn.nextInt();
		int[] x = new int[num+1];
		
		for(int i=0; i<num; i++)
		{
			System.out.printf("x[%d] :",i);
			x[i]=stdIn.nextInt();
		}
		System.out.println("검색할 값 :");
		int ky = stdIn.nextInt();
		
		int idx = seqSearchSen(x, num, ky);
		
		if(idx==-1) System.out.println("그 값의 요소가 없습니다.");
		else System.out.printf("%d은(는) x[%d]에 있습니다.",ky,idx);

	}
}
