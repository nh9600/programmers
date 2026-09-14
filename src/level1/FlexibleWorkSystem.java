package level1;

public class FlexibleWorkSystem {
	
    public static int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = schedules.length;
         
        outer:
        for(int i=0;i<schedules.length;i++) {
            int hour = schedules[i] / 100; 
            int min = schedules[i] % 100;
            
            min = min + 10; 
            if(min >= 60) {
            	hour++;
                min -= 60;
            }
            
            int time = hour * 100 + min;
            
            for (int j = 0; j < timelogs[i].length; j++) {
                int day = startday + j;

                // 일요일 다음은 월요일로 변경
                if (day > 7) {
                    day -= 7;
                }

                if (day == 6 || day == 7) {
                    continue;
                }

                // 지각인지 체크
                if (time < timelogs[i][j]) {
                    answer--;
                    continue outer;
                }
            }
        }
        return answer;
    }
    
    
	public static void main(String[] args) {
		FlexibleWorkSystem fws = new FlexibleWorkSystem();
	    int[] schedules = {700, 800, 1100};

	    int[][] timelogs = {
	        {710, 2359, 1050, 700, 650, 631, 659},
	        {800, 801, 805, 800, 759, 810, 809},
	        {1105, 1001, 1002, 600, 1059, 1001, 1100}
	    };
	    
	    int startday = 5;
		System.out.println(fws.solution(schedules, timelogs, startday));

	}
}
