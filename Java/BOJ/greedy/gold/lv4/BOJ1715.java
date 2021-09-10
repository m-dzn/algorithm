package greedy.gold.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// 카드 정렬하기
public class BOJ1715 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        // 입력
        int N = stoi(br.readLine());
        int[] decks = getCardDecks(N);

        // 처리
        long answer = solution(N, decks);

        // 출력
        System.out.println(answer);
    }

    private static long solution(int N, int[] decks) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int deck : decks) {
            pq.add(deck);
        }

        int cnt = 0;
        int sum = 0;
        int tempSum = 0;
        while (!pq.isEmpty()) {
            if (cnt % 2 == 0) {
                tempSum = pq.poll();
            } else {
                tempSum += pq.poll();
                pq.add(tempSum);
                sum += tempSum;
            }

            cnt++;
        }

        return sum;
    }

    private static int[] getCardDecks(int N) throws IOException {
        int[] decks = new int[N];

        for (int i = 0; i < N; i++) {
            decks[i] = stoi(br.readLine());
        }

        return decks;
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
