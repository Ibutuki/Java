package com.seiryo.edu;

public class OperatorDemo2 {
	public static void main(String[] args) {
		int i = 3,t = 5;
		int j = i+++t;
		System.out.println(i);
		int m = ++t+i;
		System.out.println("j="+j+",m"+m);
	}
}
