package gameapp;

public class PopulaSever implements OverLoad {

	@Override
		public String getCh(int score) {
			String ch;
			if (score >= 1450 && score <= 1500)
				ch = "과포화";
			else if (score >= 1300 && score <= 1449)
				ch = "포화";
			else if (score >= 1150 && score <= 1299)
				ch = "쾌적";
			else if (score >= 1000 && score <= 1149)
				ch = "적정";
			else if (score >= 10 && score <= 999)
				ch = "청정";
			else
				ch = "서버점검";

			return ch;
	}
	
}
