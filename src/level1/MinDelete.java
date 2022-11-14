package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class MinDelete {
	public int[] solution(int[] arr) {
		int[] answer = {};

		int[] temp = arr.clone();
		Arrays.sort(temp);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (temp[0] != arr[i]) {
				al.add(arr[i]);
			}
		}
		answer = new int[al.size()];
		for (int i = 0; i < al.size(); i++) {
				answer[i] = al.get(i);
		}
		
		if (arr.length <= 1) {
			int[] answer2 = { -1 };
			return answer2;
		}

	return answer;

	}

	public static void main(String[] args) {
		MinDelete md = new MinDelete();
		int[] arr = { 4, 3, 2, 1 };
		int[] arr1 = { 10 };
		System.out.println(Arrays.toString(md.solution(arr)));
	}

}
