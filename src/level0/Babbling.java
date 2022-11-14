package level0;

public class Babbling {

	public int solution(String[] babbling) {
		int answer = 0;
		String[] word = { "aya", "ye", "woo", "ma" };
		for (int i = 0; i < babbling.length; i++) {
			for (int j = 0; j < babbling.length; j++) {
				if (babbling[i].contains(word[j])) {

				}
			}
		}
		return answer;

	}

	public static void main(String[] args) {
		Babbling bb = new Babbling();

		String[] babbling = { "aya", "yee", "u", "maa" };
		System.out.println(bb.solution(babbling));
	}

}
