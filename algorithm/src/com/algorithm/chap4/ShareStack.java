package com.algorithm.chap4;

public class ShareStack {
	private int max;
	private int ptrA;
	private int ptrB;
	private int[] stk;
	
	//실행 시 예외 : 스택이 비어있음.
	public class EmptyInStackException extends RuntimeException{
		public EmptyInStackException() {}
	}
	
	//실행 시 예외 : 스택이 가득 참
	public class OverFlowInStackException extends RuntimeException{
		public OverFlowInStackException() {}
	}
	
	public ShareStack(int capacity) {
		ptrA = 0;
		ptrB = 0;		
		max = capacity;
		try {
			stk = new int[max];
		}catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public int pushA(int x) throws OverFlowInStackException{
		if(ptrA+ptrB >=max)
		{
			throw new OverFlowInStackException();			
		}
		return stk[ptrA++] =x;
	}
	public int pushB(int x) throws OverFlowInStackException{
		if(ptrA+ptrB >=max)
		{
			throw new OverFlowInStackException();
		}
		return stk[max-1-ptrB++] =x;
	}
	
	public int popA() throws EmptyInStackException{
		if(ptrA<=0)
		{
			throw new EmptyInStackException();
		}
		return stk[--ptrA];
	}
	public int popB() throws EmptyInStackException{
		if(ptrB<=0)
		{
			throw new EmptyInStackException();
		}
		return stk[max-1-(--ptrB)];
	}
	public int peekA() throws EmptyInStackException{
		if(ptrA<=0)
		{
			throw new EmptyInStackException();
		}
		return stk[ptrA-1];
	}
	public int peekB() throws EmptyInStackException{
		if(ptrB<=0)
		{
			throw new EmptyInStackException();
		}
		return stk[max-ptrB];
	}
	public int indexOf(int x) {
		for(int i=ptrA-1; i>=0; i--){
			if(stk[i]==x) return i;
		}
		for(int i = max-ptrB; i<max; i++) {
			if(stk[i]==x) return i;
		}
		return -1;
	}
	public void clear() {
		ptrA =0;
		ptrB =0;
	}
	public int capacity() {
		return max;
	}
	public int size() {
		return ptrA + ptrB;
	}
	public boolean isEmpty() {
		return ptrA<=0 && ptrB<=0;
	}
	public boolean isFull() {
		return ptrA+ptrB>=max;
	}
	public void dump() {
		if(ptrA<=0 && ptrB<=0) System.out.println("스택이 비어있습니다.");
		else
		{	
			if(ptrA>=0)
			System.out.println("A 스택");
			for(int i=0; i<ptrA; i++)
			{
				System.out.printf("%d ",stk[i]);
			}
			System.out.println();
			
			if(ptrB>=0)
			System.out.println("B 스택");
			for(int i=max-1; i>max-1-ptrB; i--)
			{
				System.out.printf("%d ",stk[i]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		ShareStack a = new ShareStack(5);
		a.pushA(1);
		a.pushA(2);
		a.pushA(3);
		a.pushA(4);
		a.pushB(6);
	    
		a.popA();
		a.dump();
		System.out.printf("indexof : %d   peekA : %d", a.indexOf(6), a.peekA());
		
		
	}
}
	