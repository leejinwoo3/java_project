package gameSever;

import java.util.ArrayList;

public class Game {
	private static Game instance = null;

	private static String GAME_NAME = "Nice Game";
	private ArrayList<Sever> severList = new ArrayList<>();
	private ArrayList<User> userList = new ArrayList<>();

	private Game() {
	}

	public static Game getInstance() {
		if (instance == null) {
			instance = new Game();
		}
		return instance;
	}

	public void addUser(User user) {
		userList.add(user);
	}

	public void addSever(Sever sever) {
		severList.add(sever);
	}

	public ArrayList<User> getUserList() {
		return userList;
	}

	public ArrayList<Sever> getSeverList() {
		return severList;
	}

}
