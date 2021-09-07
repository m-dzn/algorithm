package temp.silver.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 한 수
public class BOJ1065 {

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
        int count = 0;

        for (int i = 1; i <= N; i++) {
            boolean isHansu = true;

            if (i < 100) {
                count++;
            } else {
                int temp = i;

                int prev = temp % BASE_NUMBER;
                temp /= BASE_NUMBER;
                int current = temp % BASE_NUMBER;

                int diff = prev - current;

                do {
                    prev = current;
                    current = temp % BASE_NUMBER;

                    if (diff != prev - current) {
                        isHansu = false;
                        break;
                    }

                    temp /= BASE_NUMBER;
                }
                while (temp > 0);

                if (isHansu) count++;
            }
        }

        return count;
    }


}
