package com.tarena.fly;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import skillsystem.Command;
import skillsystem.ShortcutKey;

public class MyKeyListener extends KeyAdapter{
	private ShortcutKey sc = new ShortcutKey();	
	
	public void keyPressed(KeyEvent e){
		char charA=e.getKeyChar();
		String s = Character.toString(charA);
		sc.press(s);
	}
	
	public void addCommand(String key, Command c) {
		sc.addCommand(key, c);
	}
}
