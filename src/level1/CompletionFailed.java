package level1;

import java.util.Arrays;

public class CompletionFailed {
    public String solution(String[] participant, String[] completion) {
    	 String answer = "";
    	 
    	 Arrays.sort(participant);
         Arrays.sort(completion);
         
    	 for (int i = 0; i < completion.length; i++) {
             if (!participant[i].equals(completion[i])) {
                 return answer = participant[i];
             }
             //return answer = participant[participant.length-1]; 
         }
        return answer;
    }
    
    public static void main(String[] args) {
    	String[] participant = {"leo", "kiki", "eden"};
    	String[] completion = {"eden", "leo"};
    	
    	CompletionFailed cf = new CompletionFailed();
    	//cf.solution(participant, completion); 
    	System.out.println(cf.solution(participant, completion));
    	
   
    }
}
