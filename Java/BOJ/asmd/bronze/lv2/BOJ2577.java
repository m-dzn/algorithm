package asmd.bronze.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 숫자의 개수
public class BOJ2577 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int A = stoi(br.readLine());
        int B = stoi(br.readLine());
        int C = stoi(br.readLine());

        // 처리
        String answer = solution(A, B, C);

        // 출력
        System.out.println(answer);
    }

    private static String solution(int A, int B, int C) {
        final int BASE_NUMBER = 10;
        StringBuilder sb = new StringBuilder();

        int[] countingArr = new int[BASE_NUMBER];

        int multABC = A * B * C;

        while (multABC > 0) {
            countingArr[multABC % BASE_NUMBER]++;

            multABC /= BASE_NUMBER;
        }

        for (int count : countingArr) {
            sb.append(count).append(System.lineSeparator());
        }

        return sb.toString();
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
