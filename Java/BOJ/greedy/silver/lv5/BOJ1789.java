package greedy.silver.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 수들의 합
public class BOJ1789 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static long S;

    public static void main(String[] args) throws IOException {
        S = Long.parseLong(br.readLine());

        int N = 1;
        long sum = 0;

        while (true) {
            sum = (long) N * (N + 1) / 2;

            if (sum > S) {
                break;
            }

            N += 1;
        }

        N--;

        System.out.println(N);
    }

}
