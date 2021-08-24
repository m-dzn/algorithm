package impl.bronze.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 단어 공부
public class BOJ1157 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        String words = br.readLine();

        // 처리
        char answer = solution(words);

        // 출력
        System.out.println(answer);
    }

    private static char solution(String words) {
        int[] countingSort = new int[26];

        int max = 0;
        for (char ch : words.toCharArray()) {
            int idx = Character.toLowerCase(ch) - 'a';
            countingSort[idx]++;

            max = Math.max(max, countingSort[idx]);
        }

        int frequentIdx = -1;
        for (int i = 0; i < countingSort.length; i++) {
            if (countingSort[i] != max) continue;

            if (frequentIdx != -1) return '?';
            frequentIdx = i;
        }
        return (char) ('A' + frequentIdx);
    }

}
