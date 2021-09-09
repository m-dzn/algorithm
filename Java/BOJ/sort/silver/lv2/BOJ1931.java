package sort.silver.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 회의실 배정
public class BOJ1931 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 입력
        int N = stoi(br.readLine());

        int[][] meetings = new int[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            meetings[i][0] = stoi(st.nextToken());
            meetings[i][1] = stoi(st.nextToken());
        }
        br.close();

        // 처리
        int answer = solution(meetings);

        // 출력
        System.out.println(answer);
    }

    private static int solution(int[][] meetings) {
        int count = 0;

        Arrays.sort(meetings, new Comparator<int[]>() {
            @Override
            public int compare(int[] m1, int[] m2) {
                if (m1[1] == m2[1]) {
                    return m1[0] - m2[1];
                }
                return m1[1] - m2[1];
            }
        });

        int end = 0;
        for (int i = 0; i < meetings.length; i++) {
            if (end <= meetings[i][0]) {
                end = meetings[i][1];
                count++;
            }
        }

        return count;
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
