package sort.silver.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 소트인사이드
public class BOJ1427 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        // 입력
        int N = Integer.parseInt(br.readLine());
        br.close();

        // 처리
        int answer = solution(N);

        // 출력
        System.out.println(answer);
    }

    private static int solution(int N) {
        final int BASE_NUMBER = 10;
        int[] bucket = new int[BASE_NUMBER];

        while (N > 0) {
            bucket[N % BASE_NUMBER]++;
            N /= BASE_NUMBER;
        }

        int sortedNumber = 0;
        for (int i = BASE_NUMBER - 1; i >= 0; i--) {
            for (int j = 0; j < bucket[i]; j++) {
                sortedNumber *= BASE_NUMBER;
                sortedNumber += i;
            }
        }

        return sortedNumber;
    }

}
