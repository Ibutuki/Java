package com.seiryo.edu;
import java.util.Scanner;
public class SanGuoSha {
	public static void main(String[] args) {
		String []name = {"����","����","�ܲ�","�ĺ","��Ȩ","���"};
		System.out.println("��ӭ�������������ɱ");
		System.out.println("-------------------");
		System.out.println("����ɱ��һ��������Ϊ����������");
		System.out.println("���������ɱ��һ����Java����̨��Ϸ�ĳ���");
		System.out.println("-----�佫�б�-----");
		System.out.println(name[0]+"\t"+name[1]);
		System.out.println(name[2]+"\t"+name[3]);
		System.out.println(name[4]+"\t"+name[5]);
		System.out.println("����������佫����");
		boolean ifHave = false;
		do {
			Scanner sc = new Scanner(System.in);
			String hero = sc.next();
			for(int i = 0; i<name.length; i++){
				if(name[i].equals(hero)){
					System.out.println("��ѡ����"+hero+"������Ϸ");
					ifHave = true;
				}
			}
			if (!ifHave) {
				System.out.println("�����ڸ��佫,����������");
			}
		} while (true);
	}
}
