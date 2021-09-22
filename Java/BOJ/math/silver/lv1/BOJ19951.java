package math.silver.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 태상이의 훈련소 생활
public class BOJ19951 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        // 입력
        st = new StringTokenizer(br.readLine());
        int N = stoi(st.nextToken());
        int M = stoi(st.nextToken());

        int[] ground = getGround(N);

        // 처리
        // 누적 변화량 배열 구하기
        int[] accumulated = getAccArr(N, M);
        for (int i = 2; i <= N; i++) accumulated[i] += accumulated[i - 1];

        // 초기값 배열에 누적 변화량 배열을 더해 효율적인 누적 합 구하기
        for (int i = 1; i <= N; i++) ground[i] += accumulated[i];

        // 출력
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            sb.append(ground[i]).append(' ');
        }

        System.out.println(sb);
    }

    private static int[] getGround(int N) throws IOException {
        int[] arr = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = stoi(st.nextToken());
        }

        return arr;
    }

    private static int[] getAccArr(int N, int M) throws IOException {
        int[] arr = new int[N + 2];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = stoi(st.nextToken());
            int b = stoi(st.nextToken());
            int k = stoi(st.nextToken());

            arr[a] += k;
            arr[b + 1] -= k;
        }

        return arr;
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
