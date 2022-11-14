package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MyWaySort {
	public String[] solution(String[] strings, int n) {

		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < strings.length; i++) {
			al.add(strings[i].charAt(n) + strings[i]);
			System.out.println(strings[i].charAt(n) + strings[i]);
		}
		
		Collections.sort(al);
		String[] answer = new String[al.size()];

		for (int i = 0; i < al.size(); i++) {
			answer[i] = al.get(i).substring(1, al.get(i).length());
		}
		
		return answer;
	}

	public static void main(String[] args) {
		String[] strings = { "sun", "bed", "car" };
		int n = 1;
		MyWaySort mws = new MyWaySort();

		System.out.println(Arrays.toString(mws.solution(strings, n)));
	}
}
