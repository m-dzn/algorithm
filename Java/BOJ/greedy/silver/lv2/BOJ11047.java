package greedy.silver.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 동전 0
public class BOJ11047 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static int N, K;
    private static int[] coinUnits;

    public static void main(String[] args) throws IOException {
        // 입력
        input();

        // 처리
        int answer = solution(K, coinUnits);

        // 출력
        System.out.println(answer);
    }

    private static int solution(int K, int[] coinUnits) {
        int count = 0;

        for (int i = coinUnits.length - 1; i >= 0; i--) {
            count += K / coinUnits[i];

            K %= coinUnits[i];
        }

        return count;
    }

    private static void input() {

        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = stoi(st.nextToken());
            K = stoi(st.nextToken());

            coinUnits = new int[N];

            for (int i = 0; i < N; i++) {
                coinUnits[i] = stoi(br.readLine());
            }
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
