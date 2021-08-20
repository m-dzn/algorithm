package math.bronze.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 저작권
public class BOJ2914 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = stoi(st.nextToken());
        int I = stoi(st.nextToken());

        // 처리
        int answer = solution(A, I);
        
        // 출력
        System.out.println(answer);
    }

    private static int solution(int A, int I) {
        // I(평균 곡수) -1 한 것을 A(앨범 수록곡 수)에 곱해 준 뒤 +1하면 무조건 올림이 일어나므로
        int minMelodies = A * (I - 1) + 1;
        return minMelodies;
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
