package sort.silver.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

// 단어 정렬
public class BOJ1181 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        // 입력
        int N = Integer.parseInt(br.readLine());
        String[] words = getWords(N);
        br.close();

        // 처리
        String answer = solution(words);

        // 출력
        System.out.println(answer);
    }

    private static String solution(String[] words) {
        StringBuilder sb = new StringBuilder();

        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                if (str1.length() == str2.length()) {
                    return str1.compareTo(str2);
                }

                return str1.length() - str2.length();
            }
        });

        sb.append(words[0]).append("\n");
        for (int i = 1; i < words.length; i++) {
            if (!words[i].equals(words[i - 1]))
            sb.append(words[i]).append("\n");
        }

        return sb.toString();
    }

    private static String[] getWords(int N) throws IOException {
        String[] arr = new String[N];

        for(int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        return arr;
    }

}
