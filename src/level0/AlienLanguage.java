package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AlienLanguage {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        int cnt = 0;
        for(int i = 0 ; i <dic.length ; i++){
            for(int j = 0 ; j <spell.length ; j++){
                if(dic[i].contains(spell[j])){
                    cnt++;
                    System.out.println(dic[i]);
                }
            }
            if(cnt == spell.length){
                return 1;
            }
            cnt = 0; //초기화
        }
        /**
         * 스트림으로 풀이할 경우
         */
        int streamAnswer = Arrays.stream(dic).map(s -> s.chars().sorted()//한자리씩 끝어서 정렬
                .mapToObj(i -> String.valueOf((char) i)) //정수스트림을 스트림으로 표현
                .collect(Collectors.joining()))//스트링
                .collect(Collectors.toList())//리스트로 변환
                .contains(Arrays.stream(spell).sorted().collect(Collectors.joining())) ? 1 : 2;//비교
        return 2;
    }

    public static void main(String[] args) {
        String[] dic = {"def", "dww", "dzx", "loveaw"};
        String[] spell = {"z", "d", "x"};
        AlienLanguage al = new AlienLanguage();
        System.out.println(al.solution(spell,dic));
    }

}
