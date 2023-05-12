package gameSever;

import java.util.ArrayList;

public class Game {
	private static Game instance = new Game();

	private static String GAME_NAME = "Nice Game";
	private ArrayList<User> userList = new ArrayList<>();
	private static ArrayList<Sever> severList = new ArrayList<>();

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

	public ArrayList<User> getUserList() {
		return userList;
	}

	public void addSever(Sever sever) {
		severList.add(sever);
	}

	public static ArrayList<Sever> getSeverList() {
		return severList;
	}

}
