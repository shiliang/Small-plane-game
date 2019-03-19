package playersystem;

import java.util.Random;

import com.tarena.fly.Enemy;
import com.tarena.fly.ShootGame;

public class Airplane extends PlayerBuilder implements Enemy{
	private int speed = 3;
	public Airplane(){
		
	}
	
	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		this.player.image = ShootGame.airplane;
		this.player.width = this.player.image.getWidth();
		this.player.height = this.player.image.getHeight();
		this.player.y = -this.player.height;          
		Random rand = new Random();
		this.player.x = rand.nextInt(ShootGame.WIDTH - this.player.width);
	}

	@Override
	public void buildWeapon() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean outOfBounds() {
		// TODO Auto-generated method stub
		return this.player.y > ShootGame.HEIGHT;
	}

	@Override
	public void step() {
		// TODO Auto-generated method stub
		this.player.y += speed;
	}

	@Override
	public int getScore() {
		// TODO Auto-generated method stub
		return 5;
	}

}
