package com.neuedu.chapter3;

public class Test3 {
	public static void main(String[] args) {
		int num = 30;
		if(num %5==0 && num%6==0){
			System.out.println("能被5和6整除");
		}else if(num %5==0){
			System.out.println("能被5整除");
		}else if(num%6==0){
			System.out.println("能被6整除");
		}
	}
	
	
}
