package com.game.seiryo;

public class WuGuoCharacter extends Character{
	public WuGuoCharacter (){
		
	}
	public WuGuoCharacter(String name, int maxHp, String skill){
		super(name, maxHp, skill);
	}
	public void fight(){
		System.out.println("擅长水域地形进行搏杀");
	}
}
