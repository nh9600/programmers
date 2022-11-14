package level1;

public class HarshadNumber {
	public boolean solution(int x) {
		int sum = 0;
		int y = x;
		while (y > 0) {
			sum += y % 10;
			//y /= 10;
		}
		if (x % sum == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		HarshadNumber hn = new HarshadNumber();
		int arr = 11;
		System.out.println(hn.solution(arr));
	}

}
