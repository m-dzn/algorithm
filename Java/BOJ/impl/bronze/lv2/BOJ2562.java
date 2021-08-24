package impl.bronze.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 최대값
public class BOJ2562 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        // 처리
        String answer = solution();

        // 출력
        System.out.println(answer);
        br.close();
    }

    private static String solution() throws IOException {
        StringBuilder sb = new StringBuilder();
        int[] numbers = new int[9];

        int maxIdx = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = stoi(br.readLine());
            if (numbers[maxIdx] < numbers[i]) {
                maxIdx = i;
            }
        }

        sb.append(numbers[maxIdx]).append(System.lineSeparator());
        sb.append(maxIdx + 1);

        return sb.toString();
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
