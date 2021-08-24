package asmd.bronze.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 숫자의 합
public class BOJ11720 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int N = stoi(br.readLine());
        String numStr = br.readLine();
        br.close();

        // 처리
        int answer = solution(N, numStr);

        // 출력
        System.out.println(answer);

    }

    private static int solution(int N, String numStr) {
        int sum = 0;
        for (char ch : numStr.toCharArray()) {
            sum += ch - '0';
        }
        return sum;
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
