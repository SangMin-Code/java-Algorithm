package com.algorithm.chap4;

import java.util.Scanner;

public class IntStackTester {
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		IntStack s = new IntStack(64);
		
		while(true)
		{
			System.out.printf("현재 데이터 수 %d/%d\n",s.size(),s.capacity());
			System.out.println("(1)푸시 (2)팝 (3)피크 (4)덤프 \n(5)claear (6)isFull (7)indexOf (8)capacity (9)isempty \n (10)size (0)종료");
			
			int menu = stdIn.nextInt();
			if(menu==0) break;
			
			int x;
			switch(menu) {
			
			case 1 : 
				System.out.println("데이터 :");
				x = stdIn.nextInt();
				try {
					s.push(x);
				}catch(IntStack.OverFlowInStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
			case 2:
				try {
					x=s.pop();
					System.out.printf("팝한 데이터는 %d 입니다.\n",x);
				}catch(IntStack.EmptyInStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;
			case 3 :
				try {
					x= s.peek();
					System.out.printf("피크한 데이터는 %d입니다\n",x);
				}catch(IntStack.EmptyInStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;
			case 4 :
				s.dump();
				break;
			case 5 :
				s.clear();
				System.out.println("스택을 비웠습니다.");
				break;
			case 6 :
				if(s.isFull()) System.out.println("스택이 가득 찼습니다."); 
				else System.out.println("스택이 가득차지 않았습니다.");
				break;
			case 7 :
				System.out.println("찾을 값을 입력해주세요");
				int t = stdIn.nextInt();
				int r = s.indexOf(t);
				if(r<0) System.out.println("값이 없습니다.");
				else System.out.printf("%d 는 x[%d]에 있습니다.\n",t,r);
				break;
			case 8 :	
				System.out.printf("capacity : %d\n",s.capacity());
				break;
			case 9 :
				if(s.isEmpty()) System.out.println("스택이 비어있습니다.");
				else System.out.println("스택이 비어있지 않습니다.");
				break;
			case 10 :
				System.out.printf("size : %d\n",s.size());
				break;
			}//switch
			
		}//while
		
		
	}
}
