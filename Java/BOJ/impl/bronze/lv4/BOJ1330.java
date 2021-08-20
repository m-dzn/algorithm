package impl.bronze.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 두 수 비교하기
public class BOJ1330 {

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
        return A > B ? ">" : A < B ? "<" : "==";
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
