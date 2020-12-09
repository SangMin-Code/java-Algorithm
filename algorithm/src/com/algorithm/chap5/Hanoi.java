package com.algorithm.chap5;

import java.util.Scanner;

import com.algorithm.chap4.IntStack;

public class Hanoi {
	
	static String conName(int a) {
		switch(a) {
		case 1 : 
			return "A기둥";
		case 2 : 
			return "B기둥";
		case 3 : 
			return "C기둥";
		}
		return null;
	}
	
	static void move(int no, int x, int y ) {
		
		if(no>1) move(no-1, x, 6-x-y);
		System.out.printf("원반 %d을 %s기둥에서 %s기둥으로 옮김\n",no,conName(x),conName(y));
		if(no>1) move(no-1,6-x-y,y);		
	}
	// 원반을 x기둥에서 y기둥으로 옮김
	static void move2(int no, int x, int y) {
		IntStack xstk = new IntStack(100);
		IntStack ystk = new IntStack(100);
		IntStack sstk = new IntStack(100);
		int sw = 0;

		while (true) {
			if (sw == 0 && no > 1) {
				xstk.push(x);
				ystk.push(y);
				sstk.push(sw);
				no = no - 1;
				y = 6 - x - y;
				continue;
			}
			System.out.printf("[%d]를 %d기둥에서 %d기둥으로 옮김\n", no, x, y);
			if (sw == 1 && no > 1) {
				xstk.push(x); // x의 값을 푸시
				ystk.push(y); // y의 값을 푸시
				sstk.push(sw); // sw의 값을 푸시
				no = no - 1;
				x = 6 - x - y;
				if (++sw == 2)
					sw = 0;
				continue;
			}
			do {
				if (xstk.isEmpty()) // 스택이 텅 빔
					return;
				x = xstk.pop(); // 값을 저장하고 있는 x를 팝
				y = ystk.pop(); // 값을 저장하고 있는 y를 팝
				sw = sstk.pop() + 1; // 값을 저장하고 있는 sw를 팝
				no++;
			} while (sw == 2);
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("하노이의 탑");
		System.out.println("원반 개수 :");
		int n = stdIn.nextInt();
		move2(n,1,3);
		
	}
}
 
