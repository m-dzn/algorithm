package ds.silver.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 요세푸스
public class BOJ1158 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        // 입력
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = stoi(st.nextToken());
        int K = stoi(st.nextToken());
        br.close();

        // 처리
        String answer = solution(N, K);

        // 출력
        System.out.println(answer);
    }

    private static String solution(int N, int K) {
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        Queue<Integer> que = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            que.offer(i);
        }

        while (que.size() > 1) {
            for (int i = 0; i < K - 1; i++) {
                que.offer(que.poll());
            }
            sb.append(que.poll()).append(", ");
        }

        sb.append(que.poll()).append(">");
        return sb.toString();
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
class BOJ1158_ArrayList {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        // 입력
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = stoi(st.nextToken());
        int K = stoi(st.nextToken());
        br.close();

        // 처리
        String answer = solution(N, K);

        // 출력
        System.out.println(answer);
    }

    private static String solution(int N, int K) {
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            arr.add(i);
        }

        int diff, idx;
        diff = idx = K - 1;
        while (arr.size() > 1) {
            int output = arr.remove(idx);
            idx = (idx + diff) % arr.size();

            sb.append(output).append(", ");
        }

        sb.append(arr.get(0)).append(">");
        return sb.toString();
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}