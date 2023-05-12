package gameSever;

import java.util.ArrayList;

import utils.Define;

public class Sever {
	private String severName;
	private int severId;
	private int overType;
	
	private ArrayList<User> userList = new ArrayList<User>();
	
	public Sever(String severName,int severId) {
		this.severName =severName;
		this.severId=severId;
		this.overType = Define.AB_TYPE;
	}
	public void regeister(User user) {
		userList.add(user);
	}
	public String getSeverName() {
		return severName;
	}
	public void setSeverName(String severName) {
		this.severName = severName;
	}
	public int getSeverId() {
		return severId;
	}
	public void setSeverId(int severId) {
		this.severId = severId;
	}
	public int getOverType() {
		return overType;
	}
	public void setOverType(int overType) {
		this.overType = overType;
	}
	public ArrayList<User> getUserList() {
		return userList;
	}
	public void setUserList(ArrayList<User> userList) {
		this.userList = userList;
	}
	

}
