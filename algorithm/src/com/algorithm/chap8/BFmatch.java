package com.algorithm.chap8;

import java.util.Scanner;

public class BFmatch {
	static int bfMatch(String txt, String pat) {
		int pt = 0;
		int pp = 0;
		int cnt = 0;
		int a=0;
		while(pt!=txt.length() && pp!= pat.length()) {
			if(pp==0)
			{
				System.out.println(cnt + " " +txt);
				a=pt;
			}
			else System.out.println("  "+txt);
			System.out.print("  ");
			for(int i=0; i<a; i++) System.out.print(" ");
			for(int i=0; i<pp; i++) System.out.printf(" ");
			if(txt.charAt(pt)==pat.charAt(pp)) {
				System.out.printf("+\n");
				pt++;
				pp++;
			}else
			{
				System.out.printf("|\n");
				pt = pt-pp+1;
				pp=0;
				cnt++;
			}
			System.out.print("  ");
			for(int i=0; i<a; i++) System.out.print(" ");
			System.out.println(pat);
		}
		if(pp==pat.length()) return pt-pp;
		return -1;
	}
	static int bfMatchLast(String txt, String pat) {
		int pt = 0;
		int pp =0;
		while(pt!=txt.length() && pp!=pat.length())
		{
			if(txt.charAt(pt) == pat.charAt(pp))
			{
				pp++;
				pt++;
			}else
			{
				pt = pt-pp+1;
				pp = 0;
			}
		}
		if(pp == pat.length()) return pt;
		else return -1;
	}
	
	public static void main(String[] args) {
		/*
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("텍스트 :");
		String s1 = stdIn.next();
		
		System.out.println("패턴 :");
		String s2 = stdIn.next();	
		
		int idx = bfMatch(s1,s2);
		
		if(idx==-1) System.out.println("텍스트에 패턴이 없습니다.");
		else
		{
			int len  =0;
			for(int i = 0; i<idx; i++)
			{
				len += s1.substring(i,i+1).getBytes().length;
			}
			len+=s2.length();
			System.out.println((idx+1)+"번째 문자부터 일치합니다.");
			System.out.println("텍스트 :"+s1);
			System.out.printf(String.format("패턴:%%%ds\n", len),s2);
		}
		*/
		String s1 = "ABABCDEFGHA";
		String s2 = "ABC";
		bfMatch(s1, s2);
	}
}
