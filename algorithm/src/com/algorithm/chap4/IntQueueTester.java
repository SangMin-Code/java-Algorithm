package com.algorithm.chap4;

import java.util.Scanner;

public class IntQueueTester {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntQueue s = new IntQueue(64);
		
		while(true)
		{
			System.out.printf("현재 데이터 수 %d / %d\n",s.size(),s.capacity());
			System.out.println("(1)인큐 (2)디큐 (3)피크 (4)덤프 (5)search (0)종료");
			
			int menu = stdIn.nextInt();
			if(menu==0) break;
			
			int x;
			
			switch(menu) {
				case 1:
					System.out.println("데이터 :");
					x=stdIn.nextInt();
					try {
						s.enque(x);
					}catch(IntQueue.OverFlowIntQueueException e) {
						System.out.println("큐가 가득찼습니다.");
					}
					break;
				case 2:
					try {
						s.deque();
					}catch(IntQueue.EmptyIntQueueException e) {
						System.out.println("큐가 비어 있습니다.");
					}
					break;
				case 3:
					try {
						s.peek();
					}catch(IntQueue.EmptyIntQueueException e) {
						System.out.println("큐가 비어있습니다.");
					}
					break;
				case 4:
					s.dump();
					break;
				case 5:
					System.out.println("찾을 숫자를 입력하세요");
					int t = stdIn.nextInt();
					System.out.printf("%d 번째 입니다.\n",s.search(t));
					break;
			}
		}//while
		
	}
}
