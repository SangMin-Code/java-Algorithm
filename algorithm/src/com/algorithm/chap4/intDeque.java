package com.algorithm.chap4;

public class intDeque {

	private int max;	
	private int numA;
	private int numB;
	private int[] que;
	
	public class EmptyintDequeException extends RuntimeException{
		public EmptyintDequeException() {}
	}
	
	public class OverFlowintDequeException extends RuntimeException{
		public OverFlowintDequeException() {}
	}
	
	public intDeque(int capacity) {
		max = capacity;
		numA = 0;
		numB = 0;
		
		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}		
	}
	public int enqueA(int x) throws OverFlowintDequeException{
		if(numA+numB>=max) throw new OverFlowintDequeException();
		return que[numA++]=x;
	}
	public int enqueB(int x) throws OverFlowintDequeException{
		if(numA+numB>=max) throw new OverFlowintDequeException();
		return que[max-1-numB++]=x;
	}
	public int dequeA() throws EmptyintDequeException{
		if(numA<=0) throw new EmptyintDequeException();
		int r =que[0];
		for(int i=1; i<numA; i++)
		{
			que[i-1]=que[i];
		}
		numA--;
		return r;
	}
	public int dequeB() throws EmptyintDequeException{
		if(numB<=0) throw new EmptyintDequeException();
		int r =que[max-1];
		for(int i=1; i<numB; i++)
		{
			que[max-i]=que[max-i-1];
		}
		numB--;
		return r;
	}
	public int peekA() throws EmptyintDequeException{
		if(numA<=0) new EmptyintDequeException();
		return que[0];
	}
	public int peekB() throws EmptyintDequeException{
		if(numB<=0) new EmptyintDequeException();
		return que[max-1];
	}
	public int indexOf(int x) {
		
		for(int i=0; i<numA; i++)
		{
			if(que[i]==x) return i;
		}
		for(int i=0; i<numB; i++)
		{
			if(que[max-1-i]==x) return i;
		}
		
		return -1;
	}
	public void clear() {
		numA=numB=0;
	}
	public int capacity() {
		return max;
	}
	public int size() {
		return numA+numB;
	}
	public boolean isEmpty() {
		return numA<=0 && numB<=0;
	}
	public boolean isFull() {
		return numA+numB>=max;
	}
	public void dump() {
		if(numA<=0 && numB<=0) System.out.println("큐가 비어있습니다.");
		else
		{
			if(numA>0)
			{
				System.out.print("A : ");
				for(int i=0; i<numA; i++) System.out.printf("%d,",que[i]);
				System.out.println();
			}else System.out.println("A 큐는 비었습니다.");
			if(numB>0)
			{
				System.out.print("B : ");
				for(int i=0; i<numB; i++) System.out.printf("%d,",que[max-1-i]);
				System.out.println();
			}else System.out.println("B큐는 비었습니다.");
		}
	}
	
	public static void main(String[] args) {
		intDeque a = new intDeque(5);
		
		a.enqueA(1);
		a.enqueA(2);
		a.enqueB(3);		
		a.dump();
		a.dequeB();
		a.dequeA();
		a.dump();
		System.out.printf("index : %d",a.indexOf(3));
		
	}
}
