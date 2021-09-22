package stack.silver.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 괄호
public class BOJ9012 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        // 입력
        int T = stoi(br.readLine());

        // 처리
        for (int t = 0; t < T; t++) {
            String result = "YES";
            String parenthesis = br.readLine();
            int stack = 0;

            for (char ch : parenthesis.toCharArray()) {
                if (ch == '(') {
                    stack++;
                    continue;
                }

                if (stack == 0) {
                    result = "NO";
                    break;
                }

                stack--;
            }

            if (stack != 0) result = "NO";

            sb.append(result).append(System.lineSeparator());
        }

        // 출력
        System.out.println(sb);
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
