package com.seiryo.game;

public class Demo {
	public static void main(String[] args) {
		Character weiGuoCharacter = new WeiGuoCharacter("�ܲ�", 4, "����");		
		Character shuGuoCharacter = new ShuGuoCharacter("����", 4, "����");
		Character wuGuoCharacter = new WuGuoCharacter("���", 3, "����");
		weiGuoCharacter.fight();
		shuGuoCharacter.fight();
		shuGuoCharacter.fight();
	}
}
