package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class Carpet {
	public int[] solution(int brown, int yellow) {
		int[] answer = new int[2];
		int area = brown + yellow;
		int length = 0;
		int width = 0;

		for (int i = 1; i < area; i++) {
			width = i;
			length = area / width;
			
			if ((length - 2) * (width - 2) == yellow) {
				answer[0] = length;
				answer[1] = width;
				break;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Carpet cp = new Carpet();
		int brown = 10;
		int yellow = 2;
		System.out.println(Arrays.toString(cp.solution(brown, yellow)));
	}
}
