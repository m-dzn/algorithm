package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1_LargeNumber {

    public static void main(String[] args) throws IOException {
        // 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        // 입력
        st = new StringTokenizer(br.readLine());
        int N = stoi(st.nextToken());    // 배열의 길이
        int M = stoi(st.nextToken());    // 총 덧셈 횟수
        int K = stoi(st.nextToken());    // 한 숫자 연속 덧셈 제한 횟수

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = stoi(st.nextToken());
        }

        // 처리
        int sum = solution(M, K, arr);

        // 출력
        System.out.println(sum);
    }

    private static int solution(int M, int K, int[] arr) {
        int max = arr[0], secondLargest = arr[1]; // 2 <= N

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                secondLargest = max;
                max = arr[i];
            }
        }

        int numOfDisCon = M / (K + 1);

        return secondLargest * numOfDisCon + max * (M - numOfDisCon);
    }

    private static int stoi(String line) {
        return Integer.parseInt(line);
    }

}
