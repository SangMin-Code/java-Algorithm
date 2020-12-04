package com.algorithm.chap1;

public class Max3m {

	static int max3(int a, int b, int c) {
		int max = a;
		
		if(b>max) max = b;
		if(c>max) max = c;
		
		return max;
	}
	
	static int max4(int a, int b, int c, int d)
	{
		int max = a;
		if(b>max) max = b;
		if(c>max) max = c;
		if(d>max) max = d;
		
		return max;
	}
	
	static int min3(int a, int b, int c)
	{
		int min = a;
		if(b<min) min = b;
		if(c<min) min = c;
		return min;
	}
	
	static int min4(int a, int b, int c, int d)
	{
		int min = a;
		if(b<min) min = b;
		if(c<min) min = c;
		if(c<min) min = c;
		if(d<min) min = d;
		return min;
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("max3 ");
		System.out.println("max(3,2,1) = "+max3(3,2,1));
		System.out.println("max(3,2,2) = "+max3(3,2,2));
		System.out.println("max(3,1,2) = "+max3(3,1,2));
		System.out.println("max(3,2,3) = "+max3(3,2,3));
		System.out.println("max(2,1,3) = "+max3(2,1,3));
		System.out.println("max(3,3,2) = "+max3(3,3,2));
		System.out.println("max(3,3,3) = "+max3(3,3,3));
		System.out.println("max(2,2,3) = "+max3(2,2,3));
		System.out.println("max(2,3,1) = "+max3(2,3,1));
		System.out.println("max(2,3,2) = "+max3(2,3,2));
		System.out.println("max(1,3,2) = "+max3(1,3,2));
		System.out.println("max(2,3,3) = "+max3(2,3,3));
		System.out.println("max(1,2,3) = "+max3(1,2,3));
	    System.out.println();
		System.out.println("max4 ");
		System.out.println("max(4,3,2,1) = "+max4(4,3,2,1));
		System.out.println("max(4,3,2,2) = "+max4(4,3,2,2));
		System.out.println("max(3,1,4,2) = "+max4(3,1,4,2));
		System.out.println("max(3,2,3,4) = "+max4(3,2,3,4));
		System.out.println("max(2,1,3,4) = "+max4(2,1,3,4));
		System.out.println();
		System.out.println("min3");
		System.out.println("min(3,2,1) = "+min3(3,2,1));
		System.out.println("min(3,2,2) = "+min3(3,2,2));
		System.out.println("min(3,1,2) = "+min3(3,1,2));
		System.out.println("min(3,2,3) = "+min3(3,2,3));
		System.out.println("min(2,1,3) = "+min3(2,1,3));
		System.out.println("min(3,3,2) = "+min3(3,3,2));
		System.out.println("min(3,3,3) = "+min3(3,3,3));
		System.out.println("min(2,2,3) = "+min3(2,2,3));
		System.out.println("min(2,3,1) = "+min3(2,3,1));
		System.out.println("min(2,3,2) = "+min3(2,3,2));
		System.out.println("min(1,3,2) = "+min3(1,3,2));
		System.out.println("min(2,3,3) = "+min3(2,3,3));
		System.out.println("min(1,2,3) = "+min3(1,2,3));
		System.out.println();
		System.out.println("min4 ");
		System.out.println("max(4,3,2,1) = "+min4(4,3,2,1));
		System.out.println("max(4,3,2,2) = "+min4(4,3,2,2));
		System.out.println("max(3,1,4,2) = "+min4(3,1,4,2));
		System.out.println("max(3,2,3,4) = "+min4(3,2,3,4));
		System.out.println("max(2,1,3,4) = "+min4(2,1,3,4));
		
	}
	
}
