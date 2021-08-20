package asmd.bronze.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// A-B
public class BOJ1001 {

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
        return a - b;
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}

class BOJ1001_2 {

    public static void main(String[] args) throws IOException {
        int A = System.in.read() - '0';
        System.in.skip(1);
        int B = System.in.read() - '0';
        System.out.println(A - B);
    }

}
