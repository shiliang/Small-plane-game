package playersystem;

import java.awt.image.BufferedImage;

import com.tarena.fly.ShootGame;

public class PlayerBuilderHero extends PlayerBuilder{

	
	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		this.player.life = 3;   
		this.player.doubleFire = 0;
		this.player.images = new BufferedImage[]{ShootGame.hero0, ShootGame.hero1}; 
		this.player.image = ShootGame.hero0;   
		this.player.width = this.player.image.getWidth();
		this.player.height = this.player.getHeight();
		this.player.x = 150;
		this.player.y = 400;
	}

	@Override
	public void buildWeapon() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean outOfBounds() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void step() {
		// TODO Auto-generated method stub
		
	}


}
