package level0;

import java.util.ArrayList;
import java.util.Arrays;

public class ChatArray {

	public static int[] solution(String my_string) {
		char[] c = my_string.toCharArray();
		ArrayList<Integer> al = new ArrayList<>();

		for (int i = 0; i < c.length; i++) {
			if (c[i] >= '0' && c[i] <= '9') {
				al.add(c[i] - '0');
			}
		}
		al.sort(null);
		
		int[] answer = new int[al.size()];
		for(int i=0;i<al.size();i++) {
			answer[i] = al.get(i);
		}
		return answer;
	}

	public static void main(String[] args) {
		String str = "hi12392";
		
		System.out.println(java.util.Arrays.toString(solution(str)));
		
		String result = str.replaceAll("[^0-9]", "");//숫자만 추출

		char[] arr = result.toCharArray();
		Arrays.sort(arr);

		result = new String(arr);
		System.out.println(result);
	}
}