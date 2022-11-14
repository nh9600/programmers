package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KakaoFailureRate {
	public int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		// 정렬
		Arrays.sort(stages);
		// 사용자
		int participant = stages.length;

		// ArrayList로 변환
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < stages.length; i++) {
			al.add(stages[i]);

		}
		// 중복제거
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		for (int i = 0; i < al.size(); i++) {
			if (!al2.contains(al.get(i))) {
				al2.add(al.get(i));
			}
		}
		// 빈도수
		Map<Integer, Double> frequency = new HashMap<Integer, Double>();
		for (int i = 0; i < N; i++) {
			frequency.put(i+1, (double) Collections.frequency(al, i+1));
		}

		// 실패율 계산
		Map<Integer, Double> failureRate = new HashMap<Integer, Double>();
		for (int i = 1; i <= N; i++) {
			if (frequency.containsKey(i)) {
				failureRate.put(i, (double) (frequency.get(i) / participant));
				System.out.println(failureRate);
				participant -= frequency.get(i);
			} else {
				failureRate.put(i, 0.0);
			}
		}

/*		// 내림차순
		int cnt = 0;
		List<Integer> keySetList = new ArrayList<Integer>(failureRate.keySet());
		Collections.sort(keySetList, (o1, o2) -> (failureRate.get(o2).compareTo(failureRate.get(o1))));
		for (Integer key : keySetList) {
			answer[cnt] = key;
			cnt++;
		}*/

		return answer;

	}

	public static void main(String[] args) {
		KakaoFailureRate kfr = new KakaoFailureRate();
		int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 };
		int[] stages1 = { 4, 4, 4, 4, 4, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3 };
		// 1,3,2,1,0
		// 8
		int N = 5;
		System.out.println(Arrays.toString(kfr.solution(5, stages)));
	}

}
