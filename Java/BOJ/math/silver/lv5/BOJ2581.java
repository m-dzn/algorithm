package math.silver.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 소수
public class BOJ2581 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        // 입력
        int M = stoi(br.readLine());
        int N = stoi(br.readLine());
        br.close();

        // 처리
        String answer = solution(M, N);

        // 출력
        System.out.println(answer);
    }

    private static String solution(int M, int N) {
        StringBuilder sb = new StringBuilder();

        boolean[] prime = getPrimeNumbers(N);

        int primeSum = 0, minPrime = 0;

        for (int num = M; num <= N; num++) {
            if (!prime[num]) continue;

            primeSum += num;

            if (isFirst(minPrime)) {
                minPrime = num;
            }
        }

        if (isFirst(minPrime)) return "-1";

        sb.append(primeSum).append("\n")
            .append(minPrime);

        return sb.toString();
    }

    private static boolean isFirst(int minPrime) {
        return minPrime == 0;
    }

    private static boolean[] getPrimeNumbers(int N) {
        boolean[] prime = new boolean[N + 1];
        Arrays.fill(prime, true);
        prime[1] = false;

        for (int i = 4; i <= N; i += 2) {
            prime[i] = false;
        }

        for (int i = 3; i*i <= N; i += 2) {
            if (prime[i]) {
                for (int j = 2 * i; j <= N; j += i) {
                    prime[j] = false;
                }
            }
        }

        return prime;
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }
}
