package level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DandarinPick {
	public int solution(int k, int[] tangerine) {
		int answer = 0;
		
		//사이즈
		Map<Integer,Integer> size = new HashMap<>();		
		for(int i =0;i<tangerine.length;i++) {
			size.put(tangerine[i], size.getOrDefault(tangerine[i], 0)+1);
		}
		
		//키값
		List<Integer> key = new ArrayList<>(size.keySet());
		//내림차순
		key.sort((o1,o2)->size.get(o2)-size.get(o1));
		
		//k개수만큼 담기
		int i = 0;
		while(k>0) {
			k -= size.get(key.get(i));
			answer++;
			i++;
		}
		return answer;
	}

	public static void main(String[] args) {
		DandarinPick dp = new DandarinPick();
		int k = 6;
		int[] tangerine = { 1, 3, 2, 5, 4, 5, 2, 3 };
		System.out.println(dp.solution(k, tangerine));
	}

}
