package greedy.bronze.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 설탕 배달
public class BOJ2839 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int N = Integer.parseInt(br.readLine());

        // 처리
        int answer = solution(N);

        // 출력
        System.out.println(answer);
        br.close();
    }

    private static int solution(int N) {
        int count = 0;

        while (N > 0) {
            if (N % 5 == 0) {
                return count + N / 5;
            } else {
                N -= 3;
                count++;
            }
        }

        return N == 0 ? count : -1;
    }

}
