package com.algorithm.chap3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;;

public class PhysExamSearch {

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
				return (d1.height > d2.height) ? 1 : 
					   (d1.height < d2.height) ? -1 : 0;
			}
		}
		

		
		public static final Comparator<PhyscData> VISION_ORDER
							= new VisionOrderComparator();
		private static class VisionOrderComparator implements Comparator<PhyscData>{
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.vision > d2.vision) ? -1 :
					   (d1.vision < d2.vision) ?  1 : 0;
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		PhyscData[] x = {
			new PhyscData("이나령", 162, 2.0),	
			new PhyscData("유지훈", 168, 1.8),	
			new PhyscData("김한결", 169, 1.5),	
			new PhyscData("홍준기", 171, 1.0),	
			new PhyscData("전서현", 173, 0.7),	
			new PhyscData("이호연", 174, 0.2),	
			new PhyscData("이수민", 175, 0.1)	
		};
		
		
		//System.out.println("몇 cm인 사람을 찾고 있나요? :");
		//int height = stdIn.nextInt();
		//int height = 161;
		//int idx = Arrays.binarySearch(x, new PhyscData("", height, 0.0), PhyscData.HEIGHT_ORDER);
		
		
		/*
		System.out.println("시력이 몇임 사람을 찾고 있나요? :");
		double vision = stdIn.nextDouble();
		
		*/
		double vision = 0.7;
		int idx = Arrays.binarySearch(x, new PhyscData("", 0, vision), PhyscData.VISION_ORDER);
		
		for(int i=0; i <x.length; i++) System.out.println(x[i]);
		if(idx<0) System.out.println("요소가 없습니다.");
		else
		{
			System.out.printf("x[%d}에 있습니다.\n",idx);
			System.out.printf("찾은 데이터 : %s\n",x[idx]);
		}
	}
	
	
}
