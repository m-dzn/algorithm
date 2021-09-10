package greedy.silver.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 신입 사원
public class BOJ1946 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int T = stoi(br.readLine());

        // 입력 & 처리
        for (int t = 0; t < T; t++) {
            int N = stoi(br.readLine());

            int[][] applicants = new int[N][2];
            for (int i = 0 ; i < N; i++) {
                st = new StringTokenizer(br.readLine());

                applicants[i][0] = stoi(st.nextToken());
                applicants[i][1] = stoi(st.nextToken());
            }

            Arrays.sort(applicants, new Comparator<int[]>() {
                @Override
                public int compare(int[] a1, int[] a2) {
                    return a1[0] - a2[0];
                }
            });

            int pass = 0;
            int threshold = Integer.MAX_VALUE;
            for (int[] applicant : applicants) {
                if (threshold > applicant[1]) pass++;

                threshold = Math.min(threshold, applicant[1]);
            }

            sb.append(pass).append(System.lineSeparator());
        }

        // 출력
        System.out.println(sb);
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
