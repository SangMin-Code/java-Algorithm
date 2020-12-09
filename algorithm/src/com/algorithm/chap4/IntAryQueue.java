package com.algorithm.chap4;

public class IntAryQueue {

	private int max;
	private int num;
	private int[] que;
	
	public class EmptyIntAryQueueException extends RuntimeException{
		public EmptyIntAryQueueException() {}
	}
	
	public class OverFlowIntArytQueueException extends RuntimeException{
		public OverFlowIntArytQueueException() {}
	}
	
	public IntAryQueue(int capacity) {
		max = capacity;
		num = 0;
		
		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}		
	}
	public int enque(int x) throws OverFlowIntArytQueueException{
		if(num>=max) throw new OverFlowIntArytQueueException();
		return que[num++]=x;
	}
	public int deque() throws EmptyIntAryQueueException{
		if(num<=0) throw new EmptyIntAryQueueException();
		int r =que[0];
		for(int i=1; i<num; i++)
		{
			que[i-1]=que[i];
		}
		num--;
		return r;
	}
	public int peek() throws EmptyIntAryQueueException{
		if(num<=0) new EmptyIntAryQueueException();
		return que[0];
	}
	public int indexOf(int x) {
		for(int i=0; i<num; i++)
		{
			if(que[i]==x) return i;
		}
		return -1;
	}
	public void clear() {
		num=0;
	}
	public int capacity() {
		return max;
	}
	public int size() {
		return num;
	}
	public boolean isEmpty() {
		return num<=0;
	}
	public boolean isFull() {
		return num>=max;
	}
	public void dump() {
		if(num<=0) System.out.println("큐가 비어있습니다.");
		else
		{
			for(int i=0; i<num; i++) System.out.printf("%d,",que[i]);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		IntAryQueue a = new IntAryQueue(5);
		
		a.enque(1);
		a.enque(2);
		a.enque(3);
		
		a.dump();
		a.deque();
		a.deque();
		a.dump();
		System.out.printf("index : %d",a.indexOf(3));
		
	}
}
