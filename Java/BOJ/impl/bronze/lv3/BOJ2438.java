package impl.bronze.lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 별 찍기 - 1
public class BOJ2438 {

    private static final char STAR = '*';

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

        for (int i = 1 ; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append(STAR);
            }
            sb.append(System.lineSeparator());
        }

        return sb.toString();
    }

}
