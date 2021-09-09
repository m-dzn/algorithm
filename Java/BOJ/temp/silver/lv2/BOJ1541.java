package temp.silver.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1541 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        String formula = br.readLine();
        br.close();

        // 처리
        int answer = solution(formula);

        // 출력
        System.out.println(answer);
    }

    private static int solution(String formula) {
        int result = 0;
        String[] subtr = formula.split("-");

        for (int i = 0; i < subtr.length; i++) {
            int temp = 0;

            String[] addition = subtr[i].split("\\+");

            for (int j = 0; j < addition.length; j++) {
                temp += stoi(addition[j]);
            }

            if (i == 0) {
                result = temp;
                continue;
            }

            result -= temp;
        }

        return result;
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }
}
