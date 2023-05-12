package game;

import gameSever.*;
import gameSever.Sever;
import game.*;
import gameSever.User;
import utils.Define;
import game.report.*;
public class gameInfoApp {
	Game goodUser = Game.getInstance();
	Sever cardan;
	Sever lupeon;
	Sever azeroth;
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
		cardan= new Sever("카단",Define.CARDAN);
		lupeon= new Sever("루페온",Define.LUPEON);
		azeroth= new Sever("아제로스",Define.AZEROTH);
		goodUser.addSever(cardan);
		goodUser.addSever(lupeon);
		goodUser.addSever(azeroth);
	}

	private void createSever() {
		// TODO Auto-generated method stub
		User user1 = new User("펀지",1655,lupeon);
		User user2 = new User("원소술녀",1650,lupeon);
		User user3 = new User("빈새로이",1640,lupeon);
		User user4 = new User("방울토마토라면",1655,cardan);
		User user5 = new User("한국",1654,cardan);
		User user6 = new User("설화희빈",1653,cardan);
		User user7 = new User("성왕용",1652,cardan);
		User user8 = new User("꽃비엘라",1651,cardan);
		User user9 = new User("버서커",1645,lupeon);
		User user10 = new User("체리쁘",1635,azeroth);
		User user11 = new User("용오리",1625,azeroth);
		User user12 = new User("데리카나",1615,azeroth);
		User user13 = new User("상큼코끼리",1605,azeroth);
		User user14 = new User("눕수먼",1675,cardan);
		User user15 = new User("백보신장",1695,cardan);
		User user16 = new User("에레니아",1685,azeroth);
		User user17 = new User("레땅땅",1645,lupeon);
		
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
		
		lupeon.regeister(user1);
		lupeon.regeister(user2);
		lupeon.regeister(user3);
		lupeon.regeister(user9);
		lupeon.regeister(user17);
		cardan.regeister(user4);
		cardan.regeister(user5);
		cardan.regeister(user6);
		cardan.regeister(user7);
		cardan.regeister(user8);
		cardan.regeister(user15);
		cardan.regeister(user14);
		azeroth.regeister(user10);
		azeroth.regeister(user11);
		azeroth.regeister(user12);
		azeroth.regeister(user13);
		azeroth.regeister(user16);
		
		
		addLvForUser(user1, lupeon,1500);
		addLvForUser(user2, lupeon,700);
		addLvForUser(user3, lupeon,5);
		addLvForUser(user4, cardan,500);
		addLvForUser(user5, cardan,900);
		addLvForUser(user6, cardan,1000);
		addLvForUser(user7, cardan,670);
		addLvForUser(user8, cardan,4);
		addLvForUser(user9, lupeon,870);
		addLvForUser(user10, azeroth,980);
		addLvForUser(user11, azeroth,960);
		addLvForUser(user12, azeroth,910);
		addLvForUser(user13, azeroth,1400);
		addLvForUser(user14, cardan,400);
		addLvForUser(user15, cardan,300);
		addLvForUser(user16, azeroth,0);
		addLvForUser(user17, lupeon,700);
		
		} 
	public void addLvForUser(User user, Sever sever,int score) {
		Lv lv = new Lv(user.getUserId(),sever,score);
		user.addSeverLv(lv);
		
	}

	
}
