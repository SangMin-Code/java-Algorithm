package com.algorithm.chap1;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {

	static int maxOf(int[] a) {
		int max = a[0];
		for( int i=0; i < a.length; i++) {
			if(a[i]>max) max = a[i];
		}
		return max;
	}
	static void q1() {
		Random rand = new Random();
		
		System.out.println("키의 최댓값을 구합니다.");
		int num = rand.nextInt(10);
		int[] height = new int [num];
		
		System.out.println("키 값은 아래와 같습니다.");
		for(int i = 0; i<num; i++) {
			height[i] = 100+rand.nextInt(90);
			System.out.printf("height[%d] : %d\n",i,height[i]);
		}
		System.out.printf("최댓값은 %d 입니다.",maxOf(height));
		
	}
	
	
	public static void main(String[] args) {
		/*
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.println("사람 수 : ");
		int num = stdIn.nextInt();
		
		int[] height = new int [num];
		
		System.out.println("키 값은 아래와 같습니다.");
		for(int i = 0; i<num; i++) {
			height[i] = 100+rand.nextInt(90);
			System.out.printf("height[%d] : %d\n",i,height[i]);
		}
		System.out.printf("최댓값은 %d 입니다.",maxOf(height));
		*/
		q1();
	}
}
