package asmd.bronze.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 손익분기점
public class BOJ1712 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = stoi(st.nextToken());
        int B = stoi(st.nextToken());
        int C = stoi(st.nextToken());

        // 처리
        int answer = solution(A, B, C);

        // 출력
        System.out.println(answer);
    }

    private static int solution(int A, int B, int C) {
        int netProfitPerUnit = C - B;
        return netProfitPerUnit > 0 ? A / netProfitPerUnit + 1 : -1;
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
