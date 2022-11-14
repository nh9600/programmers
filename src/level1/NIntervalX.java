package level1;

import java.util.Arrays;

public class NIntervalX {
	public long[] solution(int x, int n) {
	    long[] answer = new long[n];
	    
	      for(int i = 0; i < n; i++){
	          answer[i] = x * (i + 1);
	      }
	      return answer;
	}

	public static void main(String[] args) {
		NIntervalX nix = new NIntervalX();
		int x = -4;
		int n = 2;
		System.out.println(Arrays.toString(nix.solution(x, n)));
	}

}
