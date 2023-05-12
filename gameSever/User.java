package gameSever;

import java.util.ArrayList;

public class User {
	private int userId;
	private String userName;
	private  Sever mainSever;
	private  ArrayList<Lv> lvList = new ArrayList<Lv>();

	public User(String userName, int userId, Sever mainSever) {
		this.userName = userName;
		this.userId = userId;
		this.mainSever = mainSever;
	}

	public  void addSeverLv(Lv lv) {
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

	public  Sever getMainSever() {
		return mainSever;
	}

	public  void setMainSever(Sever mainSever) {
		this.mainSever = mainSever;
	}

	public  ArrayList<Lv> getLvList() {
		return lvList;
	}

	public  void setLvList(ArrayList<Lv> lvList) {
		this.lvList = lvList;
	}

}