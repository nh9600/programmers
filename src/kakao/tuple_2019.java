package kakao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class tuple_2019 {

    public static void main(String[] args) {
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        ArrayList<Integer> sList = new ArrayList<Integer>();
        s = s.replace("{", "");
        s = s.replace("},", "-");
        s = s.replace("}}", "");
        System.out.println(s);
        String[] array = s.split("-");
        /*Arrays.sort(array, new Comparator<String>() {//비교 문자열 배열
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());//길이순

            });

		for(int i = 0; i<array.length;i++){
                String[] chars = array[i].split(","); //c
                for (int j = 0; j < chars.length; j++) {
                    int num = Integer.parseInt(chars[j]);
                    if (!sList.contains(num)) {
                        sList.add(num);
                    }
                }
            }
		for(int i = 0; i<sList.size();i++){
			System.out.println(sList.get(i));
            }
        }

    } */
    }
}
