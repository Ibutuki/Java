package com.seiryo.edu;

public class Development1 {
	public static void main(String[] args) {
		int teamCount = 10;
		int javaNo = 8;
		for(int i = 0; i<=teamCount; i++){
			if(i == javaNo){
				System.out.println("���Ϊ"+i+"��Ա����ͨJava,����Ҫ��");
				continue;
			}
			System.out.println("���Ϊ"+i+"��Ա��������Ҫ��");
		}
	}
}