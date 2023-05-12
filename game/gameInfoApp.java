package game;

import gameSever.*;
import gameSever.Sever;
import game.*;
import gameSever.User;
import utils.Define;
import game.report.*;
public class gameInfoApp {
	Game goodUser = Game.getInstance();
	Sever CARDAN;
	Sever LUPEON;
	Sever AZEROTH;
	GameReport gameReport = new GameReport();
	
	public static void main(String[] args) {
		gameInfoApp test = new gameInfoApp();
		
		test.createSever();
		test.createUser();
		
		String report =test.gameReport.getReport();
		System.out.println(report);
	}

	private void createUser() {
		// TODO Auto-generated method stub
		CARDAN= new Sever("카단",Define.CARDAN);
		LUPEON= new Sever("루페온",Define.LUPEON);
		AZEROTH= new Sever("아제로스",Define.AZEROTH);
		goodUser.addSever(CARDAN);
		goodUser.addSever(LUPEON);
		goodUser.addSever(AZEROTH);
	}

	private void createSever() {
		// TODO Auto-generated method stub
		User user1 = new User("펀지",1655,LUPEON);
		User user2 = new User("원소술녀",1650,LUPEON);
		User user3 = new User("빈새로이",1640,LUPEON);
		User user4 = new User("방울토마토라면",1655,CARDAN);
		User user5 = new User("한국",1654,CARDAN);
		User user6 = new User("설화희빈",1653,CARDAN);
		User user7 = new User("성왕용",1652,CARDAN);
		User user8 = new User("꽃비엘라",1651,CARDAN);
		User user9 = new User("버서커",1645,LUPEON);
		User user10 = new User("체리쁘",1635,AZEROTH);
		User user11 = new User("용오리",1625,AZEROTH);
		User user12 = new User("데리카나",1615,AZEROTH);
		User user13 = new User("상큼코끼리",1605,AZEROTH);
		User user14 = new User("눕수먼",1675,CARDAN);
		User user15 = new User("백보신장",1695,CARDAN);
		User user16 = new User("에레니아",1685,AZEROTH);
		User user17 = new User("레땅땅",1645,LUPEON);
		
		goodUser.addUser(user1);
		goodUser.addUser(user2);
		goodUser.addUser(user3);
		goodUser.addUser(user4);
		goodUser.addUser(user5);
		goodUser.addUser(user6);
		goodUser.addUser(user7);
		goodUser.addUser(user8);
		goodUser.addUser(user9);
		goodUser.addUser(user10);
		goodUser.addUser(user11);
		goodUser.addUser(user12);
		goodUser.addUser(user13);
		goodUser.addUser(user14);
		goodUser.addUser(user15);
		goodUser.addUser(user16);
		goodUser.addUser(user17);
		
		LUPEON.regeister(user1);
		LUPEON.regeister(user2);
		LUPEON.regeister(user3);
		LUPEON.regeister(user9);
		LUPEON.regeister(user17);
		CARDAN.regeister(user4);
		CARDAN.regeister(user5);
		CARDAN.regeister(user6);
		CARDAN.regeister(user7);
		CARDAN.regeister(user8);
		CARDAN.regeister(user15);
		CARDAN.regeister(user14);
		AZEROTH.regeister(user10);
		AZEROTH.regeister(user11);
		AZEROTH.regeister(user12);
		AZEROTH.regeister(user13);
		AZEROTH.regeister(user16);
		
		
		addLvForUser(user1, LUPEON,1500);
		addLvForUser(user2, LUPEON,700);
		addLvForUser(user3, LUPEON,5);
		addLvForUser(user4, CARDAN,500);
		addLvForUser(user5, CARDAN,900);
		addLvForUser(user6, CARDAN,1000);
		addLvForUser(user7, CARDAN,670);
		addLvForUser(user8, CARDAN,4);
		addLvForUser(user9, LUPEON,870);
		addLvForUser(user10, AZEROTH,980);
		addLvForUser(user11, AZEROTH,960);
		addLvForUser(user12, AZEROTH,910);
		addLvForUser(user13, AZEROTH,1400);
		addLvForUser(user14, CARDAN,400);
		addLvForUser(user15, CARDAN,300);
		addLvForUser(user16, AZEROTH,0);
		addLvForUser(user17, LUPEON,700);
		
		} 
	public void addLvForUser(User user, Sever sever,int score) {
		Lv lv = new Lv(user.getUserId(),sever,score);
		user.addSeverLv(lv);
		
	}

	
}
