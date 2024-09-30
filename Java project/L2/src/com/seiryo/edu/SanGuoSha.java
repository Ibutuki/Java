package com.seiryo.edu;
import java.util.Scanner;
public class SanGuoSha {
	public static void main(String[] args) {
		Heros []hero = new Heros[6];
		 hero[0] = new Heros("刘备",4,"仁德");
		 hero[1] = new Heros("赵云",4,"龙胆");
		 hero[2] = new Heros("曹操",4,"奸雄");
		 hero[3] = new Heros("夏侯惇",4,"刚烈");
		 hero[4] = new Heros("孙权",4,"制衡");
		 hero[5] = new Heros("周瑜",3,"反间");
		System.out.println("欢迎来到迷你版三国杀");
		System.out.println("-------------------");
		System.out.println("三国杀是一款以三国为背景的桌游");
		System.out.println("迷你版三国杀是一款以Java控制台游戏的程序");
		System.out.println("-----武将列表-----");
		for(int i = 0; i<hero.length; i++){
			System.out.println((i+1)+"."+hero[i].name+"\t血量："+hero[i].hp+"\t技能："+hero[i].skill);
		}
		System.out.println("请输入你的武将名称");
		boolean ifHave = false;
		do {
			Scanner sc = new Scanner(System.in);
			String name = sc.next();
			for(int i = 0; i<hero.length; i++){
				if(hero[i].name.equals(name)){
					System.out.println("你选择了"+name+"进入游戏");
					ifHave = true;
				}
			}
			if (!ifHave) {
				System.out.println("不存在该武将,请重新输入");
			}
		} while (true);
	}
}
