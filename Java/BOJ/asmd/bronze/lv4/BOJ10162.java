package asmd.bronze.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 전자레인지
public class BOJ10162 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int T = Integer.parseInt(br.readLine());

        // 처리
        String answer = solution(T);

        // 출력
        System.out.println(answer);
    }

    private static String solution(int T) {
        if (T % 10 != 0) return "-1";

        StringBuilder sb = new StringBuilder();

        int[] buttons = {300, 60, 10};

        for (int button : buttons) {
            sb.append(T / button).append(' ');
            T %= button;
        }

        return sb.toString();
    }

}
