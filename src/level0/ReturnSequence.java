package level0;

public class ReturnSequence {

    public static int solution(int[] arr) {

        int answer = 0;

        while (true) {
            int[] before = arr.clone();

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2;

                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }

            answer++;

            if (java.util.Arrays.equals(before, arr)) {
                return answer - 1;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 100, 99, 98};

        System.out.println(solution(arr));
    }
}