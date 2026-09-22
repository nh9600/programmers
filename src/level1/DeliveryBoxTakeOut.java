package level1;

public class DeliveryBoxTakeOut {
    public int solution(int n, int w, int num) {

        // num이 몇 번째 층에 있는지
        int floor = (num - 1) / w;

        // num이 왼쪽에서 몇 번째 칸에 있는지
        int position = (num - 1) % w;

        // 짝수 층은 오른쪽 → 왼쪽으로 쌓으므로 위치를 뒤집는다.
        if (floor % 2 == 1) {
            position = w - 1 - position;
        }

        // 마지막 층 번호
        int lastFloor = (n - 1) / w;

        int answer = 1;

        // num 위의 층들을 확인
        for (int i = floor + 1; i <= lastFloor; i++) {

            int boxCount;

            // 마지막 층이 아니라면 상자가 w개 있음
            if (i < lastFloor) {
                boxCount = w;
            } 
            // 마지막 층이면 남은 상자 개수만큼 있음
            else {
                boxCount = n % w;

                // 딱 나누어 떨어지면 마지막 층도 w개
                if (boxCount == 0) {
                    boxCount = w;
                }
            }

            // 이 층에 같은 세로 위치의 상자가 존재하는지 확인
            if (i % 2 == 0) {
                // 왼쪽 → 오른쪽
                if (position < boxCount) {
                    answer++;
                }
            } else {
                // 오른쪽 → 왼쪽
                if (position >= w - boxCount) {
                    answer++;
                }
            }
        }

        return answer;
    }
    
    
	public static void main(String[] args) {
		DeliveryBoxTakeOut dbt = new DeliveryBoxTakeOut();
		int n = 22;
		int w = 6;
		int num = 8;
		
		System.out.println(""+ dbt.solution(n, w, num));
	}
}
