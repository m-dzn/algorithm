package impl.bronze.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 곱셈
public class BOJ2588 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int num1 = stoi(br.readLine());
        int num2 = stoi(br.readLine());

        // 처리
        String answer = solution(num1, num2);

        // 출력
        System.out.println(answer);
    }

    private static String solution(int num1, int num2) {
        StringBuilder sb = new StringBuilder();
        final int BASE_NUMBER = 10;

        int sum = 0;
        int digit = 1;
        while (num2 > 0) {
            int calc = num1 * (num2 % BASE_NUMBER);
            sb.append(calc).append(System.lineSeparator());
            sum += calc * digit;

            num2 /= BASE_NUMBER;
            digit *= BASE_NUMBER;
        }

        sb.append(sum);

        return sb.toString();
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
