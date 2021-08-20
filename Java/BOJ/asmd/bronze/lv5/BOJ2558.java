package asmd.bronze.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// A+B - 2
public class BOJ2558 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int A = stoi(br.readLine());
        int B = stoi(br.readLine());

        // 처리
        int answer = solution(A, B);

        // 출력
        System.out.println(answer);
    }

    private static int solution(int a, int b) {
        return a + b;
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
