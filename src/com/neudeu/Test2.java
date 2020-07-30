package com.neudeu;

public class Test2 {
	/***
	 * 1.一个Java文件中可以有多个class，但是只能有一个public修饰的，文件名跟public的类名一样
	 * 2.只有public类中才能有main入口方法
	 * 3.如果文件中没有public的类，文件名要跟其中一个类的名字相同
	 * 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//基本数据类型中的整数
		//byte(1个字节),short(2个字节),  int(4个字节),long(8个字节)
		
		//-128~127
		//此处有个隐式类型转换
		byte a = 127;
		
		//-32768~32767   -2^15 ~ 2^15-1
		//此处有个隐式类型转换
		short b = 32767;
		
		//-2147483648~2147483647  -2^31 ~ 2^31-1
		int c = 2147483647;
		
		//-2^63 ~2^63-1
		//对于long型数据，如果超过int范围，在后面加上L/l，建议用大写
		long d = 2147483647123L;
		
		
	}
}
