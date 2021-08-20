package math.bronze.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 평균 점수
public class BOJ10039 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        // 입력
        int[] scores = getStudentScores(5);

        // 처리
        int answer = solution(scores);

        // 출력
        System.out.println(answer);
    }

    private static int solution(int[] scores) {
        int sum = 0;

        for (int score : scores) {
            sum += score > 40 ? score : 40; // 점수의 하한 값은 40점이다
        }

        return sum / 5;
    }

    private static int[] getStudentScores(int length) {
        int[] scores = new int[length];
        for (int i = 0; i < length; i++) {
            try {
                scores[i] = stoi(br.readLine());
            } catch (IOException e) {
            }
        }
        return scores;
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }
    
}
