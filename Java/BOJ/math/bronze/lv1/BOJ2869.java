package math.bronze.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 달팽이는 올라가고 싶다
public class BOJ2869 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = stoi(st.nextToken());
        int B = stoi(st.nextToken());
        int V = stoi(st.nextToken());

        // 처리
        int answer = solution(A, B, V);

        // 출력
        System.out.println(answer);
        br.close();
    }

    private static int solution(int A, int B, int V) {
        int diff = A - B;

        return (int) Math.ceil((double) (V - A) / diff) + 1;
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
