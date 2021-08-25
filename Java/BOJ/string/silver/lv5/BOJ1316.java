package string.silver.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 그룹 단어 체커
public class BOJ1316 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        // 입력
        int N = Integer.parseInt(br.readLine());
        String[] words = getWordArray(N);

        // 처리
        int answer = solution(words);

        // 출력
        System.out.println(answer);
        br.close();
    }

    private static int solution(String[] words) {
        int groupWordCnt = 0;

        for (String word : words) {
            groupWordCnt += checkGroupWord(word);
        }

        return groupWordCnt;
    }

    private static int checkGroupWord(String word) {
        boolean[] alphabets = new boolean[26];

        char before = ' ';
        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';

            if (before == ch) continue;

            if (alphabets[idx]) return 0;

            alphabets[idx] = true;
            before = ch;
        }

        return 1;
    }

    private static String[] getWordArray(int N) throws IOException {
        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        return arr;
    }

}
