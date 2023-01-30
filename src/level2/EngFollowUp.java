package level2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EngFollowUp {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        Set<String> overlap = new HashSet<String>(Arrays.asList(words));
        for(int i = 1 ; i<words.length; i++) {
        	if(overlap.contains(words[i])) {
        		answer[0] = (i%n);
                answer[1] = (i/n);
        	}
        	
        	if(words[i].charAt(0) == words[i-1].charAt(words[i-1].length()-1)) {
        	}else {
        		answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
        	}
        }
        System.out.println(""+ answer[0]+ answer[1]);
        return answer;
    }
    
	public static void main(String[] args) {
		EngFollowUp efu = new EngFollowUp();
		String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		int n = 3;
		System.out.println(efu.solution(n, words));
	}

}
