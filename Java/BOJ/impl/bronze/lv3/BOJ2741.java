package impl.bronze.lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// N 찍기
public class BOJ2741 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int N = Integer.parseInt(br.readLine());

        // 처리
        String answer = solution(N);

        // 출력
        System.out.println(answer);
    }

    private static String solution(int N) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <=N; i++) {
            sb.append(i).append(System.lineSeparator());
        }

        return sb.toString();
    }

}
