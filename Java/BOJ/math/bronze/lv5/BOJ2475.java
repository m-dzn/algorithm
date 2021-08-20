package math.bronze.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 검증수
public class BOJ2475 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] numbers = getIntArrayFromToken(5, st);

        // 처리
        int answer = solution(numbers);

        // 출력
        System.out.println(answer);
    }

    private static int solution(int[] numbers) {
        int squareSum = 0;

        for (int number : numbers) {
            squareSum += number * number;
        }

        return squareSum % 10;
    }

    private static int[] getIntArrayFromToken(int length, StringTokenizer st) {
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = stoi(st.nextToken());
        }

        return array;
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
