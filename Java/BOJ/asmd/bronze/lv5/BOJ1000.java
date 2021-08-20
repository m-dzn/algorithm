package asmd.bronze.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// A+B
public class BOJ1000 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 입력
        int A = stoi(st.nextToken());
        int B = stoi(st.nextToken());

        // 출력
        System.out.println(solution(A, B));
    }

    private static int solution(int a, int b) {
        return a + b;
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}

class BOJ1000_2 {

    public static void main(String[] args) throws IOException {
        int A = System.in.read() - '0'; // 첫번째 숫자 char로 읽어 온 뒤 '0'을 뺴서 int값으로 변환
        System.in.skip(1);  // 띄어쓰기는 스킵
        int B = System.in.read() - '0'; // 두번째 숫자 char -> int로 변환

        System.out.println(A + B);
    }

}
