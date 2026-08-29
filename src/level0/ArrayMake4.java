package level0;

import java.util.ArrayList;

public class ArrayMake4 {

	public static ArrayList<Integer> solution(int[] arr) {

	    ArrayList<Integer> al = new ArrayList<>();
	    al.add(arr[0]);

	    for (int i = 1; i < arr.length; i++) {

	        if (al.get(al.size() - 1) < arr[i]) {
	            al.add(arr[i]);
	        } else {
	            al.remove(al.size() - 1);
	            i--;
	            if (al.isEmpty()) {
	                al.add(arr[i + 1]);
	                i++;
	            }
	        }
	    }

	    return al;
	}

    public static void main(String[] args) {

        int[] arr = {1, 4, 2, 5, 3};

        System.out.println(solution(arr));
    }
}