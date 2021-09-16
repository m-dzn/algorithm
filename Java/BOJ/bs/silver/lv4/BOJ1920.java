package bs.silver.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 수 찾기
public class BOJ1920 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        // 입력
        int N = stoi(br.readLine());
        int[] numbers = getNumbers(N);

        int M = stoi(br.readLine());
        int[] targetNumbers = getNumbers(M);
        br.close();

        // 처리
        String answer = solution(N, numbers, M, targetNumbers);

        // 출력
        System.out.println(answer);
    }

    private static String solution(int N, int[] numbers, int M, int[] targetNumbers) {
        StringBuilder sb = new StringBuilder();

        Arrays.sort(numbers);

        for (int i = 0; i < M; i++) {
            sb.append(isNumberExists(numbers, targetNumbers[i]))
                    .append(System.lineSeparator());
        }

        return sb.toString();
    }

    private static int isNumberExists(int[] numbers, int targetNumber) {
        int l = 0, r = numbers.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int pivot = numbers[mid];

            if (pivot > targetNumber) {
                r = mid - 1;
            } else if (pivot == targetNumber) {
                return 1;
            } else {
                l = mid + 1;
            }
        }

        return 0;
    }

    private static int[] getNumbers(int N) throws IOException {
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = stoi(st.nextToken());
        }

        return arr;
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
