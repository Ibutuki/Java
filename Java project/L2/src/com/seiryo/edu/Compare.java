package com.seiryo.edu;
import java.util.Scanner;
public class Compare {
	public static void main(String[] args) {
		System.out.println("-----�ܳ����Ƚ�-----");
		System.out.println("��������������");
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int a = sc1.nextInt();
		int b = sc1.nextInt();
		int gt = a>b?a:b;
		if (gt == 1) {
			System.out.println(a+"����"+b);
		}else{
			System.out.println(a+"С��"+b);
		}
		
	}
}
