package com.neuedu.chapter3;

public class forlx {
	public static void main(String[] args) {
	for(int num=200;;num++){
		
	
		
		boolean flag=true;
				
		for(int i=2;i<num-1;i++){
			
			if(num%i==0){
				flag=false;
				System.out.println("����");
				break;//����������ѭ����return��������
				
			}
		}
		if(flag){
			System.out.println(num+"��");
			break;
		}
	}
	}
}