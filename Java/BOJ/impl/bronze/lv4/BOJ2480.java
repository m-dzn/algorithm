package impl.bronze.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 주사위 세 개
public class BOJ2480 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] dice = getDiceArray(st);

        // 처리
        int answer = solution(dice);

        // 출력
        System.out.println(answer);
    }

    private static int[] getDiceArray(StringTokenizer st) {
        int[] arr = new int[st.countTokens()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stoi(st.nextToken());
        }
        return arr;
    }

    private static int solution(int[] dice) {
        int[] diceCount = new int[6 + 1];
        int multiplier = 0;
        int count = 1;
        int max = 1;

        for (int i = 0; i < dice.length; i++) {
            diceCount[dice[i]]++;
            if (diceCount[dice[i]] > count) {
                multiplier = dice[i];
                count = diceCount[dice[i]];
            }
            max = Math.max(max, dice[i]);
        }

        switch (count) {
            case 2:
                return 1000 + multiplier * 100;
            case 3:
                return 10000 + multiplier * 1000;
            default:
                return max * 100;
        }
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
