package gameSever;

import java.util.ArrayList;

public class User {
	private int userId;
	private String userName;
	private Sever mainSever;
	private ArrayList<Lv> lvList = new ArrayList<>();

	public User(int userId, String userName, Sever mainSever) {
		this.userId = userId;
		this.userName = userName;
		this.mainSever = mainSever;
	}

	public void addSeverLv(Lv lv) {
		lvList.add(lv);
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Sever getMainSever() {
		return mainSever;
	}

	public void setMainSever(Sever mainSever) {
		this.mainSever = mainSever;
	}

	public ArrayList<Lv> getLvList() {
		return lvList;
	}

	public void setLvList(ArrayList<Lv> lvList) {
		this.lvList = lvList;
	}

	

}