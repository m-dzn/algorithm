package sort.silver.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 중복 빼고 정렬하기
public class BOJ10867 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    private static final int BASE_VALUE = 1000;

    public static void main(String[] args) throws IOException {
        // 입력
        int N = stoi(br.readLine());
        boolean[] numbers = new boolean[2001];

        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        // 처리
        for (int i = 0; i < N; i++) {
            int number = stoi(st.nextToken()) + BASE_VALUE;
            numbers[number] = true;
        }

        // 출력
        for (int i = 0; i <= 2000; i++) {
            if (numbers[i]) sb.append(i - BASE_VALUE).append(" ");
        }

        System.out.println(sb);
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
