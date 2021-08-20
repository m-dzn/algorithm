package math.bronze.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 16진수
public class BOJ1550 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        String num = br.readLine();

        // 처리
        int answer = solution(num);

        // 출력
        System.out.println(answer);
    }

    private static int solution(String num) {
        int result = 0;

        for (int i = 0; i < num.length(); i++) {
            result *= 16;
            result += hexToDecimal(num.charAt(i));
        }

        return result;
    }

    private static int hexToDecimal(char num) {
        if (num >= 'A') {
            return num - 'A' + 10;
        }
        return num - '0';
    }

}

class BOJ1550_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        String num = br.readLine();

        // 처리
        int answer = solution(num);

        // 출력
        System.out.println(answer);
    }

    private static int solution(String num) {
        int result = 0, digit = 1;

        for (int i = num.length() - 1; i >= 0; i--) {
            result += hexToDecimal(num.charAt(i)) * digit;
            digit *= 16;
        }

        return result;
    }

    private static int hexToDecimal(char num) {
        if (num >= 'A') {
            return num - 'A' + 10;
        }
        return num - '0';
    }

}