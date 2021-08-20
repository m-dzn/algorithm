package asmd.bronze.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 파티가 끝나고 난 뒤
public class BOJ2845 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 입력
        st = new StringTokenizer(br.readLine());
        int L = stoi(st.nextToken());
        int P = stoi(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] articles = getIntArrayFromToken(st.countTokens(), st);
        
        // 처리
        String answer = solution(L, P, articles);
        
        // 출력
        System.out.println(answer);
    }

    private static String solution(int L, int P, int[] articles) {
        StringBuilder sb = new StringBuilder();
        int estimation = L * P;

        for (int article : articles) {
            sb.append(article - estimation).append(' ');
        }

        return sb.toString();
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

    private static int[] getIntArrayFromToken(int length, StringTokenizer st) {
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = stoi(st.nextToken());
        }

        return array;
    }
}
