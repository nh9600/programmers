package level2;

import java.util.Arrays;

public class MaxandMin {
	public String solution(String s) {
    	String[] str = s.split(" ");
    	int[] intList = new int[str.length];
    	for(int i = 0 ; i< str.length ; i++) {
    		intList[i] = Integer.parseInt(str[i]);
    	}
    	Arrays.sort(intList);
    	
    	String anser = intList[0]+ " " + intList[intList.length-1];
    	return anser;
    }
    
    public static void main(String[] args) {
    	MaxandMin mm = new MaxandMin();
    	
    	String s = 	"1 -2 -3 4";
    	System.out.println(mm.solution(s));
   
	}

}
