package com.neuedu.chapter3;

public class forcontinue {
	public static void main(String[] args) {
		//continue ��������ѭ���������´�ѭ��������ѭ����
//		return ��������������break������ѭ������continue����������ѭ�������´�ѭ����
		//ˮ�ɻ�
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
