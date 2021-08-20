package impl.bronze.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

// 엄청난 부자2
public class BOJ1271 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 입력
        BigInteger n = stoi(st.nextToken());
        BigInteger m = stoi(st.nextToken());

        // 처리
        String answer = solution(n, m);

        // 출력
        System.out.println(answer);
    }

    private static String solution(BigInteger n, BigInteger m) {
        StringBuilder sb = new StringBuilder();

        sb.append(n.divide(m)).append("\n").append(n.mod(m));

        return sb.toString();
    }

    private static BigInteger stoi(String value) {
        return new BigInteger(value);
    }

}
