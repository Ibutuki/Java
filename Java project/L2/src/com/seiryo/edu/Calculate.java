package com.seiryo.edu;
import java.util.Scanner;
public class Calculate {
	public static void main(String[] args) {
		System.out.println("-----曹冲来算-----");
		System.out.println("请输入两个整数");
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int a = sc1.nextInt();
		int b = sc1.nextInt();
		double div = a/b;
        String result = String.format("%.2f", div);
		System.out.println("曹冲计算加法："+a+"+"+b+"="+(double)(a+b));
		System.out.println("曹冲计算减法："+a+"-"+b+"="+(double)(a-b));
		System.out.println("曹冲计算乘法："+a+"x"+b+"="+(double)(a*b));
		System.out.println("曹冲计算除法："+a+"/"+b+"="+result);
	}
}
