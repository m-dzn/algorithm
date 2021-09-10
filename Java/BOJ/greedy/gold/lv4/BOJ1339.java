package greedy.gold.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 단어 수학
public class BOJ1339 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        // 입력
        int N = Integer.parseInt(br.readLine());
        int[] alphabets = new int[26];

        // 입력 & 처리
        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            int digit = 1;
            for (int j = word.length() - 1; j >= 0; j--) {
                int idx = word.charAt(j) - 'A';
                alphabets[idx] += digit;
                digit *= 10;
            }
        }

        Arrays.sort(alphabets);
        int sum = 0;
        int multiplier = 9;
        for (int i = alphabets.length - 1; i >= 0; i--) {
            if (alphabets[i] > 0) {
                sum += multiplier * alphabets[i];
                multiplier--;
            }
        }
        
        // 출력
        System.out.println(sum);
    }

}
