package greedy.silver.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

// 로프
public class BOJ2217 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int N;
    private static Integer[] ropes;

    public static void main(String[] args) {
        // 입력
        input();

        // 처리
        int answer = solution(N, ropes);

        // 출력
        System.out.println(answer);
    }

    private static int solution(int N, Integer[] ropes) {
        Arrays.sort(ropes, Collections.reverseOrder());

        int maxTotalWeight = 0;
        for (int i = 0; i < N; i++) {
            int tempTotalWeight = ropes[i] * (i + 1);

            if (maxTotalWeight < tempTotalWeight) {
                maxTotalWeight = tempTotalWeight;
            }
        }

        return maxTotalWeight;
    }

    private static void input() {
        try {
            N = stoi(br.readLine());
            ropes = new Integer[N];

            for (int i = 0; i < N; i++) {
                ropes[i] = stoi(br.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}

class BOJ2217_2 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int N;
    private static int[] ropes;

    public static void main(String[] args) {
        input();

        int answer = solution(N, ropes);

        System.out.println(answer);
    }

    private static int solution(int N, int[] ropes) {
        int max = 0;
        int cnt = 0;

        for (int i = ropes.length - 1; i >= 0; i--) {
            if (ropes[i] > 0) cnt += ropes[i];

            int tempWeight = i * cnt;
            max = Math.max(max, tempWeight);
        }

        return max;
    }

    private static void input() {
        try {
            N = stoi(br.readLine());
            ropes = new int[10001];

            for (int i = 0; i < N; i++) {
                int rope = stoi(br.readLine());
                ropes[rope]++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
