package level0;

public class NoEnglislh2 {
    public long solution(String numbers) {
        long answer = 0;
        String[] temp = { "zero", "one", "two", 
        		"three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0 ; i<temp.length;i++) {
        	numbers = numbers.replace(numbers,temp[i]);
        }
        answer = Integer.parseInt(numbers);
        return answer;
    }
    
    public static void main(String[] args) {
    	NoEnglislh2 ne = new NoEnglislh2();
    	String numbers = "onefourzerosixseven";
    	System.out.println(ne.solution(numbers));
    	
	}

}
