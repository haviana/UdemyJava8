package com.acme.utils;

/**
 * Mydate class
 * @author hviana
 *
 */
public class MyDate {
	int day;
	int month;
	int year;
	{
		day = 1;
		month= 1;
		year = 2000;
	}
	public MyDate() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Create a date based on the entry parameters
	 * @param m month
	 * @param d day
	 * @param y year
	 */
	public MyDate(int m, int d, int y) {
		// TODO Auto-generated constructor stub
		setDate(m,d,y);
	}
	
	public String toString() {
		return month + "/" + day + "/" + year;
	}
	
	public void setDate(int m, int d, int y) {
		day = d;
			year=y;
			month=m;
	}

}
