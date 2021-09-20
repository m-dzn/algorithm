package temp.silver.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// Router
public class BOJ15828 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        // 입력
        int bufferSize = stoi(br.readLine());

        // 준비
        Queue<Integer> que = new LinkedList<>();

        // 처리
        int packet = 0;
        while (packet != -1) {
            if (packet == 0) {
                que.poll();
            } else if (que.size() < bufferSize) {
                que.offer(packet);
            }

            packet = stoi(br.readLine());
        }

        if (que.isEmpty()) {
            sb.append("empty");
        } else {
            que.forEach(item -> sb.append(item).append(' '));
        }

        // 출력
        System.out.println(sb);
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
