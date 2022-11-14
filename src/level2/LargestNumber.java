package level2;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
	public String solution(int[] numbers) {
		String[] result = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			result[i] = String.valueOf(numbers[i]);//valueOf를 이용해 String변환
		}
		//Arrays.sort(result, (o1, o2) -> (o2 + o1).compareTo(o1 + o2)); 람다식으로도 가능
		Arrays.sort(result, new Comparator<String>() {
			//앞에서부터 비교하다 다른 문자열이 나오면 'a-b' 순서로 해당 문자의 아스키코드 값을 뺀 결과(int)를 리턴 
			@Override
			public int compare(String o1, String o2) {
				return ((o2 + o1).compareTo(o1 + o2));
			}
		});

		// 0만 여러개 있는 배열의 경우 하나의 0만 리턴
		if (result[0].equals("0")) {
			return "0";
		}

		String answer = "";
		// 정렬된 문자 하나로 합치기
		for (String a : result) {
			answer += a;
		}
		return answer;
	}

	public static void main(String[] args) {
		LargestNumber ln = new LargestNumber();
		int[] numbers = { 6, 10, 2 };
		System.out.println(ln.solution(numbers));
	}
}
