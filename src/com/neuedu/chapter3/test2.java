package com.neuedu.chapter3;

public class test2 {
	
	public static void main(String[] args) {
		int year=2000;
	
	if(year % 400==0){
		System.out.println(year+"是闰年");
	}else if(year % 4==0 && year %100 ==100){
		System.out.println(year+"是闰年");
	}else{
		System.out.println(year+"不是闰年");
	}

	}
	
}
