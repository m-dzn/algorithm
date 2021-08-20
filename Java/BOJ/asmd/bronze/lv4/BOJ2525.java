package asmd.bronze.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 오븐 시계
public class BOJ2525 {

    static final int MINUTES_PER_HOUR = 60;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = stoi(st.nextToken());
        int B = stoi(st.nextToken());
        int C = stoi(br.readLine());

        // 처리
        String answer = solution(A, B, C);
        
        // 출력
        System.out.println(answer);
    }

    private static String solution(int A, int B, int C) {
        StringBuilder sb = new StringBuilder();

        int minutes = B + C;
        int hours = (A + (minutes / MINUTES_PER_HOUR)) % 24;
        minutes %= MINUTES_PER_HOUR;

        sb.append(hours).append(' ');
        sb.append(minutes);

        return sb.toString();
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
