package asmd.bronze.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 사칙연산
public class BOJ10869 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = stoi(st.nextToken());
        int B = stoi(st.nextToken());

        // 처리
        String answer = solution(A, B);

        // 출력
        System.out.println(answer);
    }

    private static String solution(int A, int B) {
        StringBuilder sb = new StringBuilder();

        sb.append(A + B).append(System.lineSeparator());
        sb.append(A - B).append(System.lineSeparator());
        sb.append(A * B).append(System.lineSeparator());
        sb.append(A / B).append(System.lineSeparator());
        sb.append(A % B);

        return sb.toString();
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }
}
