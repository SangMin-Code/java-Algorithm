package com.algorithm.chap2;

import java.util.Calendar;

public class YMD {

	int y;
	int m;
	int d;
	Calendar cal = Calendar.getInstance();
	
	public YMD(int y, int m, int d) {
		this.y = y;
		this.m = m;
		this.d = d;
		this.cal.set(Calendar.YEAR,y);
		this.cal.set(Calendar.MONTH,m);
		this.cal.set(Calendar.DATE,d);
	}
	
	public YMD after(int n) {
		
		cal.add(Calendar.DATE,n);
		this.y = cal.get(Calendar.YEAR);
		this.m=cal.get(Calendar.MONTH);
		this.d = cal.get(Calendar.DATE);
		return null;
	}
	
	public YMD before(int n) {
		cal.add(Calendar.DATE,-n);
		this.y = cal.get(Calendar.YEAR);
		this.m=cal.get(Calendar.MONTH);
		this.d = cal.get(Calendar.DATE);
		return null;
	}
}
