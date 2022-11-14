package level1;

public class NewID {
	public String solution(String new_id) {

		// 1단계(소문자로 변경)
		String one = new_id.toLowerCase();

		// 2단계(정규화)
		String two = one.replaceAll("[^-_.a-z0-9]", "");

		// 3단계(점 변경)
		String three = two.toString().replace("..", ".");
		while (three.contains("..")) {
			three = three.replace("..", ".");
		}

		// 4단계(처음 혹은 끝에 점 제거)
		String four = three;
		String check1 = three.substring(0, 1); // 처음 점
		if (check1.equals(".")) {
			four = four.substring(1, four.length());
		}

		if (four.equals(null)) {
			String check2 = four.substring(four.length() - 1); // 끝 점
			if (check2.equals(".")) {
				four = four.substring(0, four.length() - 1);
			}
		}

		// 5단계(빈 문자열 확인)
		String five = four;
		if (five.length() == 0) {
			five = "a";
		}

		// 6단계(문자 길이 자르기)
		String six = five;
		if (six.length() >= 16) {
			six = six.substring(0, 15);
		}

		String check3 = six.substring(six.length() - 1); // 끝 점 제거
		if (check3.equals(".")) {
			six = six.substring(0, six.length() - 1);
		}

		// 7단계
		String seven = six;
		if (seven.length() < 3) {
			String lastPoint = seven.substring(seven.length() - 1);
			while (seven.length() < 3) {
				seven += lastPoint;
			}
		}

		return seven;
	}

	public static void main(String[] args) {
		NewID NewID = new NewID();
		String id = "abcdefghijklmn.p";
		System.out.println(NewID.solution(id));
	}
}
