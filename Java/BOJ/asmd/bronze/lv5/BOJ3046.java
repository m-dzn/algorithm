package asmd.bronze.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// R2
public class BOJ3046 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R1 = stoi(st.nextToken());
        int S = stoi(st.nextToken());

        // 처리
        int answer = solution(R1, S);

        // 출력
        System.out.println(answer);
    }

    private static int solution(int R1, int S) {
        return S * 2 - R1;
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
