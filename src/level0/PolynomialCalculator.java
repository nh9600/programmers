package level0;

public class PolynomialCalculator {
	public String solution(String polynomial) {
		String answer = "";
		String[] arr = polynomial.split("\\+");
		int x = 0;
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i].trim();
			if (arr[i].contains("x")) {
				if (arr[i].equals("x")) {
					x++;
				} else {
					x += Integer.parseInt(arr[i].substring(0, arr[i].length() - 1));
				}
			} else {
				num += Integer.parseInt(arr[i]);
			}
		}
		
		if (x > 0) {
			if (x == 1) {
				answer = "x";
			} else {
				answer = x + "x";
			}
		}
		
		if (num > 0) {
			if (!answer.equals("")) {
				answer += " + ";
			}
			answer += num;
		}
		return answer;
	}
}
