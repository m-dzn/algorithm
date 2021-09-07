package impl.bronze.lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 별 찍기 - 12
public class BOJ2522 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int end = 2 * N - 1;

        for (int i = 0; i < end; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(Math.abs(i - (N - 1)) <= j ? '*' : ' ');
            }
            System.out.println();
        }

        br.close();
    }

}
