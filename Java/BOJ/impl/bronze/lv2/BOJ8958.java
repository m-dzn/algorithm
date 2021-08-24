package impl.bronze.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// OX퀴즈
public class BOJ8958 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        // 입력
        int n = Integer.parseInt(br.readLine());
        String[] oxArray = getOxArray(n);

        // 처리
        String answer = solution(oxArray);

        // 출력
        System.out.println(answer);
    }

    private static String solution(String[] oxArray) {
        StringBuilder sb = new StringBuilder();

        int score = 0;
        int combo = 0;

        for (String ox : oxArray) {
            for (char ch : ox.toCharArray()) {
                if (ch == 'O') {
                    score += ++combo;
                } else {
                    combo = 0;
                }
            }
            sb.append(score).append(System.lineSeparator());
            score = combo = 0;
        }

        return sb.toString();
    }

    private static String[] getOxArray(int n) throws IOException {
        String[] arr = new String[n];

        for (int i = 0 ; i < n; i++) {
            arr[i] = br.readLine();
        }

        return arr;
    }

}
