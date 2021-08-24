package impl.bronze.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2007
public class BOJ1924 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = stoi(st.nextToken());
        int y = stoi(st.nextToken());

        // 처리
        String answer = solution(x, y);

        // 출력
        System.out.println(answer);
        br.close();
    }

    private static String solution(int x, int y) {
        int targetDate = 0;
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayOfWeek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        for (int i = 0; i < x - 1; i++) {
            targetDate += months[i];
        }

        targetDate += y;

        return dayOfWeek[targetDate % dayOfWeek.length];
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
