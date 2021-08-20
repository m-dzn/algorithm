package impl.bronze.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 10부제
public class BOJ10797 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        // 입력
        int date = stoi(br.readLine());
        int[] carPlates = getCarPlateArray(5);

        // 처리
        int answer = solution(date, carPlates);

        // 출력
        System.out.println(answer);
    }

    private static int solution(int date, int[] carPlates) {
        int violation = 0;

        for (int carPlate : carPlates) {
            if (carPlate == date) violation++;
        }

        return violation;
    }

    private static int[] getCarPlateArray(int length) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = stoi(st.nextToken());
        }
        return array;
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
