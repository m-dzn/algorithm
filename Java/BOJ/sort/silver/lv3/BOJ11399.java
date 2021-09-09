package sort.silver.lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// ATM
public class BOJ11399 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    private static int N;
    private static int[] times;

    public static void main(String[] args) {
        // 입력
        input();

        // 처리
        int answer = solution(N, times);

        // 출력
        System.out.println(answer);
    }

    private static int solution(int N, int[] times) {
        int minTotalTime = 0;

        Arrays.sort(times);
        for (int i = 0; i < N; i++) {
            minTotalTime += times[i] * (N - i);
        }

        return minTotalTime;
    }

    private static void input() {
        try {
            N = stoi(br.readLine());
            times = new int[N];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                times[i] = stoi(st.nextToken());
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
