
package com.neuedu.chapter3;

public class Test4 {
	public static void main(String[] args) {
		int s=89;
		if(s<0 || s>100){
			System.out.println("���벻�Ϸ�");
		return;
		}
		switch(s/10){
		case 10:
		System.out.println("����");
		break;
		case 9:
			System.out.println("����");
			break;
		case 8:
			System.out.println("����");
			break;
		case 7:
			System.out.println("����");
			break;
		case 6:
			System.out.println("����");
			break;
		default:
			System.out.println("������");
		break;
		}
		
	}
}
