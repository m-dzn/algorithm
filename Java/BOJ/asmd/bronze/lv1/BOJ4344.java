package asmd.bronze.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 평균은 넘겠지
public class BOJ4344 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {


        // 입력
        int C = stoi(br.readLine());

        // 처리
        String answer = solution(C);

        // 출력
        System.out.println(answer);
        br.close();
    }

    private static String solution(int C) throws IOException {
        StringBuilder sb = new StringBuilder();

        for (int c = 0; c < C; c++) {
            // 입력
            st = new StringTokenizer(br.readLine());
            int N = stoi(st.nextToken());
            int[] scores = new int[N];
            int sum = 0;

            for (int i = 0; i < N; i++) {
                scores[i] = stoi(st.nextToken());
                sum += scores[i];
            }

            int avg = sum / N;

            int count = 0;
            for (int score : scores) {
                if (score > avg) {
                    count++;
                }
            }

            sb
                .append(String.format("%.3f", (double) count * 100 / N))
                .append('%')
                .append(System.lineSeparator());
        }




        return sb.toString();
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
