package level0;


import java.util.Collections;

public class AlienAge {
    public String solution(int age) {

        StringBuffer sb = new StringBuffer();
        String[] ages = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        int temp = 0;
        while (age > 0) {
            temp = age % 10;
            sb.append(ages[temp]);
            age = age / 10;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        AlienAge aa = new AlienAge();
        int age = 23;
        System.out.println(aa.solution(age));
    }

}
