package impl.bronze.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// 긴자리 계산
public class BOJ2338 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        BigInteger A = stoi(br.readLine());
        BigInteger B = stoi(br.readLine());

        // 처리
        String answer = solution(A, B);

        // 출력
        System.out.println(answer);
    }

    private static String solution(BigInteger A, BigInteger B) {
        StringBuilder sb = new StringBuilder();

        sb.append(A.add(B)).append("\n");
        sb.append(A.subtract(B)).append("\n");
        sb.append(A.multiply(B));

        return sb.toString();
    }

    private static BigInteger stoi(String value) {
        return new BigInteger(value);
    }

}
