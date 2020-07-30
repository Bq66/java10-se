package com.neuedu.chapter3;

public class forcontinue {
	public static void main(String[] args) {
		//continue 结束本次循环，进行下次循环可以在循环外
//		return （方法结束）、break（结束循环）、continue（结束本次循环进行下次循环）
		//水仙花
		for(int i=0;i<=999;i++){
			int a=i%10;
			int b=i/10%10;
			int c=i/100;
			if(a*a*a + b*b*b + c*c*c ==i){
				System.out.println(i);
			}
			
		}
	}
}
