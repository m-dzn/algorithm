package math.bronze.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 합
public class BOJ8393 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int n = Integer.parseInt(br.readLine());

        // 처리
        int answer = solution(n);

        // 출력
        System.out.println(answer);
    }

    private static int solution(int n) {
        return n * (n + 1) / 2;
    }

}
