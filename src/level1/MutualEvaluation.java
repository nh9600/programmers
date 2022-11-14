package level1;

public class MutualEvaluation {
	public String solution(int[][] scores) {
		String answer = "";
		double sum = 0;
		double average = 0;
		int max = 0;
		int min = 101;
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				if (max < scores[i][j]) max = scores[i][j];
				if (min > scores[i][j]) min = scores[i][j];
				sum += scores[j][i];
				
			}
			if(scores[i][i] == max || scores[i][i] == min ) {
				 average = (sum - scores[i][i]) / (scores.length - 1);
				//System.out.println(average);
			}else {
				average = sum / (scores.length);
				System.out.println(average);
			}
			answer += StrGrade(average);
			sum = 0;
			max = 0;
			min = 101;
		}
		return answer;
	}

	public String StrGrade(double average) {
		if (average >= 90) {
			return "A";
		} else if (average >= 80) {
			return "B";
		} else if (average >= 70) {
			return "C";
		} else if (average >= 50) {
			return "D";
		} else {
			return "F";
		}
	}

	public static void main(String[] args) {
		MutualEvaluation me = new MutualEvaluation();
		int[][] scores = { { 100, 90, 98, 88, 65 }, { 50, 45, 99, 85, 77 }, { 47, 88, 95, 80, 67 },
				{ 61, 57, 100, 80, 65 }, { 24, 90, 94, 75, 65 } };
		int[][] scores1 = { { 50, 90 }, { 50, 87 } };
		System.out.println(me.solution(scores));
	}

}
