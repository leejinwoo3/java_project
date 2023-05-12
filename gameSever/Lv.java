package gameSever;

public class Lv {
	private int userId;
	private Sever sever;
	private int score;

	public Lv(int userId, Sever sever, int score) {
		this.userId = userId;
		this.sever = sever;
		this.score = score;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "서버 : " + this.userId + " , " + sever.getSeverName() + ":" + score;
	}

	public int getuserId() {
		return userId;
	}

	public void setuserId(int userId) {
		this.userId = userId;
	}

	public Sever getSever() {
		return sever;
	}

	public void setSever(Sever sever) {
		this.sever = sever;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
