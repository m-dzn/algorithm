package asmd.bronze.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// A/B
public class BOJ1008 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = stoi(st.nextToken());
        int B = stoi(st.nextToken());

        // 처리
        double answer = solution(A, B);

        // 출력
        System.out.println(answer);
    }

    private static double solution(int A, int B) {
        return (double) A / B;
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
