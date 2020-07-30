package com.neuedu.chapter3;

public class forlx {
	public static void main(String[] args) {
	for(int num=200;;num++){
		
	
		
		boolean flag=true;
				
		for(int i=2;i<num-1;i++){
			
			if(num%i==0){
				flag=false;
				System.out.println("不是");
				break;//仅跳出本次循环。return结束程序
				
			}
		}
		if(flag){
			System.out.println(num+"是");
			break;
		}
	}
	}
}