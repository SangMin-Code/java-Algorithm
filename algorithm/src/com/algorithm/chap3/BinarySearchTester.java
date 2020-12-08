package com.algorithm.chap3;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("요솟수 :");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요.");
		System.out.println("x[0] :");
		x[0] = stdIn.nextInt();
		
		for(int i=1; i<num; i++)
		{
			do{
				System.out.printf("x[%d] :\n",i);
				x[i] = stdIn.nextInt();
			}while(x[i]<x[i-1]);
		}
		
		System.out.println("검색할 값 :");
		int ky = stdIn.nextInt();
		
		int idx = Arrays.binarySearch(x, ky);
		if(idx<0) System.out.printf("삽입 포인트는 x[%d]입니다.", (idx+1)*-1 );
		else System.out.printf("%d 은(는) x[%d]에 있습니다.",ky,idx);
		
	}
}
