package com.neuedu.chapter3;

public class Test15 {
	public static void main(String[] args) {
		//�����Ժ�Ϣ�ϼ�
		double sum=1000000;
		for (int i=0;i<3;i++){
			sum=sum*(1+0.04);
		}
		
		
		double month_money = (sum-1000000)/36;
		
		//һ��ȡ��
		double  sum2 = 1000000*(1+0.003);
		
		double refund = sum2 - month_money*12;
		System.out.print(refund);
	}
}
