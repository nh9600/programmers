package level2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Tuple {
	public int[] solution(String s) {
        
		//괄호 제거
        String[] arr = s.replaceAll("[{]", " ").replaceAll("[}]", " ").trim().split(" , ");
        
        //튜플이 적은 순으로 정렬
        Arrays.sort(arr, (a, b)->{return a.length() - b.length();});
        System.out.println(Arrays.toString(arr));
        
        int[] result = new int[arr.length];
        int index = 0;
        Set<String> numbers = new HashSet<>();
        for (String chunk : arr)
            for (String element : chunk.split(",")) {
                if (numbers.add(element)) result[index++] = Integer.parseInt(element);
            }
            	
        return result;
    }

	 
	 public static void main(String[] args) {
		Tuple tuple = new Tuple();
		String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
		System.out.println(Arrays.toString((tuple.solution(s))));
	}
}
