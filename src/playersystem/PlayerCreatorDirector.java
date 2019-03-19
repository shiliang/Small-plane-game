package playersystem;

public class PlayerCreatorDirector {
	private PlayerBuilder pb;
	
	PlayerCreatorDirector(PlayerBuilder play) {
		this.pb = play;
	}
	
	public Player getPlayer() {
		return this.pb.getPlayer();
	}
	
	public void buildPlayer() {
		pb.buildBody();
	}
}
