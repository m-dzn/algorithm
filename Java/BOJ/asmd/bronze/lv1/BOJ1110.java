package asmd.bronze.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 더하기 사이클
public class BOJ1110 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int N = Integer.parseInt(br.readLine());

        // 처리
        int answer = solution(N);

        // 출력
        System.out.println(answer);
        br.close();
    }

    private static int solution(int N) {
        int temp = N, count = 0;

        do {
            int coeff10 = temp % 10;
            int coeff1 = (temp / 10 + coeff10) % 10;
            temp = (coeff10 * 10) + coeff1;
            count++;
        } while (temp != N);

        return count;
    }


}
