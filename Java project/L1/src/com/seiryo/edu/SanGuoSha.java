package com.seiryo.edu;
import java.util.Scanner;
public class SanGuoSha {
	public static void main(String[] args) {
		String []name = {"刘备","赵云","曹操","夏侯惇","孙权","周瑜"};
		System.out.println("欢迎来到迷你版三国杀");
		System.out.println("-------------------");
		System.out.println("三国杀是一款以三国为背景的桌游");
		System.out.println("迷你版三国杀是一款以Java控制台游戏的程序");
		System.out.println("-----武将列表-----");
		System.out.println(name[0]+"\t"+name[1]);
		System.out.println(name[2]+"\t"+name[3]);
		System.out.println(name[4]+"\t"+name[5]);
		System.out.println("请输入你的武将名称");
		boolean ifHave = false;
		do {
			Scanner sc = new Scanner(System.in);
			String hero = sc.next();
			for(int i = 0; i<name.length; i++){
				if(name[i].equals(hero)){
					System.out.println("你选择了"+hero+"进入游戏");
					ifHave = true;
				}
			}
			if (!ifHave) {
				System.out.println("不存在该武将,请重新输入");
			}
		} while (true);
	}
}
