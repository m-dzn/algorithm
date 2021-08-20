package asmd.bronze.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 나머지
public class BOJ10430 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = stoi(st.nextToken());
        int B = stoi(st.nextToken());
        int C = stoi(st.nextToken());

        // 처리
        String answer = solution(A, B, C);

        // 출력
        System.out.println(answer);

    }

    private static String solution(int A, int B, int C) {
        StringBuilder sb = new StringBuilder();

        sb.append((A + B) % C).append(System.lineSeparator());
        sb.append(((A % C) + (B % C)) % C).append(System.lineSeparator());
        sb.append((A * B) % C).append(System.lineSeparator());
        sb.append(((A % C) * (B % C)) % C);

        return sb.toString();
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
