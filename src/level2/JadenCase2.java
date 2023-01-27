package level2;

public class JadenCase2 {
	public String solution(String s) {
		String answer = "";
		String[] str = s.toLowerCase().split("");

		boolean bool = true;

		for (String ss : str) {
			answer += bool ? ss.toUpperCase() : ss;
			bool = ss.equals(" ") ? true : false;
		}

		return answer;
	}

	public static void main(String[] args) {
		JadenCase2 jc = new JadenCase2();
		String s = "3people unFollowed me";
		System.out.println(jc.solution(s));

	}
}
