package sort.silver.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 수 정렬하기 3
public class BOJ10989 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static final int NUMBER_RANGE = 10000;

    public static void main(String[] args) throws IOException {
        // 입력
        int N = stoi(br.readLine());
        int[] numbers = getNumberArray(N);
        br.close();

        // 처리
        String answer = solution(numbers);

        // 출력
        System.out.println(answer);
    }

    private static String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        int[] countingArray = new int[NUMBER_RANGE + 1];

        for (int number : numbers) {
            countingArray[number]++;
        }

        for(int i = 1; i < countingArray.length; i++) {
            for (int j = 0; j < countingArray[i]; j++) {
                sb.append(i).append("\n");
            }
        }
        return sb.toString();
    }

    private static int[] getNumberArray(int N) throws IOException {
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = stoi(br.readLine());
        }
        return arr;
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
