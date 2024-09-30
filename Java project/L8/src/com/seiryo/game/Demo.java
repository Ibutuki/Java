package com.seiryo.game;

public class Demo {
	public static void main(String[] args) {
		Character weiGuoCharacter = new WeiGuoCharacter("≤‹≤Ÿ", 4, "ºÈ–€");		
		Character shuGuoCharacter = new ShuGuoCharacter("’‘‘∆", 4, "¡˙µ®");
		Character wuGuoCharacter = new WuGuoCharacter("÷‹Ë§", 3, "∑¥º‰");
		weiGuoCharacter.fight();
		shuGuoCharacter.fight();
		shuGuoCharacter.fight();
	}
}
