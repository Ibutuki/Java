package com.seiryo.edu;
import java.util.Scanner;
public class SanGuoSha {
	public static void main(String[] args) {
		Heros []hero = new Heros[6];
		 hero[0] = new Heros("����",4,"�ʵ�");
		 hero[1] = new Heros("����",4,"����");
		 hero[2] = new Heros("�ܲ�",4,"����");
		 hero[3] = new Heros("�ĺ",4,"����");
		 hero[4] = new Heros("��Ȩ",4,"�ƺ�");
		 hero[5] = new Heros("���",3,"����");
		System.out.println("��ӭ�������������ɱ");
		System.out.println("-------------------");
		System.out.println("����ɱ��һ��������Ϊ����������");
		System.out.println("���������ɱ��һ����Java����̨��Ϸ�ĳ���");
		System.out.println("-----�佫�б�-----");
		for(int i = 0; i<hero.length; i++){
			System.out.println((i+1)+"."+hero[i].name+"\tѪ����"+hero[i].hp+"\t���ܣ�"+hero[i].skill);
		}
		System.out.println("����������佫����");
		boolean ifHave = false;
		do {
			Scanner sc = new Scanner(System.in);
			String name = sc.next();
			for(int i = 0; i<hero.length; i++){
				if(hero[i].name.equals(name)){
					System.out.println("��ѡ����"+name+"������Ϸ");
					ifHave = true;
				}
			}
			if (!ifHave) {
				System.out.println("�����ڸ��佫,����������");
			}
		} while (true);
	}
}
