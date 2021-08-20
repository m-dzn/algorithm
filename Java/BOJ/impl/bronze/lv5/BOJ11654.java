package impl.bronze.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 아스키 코드
public class BOJ11654 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        String ch = br.readLine();

        // 처리
        int answer = solution(ch);

        // 출력
        System.out.println(answer);
    }

    private static int solution(String ch) {
        return ch.charAt(0);
    }

}
