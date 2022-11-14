package level1;

public class StringPandY {
	boolean solution(String s) {
		boolean answer = true;
		char[] c = s.toUpperCase().toCharArray();
		int y = 0;
		int p = 0;

		for (int i = 0; i < c.length; i++) {
			int test1 = (c[i] == 'P') ? p++ : y++;
			int test2 = (c[i] == 'Y') ? y++ : p++;
		}

		return (p == y || p == 0 && y == 0) ? true : false;
	}

	public static void main(String[] args) {
		StringPandY spy = new StringPandY();
		String s = "oo";
		System.out.println(spy.solution(s));
	}

}
