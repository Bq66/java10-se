
package com.neuedu.chapter3;

public class Test4 {
	public static void main(String[] args) {
		int s=89;
		if(s<0 || s>100){
			System.out.println("输入不合法");
		return;
		}
		switch(s/10){
		case 10:
		System.out.println("优秀");
		break;
		case 9:
			System.out.println("优秀");
			break;
		case 8:
			System.out.println("优秀");
			break;
		case 7:
			System.out.println("优秀");
			break;
		case 6:
			System.out.println("优秀");
			break;
		default:
			System.out.println("不及格");
		break;
		}
		
	}
}
