package level0;

public class Login {
	public String solution(String[] id_pw, String[][] db) {
		String answer = "";
		for (int i = 0; i < db.length; i++) {
			if (id_pw[0].equals(db[i][0])) {
				if (id_pw[1].equals(db[i][1])) {
					return "login";
				} else {
					return "wrong pw";
				}
			} else {
				answer = "fail";
			}

		}
		return answer;
	}

	public static void main(String[] args) {
		Login l = new Login();
		String[] id_pw = { "meosseugi", "1234" };
		String[][] db = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };
		System.out.println(l.solution(id_pw, db));
	}

}
