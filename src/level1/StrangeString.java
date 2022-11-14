package level1;

public class StrangeString {
	public String solution(String s) {
		String answer = "";
		String[] arr = s.split("");
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (!arr[i].equals(" ")) {
				if (j % 2 == 0) {
					 j++;
					arr[i] = arr[i].toUpperCase();
				} else if((j% 2 != 0)) {
					j++;
					arr[i] = arr[i].toLowerCase();
				}
			}else {
				j = 0; //초기화
			}
			answer += arr[i];
		}
		return answer;
	}

	public static void main(String[] args) {
		StrangeString ss = new StrangeString();
		String s = "trfsdfy helsfdslo wo  asdsd ld";
		System.out.println(ss.solution(s));
	}

}
