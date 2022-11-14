package level1;

public class OccupationRecommend {
	public String solution(String[] table, String[] languages, int[] preference) {
		String answer = "";
		int sum = 0;
		int max = 0;
		int cnt = 0;
		int[] result = new int[table.length];
		String[] strArray = new String[table.length];
		if (languages.length <= table.length) {
			for (int i = 0; i < table.length; i++) {
				strArray = table[0].split(" ");
				System.out.println(strArray[i]);
				for(int j =0; j<strArray.length;j++) {
					if(strArray[i].equals(languages[cnt])) {
						//System.out.println(languages[cnt]);
						if(i==1) {
							sum += 5 *preference[cnt];
							cnt++;
						}else if(i==2) {
							sum += 4 *preference[cnt];
							cnt++;
						}else if(i==3) {
							sum += 3 *preference[cnt];
							cnt++;
						}else if(i==4) {
							sum += 2 *preference[cnt];
							cnt++;
						}else if(i==5) {
							sum += 1*preference[cnt];
							cnt++;
						}else {
							sum += 0;
						}
					}
				}
				max = Math.max(sum, max); //최대값 찾기
				//System.out.println(max);
			}
			
		}
		return answer;						
	}

	public static void main(String[] args) {
		OccupationRecommend or = new OccupationRecommend();
		String[] table = { "SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++",
				"HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP",
				"GAME C++ C# JAVASCRIPT C JAVA" };
		String[] languages = { "PYTHON", "C++", "SQL" };
		int[] preference = { 7, 5, 5 };
		System.out.println(or.solution(table, languages, preference));
	}

}
