package level2;

import java.util.Arrays;

public class MaxandMin {
	public String solution(String s) {
    	String[] str = s.split(" ");
    	for(int i = 0 ; i< str.length ; i++) {
    	}
    	StringBuilder sb = new StringBuilder();
    	sb.append(str[0]+ " ");
    	sb.append(str[str.length-1]);
    	
    	return sb.toString();
    }
    
    public static void main(String[] args) {
    	MaxandMin mm = new MaxandMin();
    	
    	String s = 	"1 -2 -3 4";
    	System.out.println(mm.solution(s));
   
	}

}
