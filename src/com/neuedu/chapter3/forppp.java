package com.neuedu.chapter3;

public class forppp {
public static void main(String[] args) {
int num=0;
	int s=12345;
	for(int i=0;;i++){//利用死循环用break跳出死循环
		s=s/10;
		num++;
		if(s==0){
			break;
			
		}
		
	}System.out.println(num);
}
}
