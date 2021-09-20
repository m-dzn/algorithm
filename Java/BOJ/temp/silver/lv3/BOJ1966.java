package temp.silver.lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ1966 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int T = stoi(br.readLine());

        // 테스트 케이스 순회
        StringTokenizer st;

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            
            int N = stoi(st.nextToken());   // 전체 문서 개수
            int targetDoc = stoi(st.nextToken()); // 궁금한 문서

            st = new StringTokenizer(br.readLine());

            int[] documents = getDocuments(st); // 문서들의 우선순위 목록

            Queue<Integer> que = enqueue(documents);    // 문서들을 큐에 담기

            Arrays.sort(documents);
            int maxIdx = N - 1;
            int cnt = 0;

            while (!que.isEmpty()) {
                int currentPriority = que.poll();

                if (currentPriority >= documents[maxIdx]) {
                    cnt++;
                    maxIdx--;

                    if (targetDoc == 0) break;
                } else {
                    que.offer(currentPriority);
                }

                targetDoc = targetDoc > 0 ? targetDoc - 1 : que.size() - 1;
            }

            sb.append(cnt).append(System.lineSeparator());
        }

        // 출력
        System.out.println(sb);
    }

    private static Queue<Integer> enqueue(int[] documents) {
        Queue<Integer> que = new LinkedList<>();

        for (int priority : documents) {
            que.offer(priority);
        }

        return que;
    }

    private static int[] getDocuments(StringTokenizer st) {
        int[] documents = new int[st.countTokens()];

        for (int i = 0; i < documents.length; i++) {
            documents[i] = stoi(st.nextToken());
        }

        return documents;
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
