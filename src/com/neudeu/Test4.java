package com.neudeu;

public class Test4 {
	public static void main(String[] args) {
		
		
		//a 目标类型   100源类型
		//隐式类型转换
		double a= 100;
//		特例:目标取值范围小于源类型
		short b=100;
		
		int x = 100;    
		//隐式类型转换
		long y = 200;
		double z = 12.34;
//		在进行数学运算时，也有类型转换
	System.out.println(x+y+z);
	
//	数据溢出
	int i =130;
	byte j = (byte) i;
	System.out.println(j);
	
//	char转int自动类型转换
//	int转char要强制类型转换
//	类型不同，范围不同要用到强制类型转换
//	byte short char 进行计算时会自动转换成int进行运算，所以他们三个不互相转换
//	
//	
	char a1='a';
	char b1='b';
	int c1 = a1+b1;
	System.out.println(c1);
	}
}
