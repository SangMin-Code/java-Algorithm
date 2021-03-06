package com.algorithm.chap3;

import java.util.Scanner;

public class BinSearch {

	static int binSearch(int[]a, int n, int key) {
		int pl = 0;
		int pr = n-1;
		
		System.out.printf("   |");
		for(int i =0; i <a.length; i++) System.out.printf("%3d",i);
		System.out.println();
		System.out.printf("---+");
		for(int i =0; i <a.length; i++) System.out.printf("---");
		System.out.println();
		
		do {
			int pc = (pl+pr)/2;
			
			System.out.printf("   |");
			for(int i=0; i <=pr; i++)
			{
				if(i==pl) System.out.print("<- ");
				else if(i==pc) System.out.print(" + ");
				else if(i==pr) System.out.println(" ->");
				else System.out.print("   ");
			}			
			System.out.printf("%3d|",pc);
			for(int i=0; i<a.length; i++) System.out.printf("%3d",a[i]);
			System.out.println();
			
			
			if(a[pc] ==key) return pc;
			else if(a[pc] < key) pl = pc+1;
			else pr = pc-1;
		}while(pl<=pr);
		return -1;
	}
	
	static int binSearchX(int[]a, int n, int key) {
		int pl =0;
		int pr = n-1;
		int pc = (pl+pr)/2;
		do {
			if(a[pc]==key)
			{
				int t = pc;
				for(int i = pc-1; i>-1; i--)
				{
					if(a[i]!=key) break;
					else  t = i;
				}
				return t;
			}else if (a[pc]>key) pr = pc-1;
			 else pl = pc+1;
				
		}while(pl<=pr);
		return -1;
	}
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("요솟수 :");
		int num = stdIn.nextInt();
		int[]
        x = new int[num];
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.println("x[0] :");
		x[0] =stdIn.nextInt();
		
		for(int i=1; i<num; i++)
		{
			do {
				System.out.printf("x[%d] :",i);
				x[i]= stdIn.nextInt();
			}while(x[i]<x[i-1]);
		}
		
		System.out.println("검색할 값 :");
		int ky = stdIn.nextInt();
		
		//int idx = binSearch(x,num,ky);
		int idx = binSearchX(x,num,ky);
		if(idx == -1) System.out.println("그 값의 요소가 없습니다.");
		else System.out.printf("ky 은(는) %d 에 있습니다.",idx);
	 }
}
