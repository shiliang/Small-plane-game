package playersystem;

public abstract class PlayerBuilder {
	protected Player player = new Player();
	
	public abstract void buildBody();
	
	public abstract void buildWeapon();
	
	public Player getPlayer() {
		return player;
	}
	
	public abstract boolean outOfBounds();
	

	public abstract void step();
	

}
