package level1;

public class Year2016 {
	public String solution(int a, int b) {
        String answer = "";
        String[] days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};			
        String[] year = new String[366];
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        int want_day = 0;
        
        for(int i=0; i<year.length; i++) {
            year[i] =  days[(i+5)%7];
        }
        
        for(int i=0; i<a-1; i++) {
            want_day += month[i]; 
        }
        
        want_day += b-1;
        
        answer = year[want_day];
        
        return answer;
    }
	public static void main(String[] args) {
		Year2016 y = new Year2016();
		int a = 5;
		int b = 24;
		System.out.println(y.solution(a, b));
	}
		
	}

