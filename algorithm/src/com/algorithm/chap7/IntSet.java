package com.algorithm.chap7;

public class IntSet {
	private int max;
	private int num;
	private int[] set;
	
	public IntSet(int capacity) {
		this.max = capacity;
		this.num = 0;
		try {
			set = new int[max];
		}catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public int capacity() {
		return max;
	}
	public int size() {
		return num;
	}
	// 집합에서 n을 검색하여 index를 반환
	// 찾지 못한 경우 (-삽입 포인트-1)를 반환
	public int indexOf2(int n) {
		int pl = 0; // 검색범위 맨 앞의 index
		int pr = n - 1; // 〃 맨 뒤의 index
		do {
			int pc = (pl + pr) / 2; // 중앙요소의 index
			if (set[pc] == n)
				return pc; // 검색성공
			else if (set[pc] < n)
				pl = pc + 1; // 검색범위를 앞쪽 절반으로 좁힘
			else
				pr = pc - 1; // 검색범위를 뒤쪽 절반으로 좁힘
		} while (pl <= pr);
		return -pl - 1; // 검색실패
	}
	public int indexof3(int n) {
		int pl = 0;
		int pr = num-1;
		
		do {
			int pc = (pl+pr)/2;
			if(set[pc]==n) return pc;
			else if (set[pc] < n) pl = pc+1;
			else pr = pc-1;
		}while(pl<pr);
		return -pl-1;
	}
	
	// 집합에 n을 추가
	public boolean add2(int n) {
		int idx;
		if (num >= max || (idx = indexOf(n)) >= 0) // 가득 참 또는 들어 있음.
			return false;
		else {
			idx = -(idx + 1);
			num++;
			for (int i = num - 1; i > idx; i--)
				set[i] = set[i - 1];
			set[idx] = n;
			return true;
		}
	}
		// 집합에서 n을 삭제
	public boolean remove2(int n) {
		int idx; // n이 저장된 요소의 index
		if (num <= 0 || (idx = indexOf(n)) == -1) // 비어 있음 또는 들어있지 않음
			return false;
		else {
			num--;
			for (int i = idx; i < num; i++) // set[idx]를 삭제하고
				set[i] = set[i + 1]; // 그 다음 요소를 한 칸 앞으로 옮김
			return true;
		}
	}
	
	public int indexOf(int n) {
		for(int i=0; i<num; i++)
		{
			if(set[i]==n) return i;
		}
		return -1;
	}
	public boolean contains(int n) {
		return (indexOf(n)!=-1) ? true : false;
	}
	
	public boolean add(int n) {
		if(num>=max || contains(n) == true) return false;
		else 	
		{
			set[num++] = n;
			return true;
		}
	}
	public boolean add(IntSet s) {
		boolean flag = false;
		for(int i=0; i<s.num; i++)
		{
			if(!isFull())
			{
				if(add(s.set[i])) flag = true;
			}else return false;
		}
		return flag;
	}
	
	public boolean retain(IntSet s) {
		// s에 들어있는 요소만남기기
		int i;
		boolean flag = false;
		boolean result = false;
		for(i=0; i<num;)
		{
			for(int j=0; j<s.num; j++)
			{
				if(contains(s.set[j])) {
					flag = true;
					i++;
				}
			}
			if(!flag)
			{
				set[i]=set[num-- -1];
				result = true;
			}
		}
		return result;
	}
	
	public boolean remove(IntSet s) {

		boolean flag = false;
		// s에 들어있는 요소 지우기
		for(int i =0; i<s.num; i++)
		{
			if(remove(s.set[i])) flag =true;
		}
		return flag;
	}
	public boolean remove(int n) {
		int idx ;
		if(num<=0 || (idx = indexOf(n)) == -1) return false;
		else
		{
			this.set[idx]=this.set[--num];
			return true;
		}
	}
	
	public void intersectionOf(IntSet s1, IntSet s2) {
		s1.remove(s2);
		copyFrom(s1);
	}
	
	public void differenceOf(IntSet s1, IntSet s2) {
		s1.remove(s2);
		copyFrom(s1);
	}
	
	public void copyTo(IntSet s) {
		int n = (s.max<this.num) ? s.max : this.num;
		for(int i =0; i<n; i++) s.set[i] = this.set[i];
		s.num = n;
	}
	public void copyFrom(IntSet s) {
		int n = (max <s.num) ? max : s.num;
		for(int i =0; i <n; i++) set[i] = s.set[i];
		num =n;
	}
	
	public boolean equalTo(IntSet s) {
		if(num != s.num) return false;
		
		for(int i=0; i<num; i++)
		{
			int j=0; 
			for(; j<s.num; j++)
			{
				if(set[i] == s.set[j]) break;
			}
			if(j==s.num) return false;
		}
		return true;
	}
	
	public void unionOf(IntSet s1, IntSet s2) {
		copyFrom(s1);
		for(int i =0; i<s2.num; i ++) add(s2.set[i]);
	}
	
	public boolean isSubsetOf(IntSet s) {
		boolean flag = true;
		for(int i =0; i < num; i++)
		{
			if(!s.contains(set[i])) flag =false;
		}
		return flag;
	}
	
	public boolean isProperSubsetOf(IntSet s) {
		
		boolean flag = true;
		if(num!=s.num) flag = false;
		for(int i =0; i < num; i++)
		{
			if(!s.contains(set[i])) flag =false;
		}
		return flag;
	}
	
	
	
	
	public String toString() {
		StringBuffer temp = new StringBuffer("{");
		for(int i = 0; i<num; i++) temp.append(set[i]+" ");
		temp.append("}");
		return temp.toString();
	}
	
	public boolean isEmpty() {
		return num<=0 ;
	}
	
	public boolean isFull() {
		return num>=max;
	}
	
	public void clear() {
		num = 0;
	}
	
	
	
}
