package level0;

public class HiddenNum {
	public int solution(String my_string) {
		int answer = 0;
		String temp = my_string.replaceAll("[^0-9]", "");
		System.out.println(temp);
		return answer;
	}

	public static void main(String[] args) {
		HiddenNum hn = new HiddenNum();
		String my_string = "aAb1B2cC34oOp";
		System.out.println(hn.solution(my_string));
	}

}
