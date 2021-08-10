package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E3_1_Change_2 {

    public static void main(String[] args) throws IOException {
        // 초기화 (준비;세팅)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] coinUnits = {500, 100, 50, 10};   // 동전 단위 배열

        // 입력
        int N = Integer.parseInt(br.readLine());

        // 처리
        int answer = solution(N, coinUnits);
        
        // 출력
        System.out.println(answer);
    }

    private static int solution(int N, int[] coinUnits) {    // N은 항상 10의 배수
        int numOfCoins = 0, idx = 0;

        for (int i = 0; i < coinUnits.length; i++) {
            numOfCoins += N / coinUnits[i];
            N %= coinUnits[i];
        }

        return numOfCoins;
    }

}