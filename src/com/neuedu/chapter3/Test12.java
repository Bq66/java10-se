package com.neuedu.chapter3;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//判断一个数是不是素数，就是这个数只能被1和本身整除，
		int n =179;
		for(int i=2;i<n;i++){
			if(n%i==0){
				System.out.println("不是");
				return;
			}
			
		}
		System.out.println("是");
		
	}

}
