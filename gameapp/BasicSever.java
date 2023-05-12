package gameapp;

public class BasicSever implements OverLoad {

	@Override
	public String getCh(int score) {
		String ch;
		if (score >= 950 && score <= 1000)
			ch = "포화";
		else if (score >= 800 && score <= 949)
			ch = "쾌적";
		else if (score >= 600 && score <= 799)
			ch = "적정";
		else if (score >= 10 && score <= 599)
			ch = "부족";
		else
			ch = "서버 점검";

		return ch;
	}

}
