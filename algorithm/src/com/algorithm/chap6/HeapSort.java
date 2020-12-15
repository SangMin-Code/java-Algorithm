package com.algorithm.chap6;

public class HeapSort {
	
	static void swap(int[]a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2]=t;
	}
	
	static void downHeap(int[]a, int left, int right) {
		int temp = a[left];
		int child;
		int parent;
		
		for(parent =left; parent<(right+1)/2; parent=child)
		{
			int cl = parent*2+1;
			int cr = cl+1;
			child = (cr<=right&& a[cr]>a[cl]) ? cr: cl;
			if(temp >= a[child]) break;
			a[parent] =a[child];
		}
		a[parent] = temp;
	}
	static void headSort(int[]a, int n) {
		for(int i=(n-1)/2; i>=0; i--) downHeap(a, i, n-1);
		
		for(int i=n-1; i>0; i-- )
		{
			swap(a,0,1);
			downHeap(a, 0, i-1                                     );
		}
	}
}
