package com.neuedu.chapter3;

public class Test15 {
	public static void main(String[] args) {
		//三年以后本息合计
		double sum=1000000;
		for (int i=0;i<3;i++){
			sum=sum*(1+0.04);
		}
		
		
		double month_money = (sum-1000000)/36;
		
		//一年取了
		double  sum2 = 1000000*(1+0.003);
		
		double refund = sum2 - month_money*12;
		System.out.print(refund);
	}
}
