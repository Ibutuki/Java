package com.seiryo.edu;
import java.util.Scanner;
public class Calculate {
	public static void main(String[] args) {
		System.out.println("-----�ܳ�����-----");
		System.out.println("��������������");
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int a = sc1.nextInt();
		int b = sc1.nextInt();
		double div = a/b;
        String result = String.format("%.2f", div);
		System.out.println("�ܳ����ӷ���"+a+"+"+b+"="+(double)(a+b));
		System.out.println("�ܳ���������"+a+"-"+b+"="+(double)(a-b));
		System.out.println("�ܳ����˷���"+a+"x"+b+"="+(double)(a*b));
		System.out.println("�ܳ���������"+a+"/"+b+"="+result);
	}
}
