package com.neuedu.chapter3;

public class forplas {
	public static void main(String[] args) {
		int m=8;
		int n=12;
		int result=1;
		for(int i=1 ;i<m;i++){
			if(m%i==0 && n%i==0){
				result = i;
			}
		}
		System.out.println(m+"和"+n+"的最大公约数为："+result);
	}
}
