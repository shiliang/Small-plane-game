package playersystem;

public class PlayerCreatorDirector {
	private PlayerBuilder pb;
	
	public PlayerCreatorDirector() {
	}
	
	public Player getPlayer() {
		return this.pb.getPlayer();
	}
	
	public void setPlayer(PlayerBuilder play) {
		this.pb = play;
	}
	
	public void buildPlayer() {
		pb.buildBody();
		pb.buildWeapon();
	}
}
