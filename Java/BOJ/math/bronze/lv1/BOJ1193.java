package math.bronze.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 분수찾기
public class BOJ1193 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int X = Integer.parseInt(br.readLine());

        // 처리
        String answer = solution(X);

        // 출력
        System.out.println(answer);
        br.close();
    }

    private static String solution(int X) {
        StringBuilder sb = new StringBuilder();

        int n = 1;
        int summation = n;
        while (summation < X) {
            n++;
            summation += n;
        }

        int diff = summation - X;

        if (n % 2 == 0) {
            sb.append(n - diff).append("/").append(diff + 1);
        } else {
            sb.append(diff + 1).append("/").append(n - diff);
        }

        return sb.toString();
    }

}
