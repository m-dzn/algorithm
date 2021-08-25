package string.silver.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 크로아티아 알파벳
public class BOJ2941 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        String input = br.readLine();

        // 처리
        int answer = solution(input);

        // 출력
        System.out.println(answer);
        br.close();
    }

    private static int solution(String input) {
        int count = 0;
        String[] croatiaAlphabets = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        Pattern[] patterns = new Pattern[croatiaAlphabets.length];
        for (int i = 0; i < patterns.length; i++) {
            patterns[i] = Pattern.compile(croatiaAlphabets[i]);
        }

        for (Pattern pattern : patterns) {
            Matcher m = pattern.matcher(input);
            while (m.find()) {
                input = input.replaceFirst(m.group(), " ");
                count++;
            }
        }

        for (char ch : input.toCharArray()) {
            if (ch != ' ') {
                count++;
            }
        }

        return count;
    }

}