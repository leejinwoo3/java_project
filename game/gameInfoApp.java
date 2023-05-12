package game;

import gameSever.*;
import utils.Define;
import game.report.*;

public class gameInfoApp {
	Game goodUser = Game.getInstance();// Game 생성
	Sever cardan;
	Sever lupeon;
	GameReport gameReport = new GameReport();

	public static void main(String[] args) {
		gameInfoApp test = new gameInfoApp();
		test.createSever();// 서버생성
		test.createUser();// 유저 생성
		String report = test.gameReport.getReport();// 결과 생성
		System.out.println(report);
	}

	private void createSever() {
		// TODO Auto-generated method stub
		cardan = new Sever("카단", Define.CARDAN);
		lupeon = new Sever("루페온", Define.LUPEON);
		goodUser.addSever(cardan);
		goodUser.addSever(lupeon);
	}

	private void createUser() {
		// TODO Auto-generated method stub
		User user1 = new User(1655, "펀지", lupeon);
		User user2 = new User(1655, "방울토마토", cardan);
		User user3 = new User(1654,"한국",cardan);
		User user4 = new User(1653,"설화희빈",lupeon);
		User user5 = new User(1652,"성왕용",cardan);
		User user6 = new User(1651,"꽃비엘라",cardan);
		User user7 = new User(1645,"버서커",lupeon);
//		User user10 = new User("체리쁘",1635,azeroth);
//		User user11 = new User("용오리",1625,azeroth);
//		User user12 = new User("데리카나",1615,azeroth);
//		User user13 = new User("상큼코끼리",1605,azeroth);
		User user8 = new User(1675,"눕수먼",cardan);
		User user9 = new User(1695,"백보신장",cardan);
//		User user16 = new User("에레니아",1685,azeroth);
		User user10 = new User(1645,"레땅땅",lupeon);

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
//		goodUser.addSever(user11);
//		goodUser.addSever(user12);
//		goodUser.addSever(user13);
//		goodUser.addSever(user14);
//		goodUser.addSever(user15);
//		goodUser.addSever(user16);
//		goodUser.addSever(user17);

		lupeon.regeister(user1);
		cardan.regeister(user2);
		cardan.regeister(user3);
		lupeon.regeister(user4);
		cardan.regeister(user5);
		cardan.regeister(user6);
		lupeon.regeister(user7);
		cardan.regeister(user8);
		cardan.regeister(user9);
//		cardan.regeister(user15);
//		cardan.regeister(user14);
		lupeon.regeister(user10);
//		azeroth.regeister(user11);
//		azeroth.regeister(user12);
//		azeroth.regeister(user13);
//		azeroth.regeister(user16);

		addLvForUser(user1, lupeon, 1500);
		addLvForUser(user2, cardan, 1000);
		addLvForUser(user3, cardan, 1000);
		addLvForUser(user4, lupeon,900);
		addLvForUser(user5, cardan,900);
		addLvForUser(user6, cardan,1000);
		addLvForUser(user7, lupeon,670);
		addLvForUser(user8, cardan,4);
		addLvForUser(user9, cardan,870);
		addLvForUser(user10, lupeon,980);
//		addLvForUser(user11, azeroth,960);
//		addLvForUser(user12, azeroth,910);
//		addLvForUser(user13, azeroth,1400);
//		addLvForUser(user14, cardan,400);
//		addLvForUser(user15, cardan,300);
//		addLvForUser(user16, azeroth,0);
//		addLvForUser(user17, lupeon,700);

	}

	public void addLvForUser(User user, Sever sever, int score) {
		Lv lv = new Lv(user.getUserId(), sever, score);
		user.addSeverLv(lv);

	}

}
