package level2;

import java.util.Arrays;

public class Frequency {

	public static void main(String[] args) {
		// [1] 입력 : 범위 : 0부터 5까지의 값만 들어온다고 가정
		int[] data = { 1, 3, 4, 3, 5, 8 };
		int mode = 0; // 최빈값이 담길 그릇
		int[] index = new int[10]; // 0~5까지 : 인덱스의 카운터
		int max = Integer.MIN_VALUE; // 최대값을 저장하기위한 변수 ; 초기값은 정수형의 최소값지정
		System.out.println(max);
		// [2] 처리
		for (int i = 0; i < data.length; i++) {
			index[data[i]]++; // COUNT
		}

		System.out.println(Arrays.toString(index));
		for (int i = 0; i < index.length; i++) {
			if (max < index[i]) {
				max = index[i]; // MAX
				mode = i; // 최빈값
			}
		}

		// [3] 출력
		System.out.println("최빈값 : " + mode + " , " + max + "번"); // 3, 2번
	}

}
