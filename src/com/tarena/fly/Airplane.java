package com.tarena.fly;

import java.util.Random;

/**
 * 游戏里面敌人飞机
 */
public class Airplane extends FlyingObject implements Enemy {
	private int speed = 3;  //�ƶ�����
	
	public Airplane(){
		this.image = ShootGame.airplane;
		width = image.getWidth();
		height = image.getHeight();
		y = -height;          
		Random rand = new Random();
		x = rand.nextInt(ShootGame.WIDTH - width);
	}
	
	@Override
	public int getScore() {  
		return 5;
	}

	/** //Խ�紦�� */
	@Override
	public 	boolean outOfBounds() {   
		return y>ShootGame.HEIGHT;
	}

	/** �ƶ� */
	@Override
	public void step() {   
		y += speed;
	}

}

