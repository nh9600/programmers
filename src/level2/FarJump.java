package level2;

public class FarJump {
	public long solution(int n) {
		long answer = 0;
		long[] arr = new long[2001];
		arr[1] = 1;
		arr[2] = 2;

		//3부터 시작
		for (int i = 3; i < 2001; i++) {
			arr[i] = (arr[i - 1] + arr[i - 2]) % 1234567;
			System.out.println(arr[i]);
		}
		return arr[n];
	}

	public static void main(String[] args) {
		FarJump fj = new FarJump();
		int n = 4;
		System.out.println(fj.solution(n));

	}

}
