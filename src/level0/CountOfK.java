package level0;

public class CountOfK {
	public int solution(int i, int j, int k) {
		int answer = 0;
		StringBuffer sb = new StringBuffer();
		for (int temp = i; temp <= j; temp++) {
			sb.append(temp);
		}
		for (int temp = 0; temp < sb.length(); temp++) {
			if (sb.charAt(temp) == (k + '0')) {
				answer++;
			}

		}
		return answer;
	}

	public static void main(String[] args) {
		CountOfK ck = new CountOfK();
		int i = 1;
		int j = 13;
		int k = 1;
		System.out.println(ck.solution(i, j, k));

	}

}
