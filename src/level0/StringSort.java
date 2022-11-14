package level0;

import java.util.Arrays;

public class StringSort {
    public String solution(String my_string) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        char[] cList = my_string.toLowerCase().toCharArray();
        Arrays.sort(cList);
        for(int i = 0; i<cList.length ; i++) {
        	sb.append(cList[i]);
        }
        
        return sb.toString();
    }
    public static void main(String[] args) {
		StringSort ss = new StringSort();
		String my_string = "Bcad";
		
		System.out.println(ss.solution(my_string));
	}
}
