package level0;

public class OverlapString {
	public String solution(String my_string) {
		String answer = "";

		for (int i = 0; i < my_string.length(); i++) {
			if(my_string.indexOf(my_string.charAt(i)) == i) answer += my_string.charAt(i);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		OverlapString os = new OverlapString();
		String my_string = "people";
		System.out.println(os.solution(my_string));

	}

}
