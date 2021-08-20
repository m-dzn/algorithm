package impl.bronze.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 킹, 퀸, 룩, 비숍, 나이트, 폰
public class BOJ3003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] currentPieces = getCurrentPieceArray(st);

        // 처리
        String answer = solution(currentPieces);

        // 출력
        System.out.println(answer);
    }

    private static String solution(int[] currentPieces) {
        StringBuilder sb = new StringBuilder();
        int[] standardPieces = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < currentPieces.length; i++) {
            sb.append(standardPieces[i] - currentPieces[i]).append(" ");
        }

        return sb.toString();
    }

    private static int[] getCurrentPieceArray(StringTokenizer st) {
        int[] currentPieces = new int[6];
        for (int i = 0; i < currentPieces.length; i++) {
            currentPieces[i] = stoi(st.nextToken());
        }
        return currentPieces;
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
