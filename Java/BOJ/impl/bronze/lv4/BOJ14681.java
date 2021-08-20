package impl.bronze.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 사분면 고르기
public class BOJ14681 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int x = stoi(br.readLine());
        int y = stoi(br.readLine());

        // 처리
        int answer = solution(x, y);

        // 출력
        System.out.println(answer);
    }

    private static int solution(int x, int y) {
        if (x > 0) {
            return y > 0 ? 1 : 4;
        } else {
            return y > 0 ? 2 : 3;
        }
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
