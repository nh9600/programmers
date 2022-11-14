package level1;

import java.util.Arrays;

public class KNum2 {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int[] arrTemp = {};
		int temp2 = 0;
		for (int i = 0; i < commands.length; i++) {
			arrTemp = Arrays.copyOf(array, array.length); // 초기화
			int a = commands[i][0] - 1;
			int b = commands[i][1];
			arrTemp = Arrays.copyOfRange(array, a, b);// 부분 복사
			Arrays.sort(arrTemp);// 정렬
			answer[i] = arrTemp[commands[i][2]-1];
		}

		return answer;
	}

	public static void main(String[] args) {
		KNum2 kn = new KNum2();
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		System.out.println(Arrays.toString(kn.solution(array, commands)));
	}

}
