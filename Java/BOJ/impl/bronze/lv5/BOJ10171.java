package impl.bronze.lv5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 고양이
public class BOJ10171 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 처리
        String answer = solution();

        // 출력
        System.out.println(answer);
    }

    private static String solution() {
        StringBuilder sb = new StringBuilder();

        sb.append("\\    /\\").append(System.lineSeparator());
        sb.append(" )  ( ')").append(System.lineSeparator());
        sb.append("(  /  )").append(System.lineSeparator());
        sb.append(" \\(__)|").append(System.lineSeparator());

        return sb.toString();
    }

}
