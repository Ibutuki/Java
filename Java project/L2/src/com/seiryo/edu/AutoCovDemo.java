package com.seiryo.edu;

public class AutoCovDemo {
	public static void main(String[] args) {
		byte a = 10;
		int i = a;
		System.out.println("btye类自动转换为int类"+i);
		char c = 'A';
		i = c;
		System.out.println("char类自动转换成int类"+i);
		float f = i;
		System.out.println("int类自动转换成f类"+f);
	}
}