package com.algorithm.chap6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;;

public class PhysExamSort {

	static class PhyscData{
		private String name;
		private int height;
		private double vision;
		
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;		
		}
		
		public String toString() {
			return name + " " +height + " " + vision;
		}
		
		public static final Comparator<PhyscData> HEIGHT_ORDER 
							= new HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhyscData>{
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.height > d2.height) ? -1 : 
					   (d1.height < d2.height) ? 1 : 0;
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		PhyscData[] x = {
			new PhyscData("이나령", 162, 2.0),	
			new PhyscData("유지훈", 168, 1.8),	
			new PhyscData("전서현", 173, 0.7),	
			new PhyscData("김한결", 169, 1.5),	
			new PhyscData("이호연", 174, 0.2),	
			new PhyscData("홍준기", 171, 1.0),	
			new PhyscData("이수민", 175, 0.1)	
		};
	
		Arrays.sort(x,PhyscData.HEIGHT_ORDER);
		
		for(int i=0; i<x.length; i++)
			System.out.printf("%-8s%3d%5.1f\n",x[i].name,x[i].height,x[i].vision);
	}
	
	
}
