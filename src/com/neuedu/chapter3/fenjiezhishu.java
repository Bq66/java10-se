package com.neuedu.chapter3;

public class fenjiezhishu {
public static void main(String[] args) {
	//
	int z=120;
	for(int i=2;i<z;i++){
		while(z!=i){
			if(z%i==0){
				z=z/i;
				System.out.println(i);
			}else{
				break;
				
			}
		}
	}
}
}
