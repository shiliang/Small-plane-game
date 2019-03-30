package skillsystem;

import java.util.HashMap;

public class ShortcutKey {
	
	private HashMap<String,Command> hashCommand = new HashMap<String,Command>();
	
	public ShortcutKey() {
		
	}
	
	public void addCommand(String key,Command command) {
		hashCommand.put(key, command);
	}
	
	public void removeCommand(String key) {
		hashCommand.remove(key);
	}
	
	//按键调用不同的命令
	public void press(String keycode) {
		Command c = hashCommand.get(keycode);
		c.execute();
	}
}
