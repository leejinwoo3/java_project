package game.report;

import java.util.ArrayList;

import gameSever.*;
import utils.Define;
import gameapp.*;

public class GameReport {
	Game game = Game.getInstance();
	public static final String TITLE = "유저 \t\t\n";
	public static final String HEADER = "유저 | 레벨 | 서버 | 서버상태    \n";
	public static final String LINE = "=====================================\n";
	private StringBuffer buffer = new StringBuffer();

	public String getReport() {
		ArrayList<Sever> severList = game.getSeverList(); // 과목 리스트(국어, 수학) 불러오기
		for (Sever sever : severList) {
			makeHeader(sever);
			makeBody(sever);
			makeFooter();
		}

		return buffer.toString(); // buffer의 데이터를 String타입으로 바꾼다.
	}

	private void makeHeader(Sever sever) {
		buffer.append(GameReport.LINE);
		buffer.append("\t" + sever.getSeverName());
		buffer.append(GameReport.TITLE);
		buffer.append(GameReport.HEADER);
		buffer.append(GameReport.LINE);
	}

	private void makeBody(Sever sever) {
		ArrayList<User> userList = sever.getUserList();

		for (int i = 0; i < userList.size(); i++) {
			User user = userList.get(i);
			buffer.append(user.getUserName()); // 서버이름
			buffer.append(" | ");
			buffer.append(user.getUserId()); // 학번
			buffer.append(" | ");
			buffer.append(user.getMainSever().getSeverName() + "\t");
			buffer.append(" | ");

			getSever(user, sever.getSeverId());
			buffer.append("\n");
			buffer.append(LINE);
		}
	}

	private void getSever(User user, int severId) {
		// TODO Auto-generated method stub
		ArrayList<Lv> lvList = user.getLvList();
		int mainId = user.getMainSever().getSeverId();

		OverLoad[] overLoad = { new BasicSever(), new PopulaSever() };

		for (int i = 0; i < lvList.size(); i++) {
			Lv lv = lvList.get(i);
			if (lv.getSever().getSeverId() == severId) {
				String ch;
				if (lv.getSever().getSeverId() == mainId) {
					ch = overLoad[Define.SAB_TYPE].getCh(lv.getScore());
				} else {
					ch = overLoad[Define.AB_TYPE].getCh(lv.getScore());
				}
				buffer.append(lv.getScore());
				buffer.append(":");
				buffer.append(ch);
				buffer.append(" | ");
			}
		}
	}

	private void makeFooter() {
		buffer.append("\n");
	}
}
