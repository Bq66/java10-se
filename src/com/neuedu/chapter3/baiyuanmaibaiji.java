package com.neuedu.chapter3;

public class baiyuanmaibaiji {
	public static void main(String[] args) {
		for(int i=0;i<=100;i++){
			for(int j=0;j<=100;j++){
				for(int x=0;x<=100;x++){
					if((i+j+x)==100 && 3*i+4*j+0.5*x == 100)
					{
						System.out.println(i+"Ä¸¼¦"+j+"¹«¼¦"+x+"Ð¡¼¦");
					} 
				}
			}
		}
	}
}
