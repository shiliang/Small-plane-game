package skillsystem;

import java.util.Arrays;

import com.tarena.fly.Bullet;

import playersystem.Player;

public class ShotCommand implements Command {
	private Player player;
	private int shootIndex;
	private Bullet[] bullets = {};
		
	public ShotCommand(Player player, Bullet[] bullets) {
		super();
		this.player = player;
		this.bullets = bullets;
		shootIndex = 0;
	}

	public void shootAction() {
		//shootIndex++;
/*		if (shootIndex % 30 == 0) {
			Bullet[] bs = player.shoot(); 
			bullets = Arrays.copyOf(bullets, bullets.length + bs.length); 
			System.arraycopy(bs, 0, bullets, bullets.length - bs.length,
					bs.length);
		}*/
		
		Bullet[] bs = player.shoot(); 
		System.out.println("进行射击");
		bullets = Arrays.copyOf(bullets, bullets.length + bs.length); 
		System.arraycopy(bs, 0, bullets, bullets.length - bs.length,
				bs.length);
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		shootAction();
	}

}
