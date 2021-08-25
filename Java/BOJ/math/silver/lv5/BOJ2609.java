package math.silver.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 최대공약수와 최소공배수
public class BOJ2609 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        // 입력
        st = new StringTokenizer(br.readLine());

        int num1 = stoi(st.nextToken());
        int num2 = stoi(st.nextToken());

        br.close();

        // 처리
        String answer = solution(num1, num2);

        // 출력
        System.out.println(answer);
    }

    private static String solution(int num1, int num2) {
        int gcd = gcd(num1, num2);
        int lcm = num1 / gcd * num2;

        sb.append(gcd).append("\n").append(lcm);

        return sb.toString();
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;

        return gcd(b, a % b);
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
