package gameSever;

import java.util.ArrayList;

public class User {
	private String userName;
	private int userId;
	private static Sever mainSever;
	private static ArrayList<Lv> lvList = new ArrayList<Lv>();

	public User(String userName, int userId, Sever mainSever) {
		this.userName = userName;
		this.userId = userId;
		this.mainSever = mainSever;
	}

	public static void addSeverLv(Lv lv) {
		lvList.add(lv);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public static Sever getMainSever() {
		return mainSever;
	}

	public static void setMainSever(Sever mainSever) {
		User.mainSever = mainSever;
	}

	public static ArrayList<Lv> getLvList() {
		return lvList;
	}

	public static void setLvList(ArrayList<Lv> lvList) {
		User.lvList = lvList;
	}

	
}