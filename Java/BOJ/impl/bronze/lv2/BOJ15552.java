package impl.bronze.lv2;

import java.io.*;
import java.util.StringTokenizer;

// 빠른 A+B
public class BOJ15552 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        // 입력
        int T = stoi(br.readLine());

        // 처리
        solution(T);

        // 출력
        bw.flush();
        br.close();
        bw.close();
    }

    private static void solution(int T) throws IOException {
        StringTokenizer st;

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            int A = stoi(st.nextToken());
            int B = stoi(st.nextToken());

            bw.write(String.valueOf(A + B));
            bw.write(System.lineSeparator());
        }
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
