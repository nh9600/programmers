package level0;

import java.util.ArrayList;
import java.util.Arrays;

public class AToB {
    public int solution(String before, String after) {
        char[] arr1 = before.toCharArray();
        char[] arr2 = after.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0 ; i < arr1.length;i++) {
        	if(arr1[i]!=arr2[i]) {
        		return 0;
        	}
        }
        return 1;
    }
    
    public static void main(String[] args) {
		AToB ab = new AToB();
		String before = "olleh";
		String after = "hello";
		System.out.println(ab.solution(before, after));
	}

}
