package bruteforce.silver.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 체스판 다시 칠하기
public class BOJ1018 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    private static final int BOARD_SIZE = 8;
    private static final int MAX_CELLS = BOARD_SIZE * BOARD_SIZE;

    public static void main(String[] args) throws IOException {
        // 입력
        st = new StringTokenizer(br.readLine());

        int N = stoi(st.nextToken());
        int M = stoi(st.nextToken());

        boolean[][] board = getChessBoard(N, M);
        br.close();

        // 처리
        int answer = solution(N, M, board);

        // 출력
        System.out.println(answer);
    }

    private static int solution(int N, int M, boolean[][] board) {
        int min = MAX_CELLS;

        for (int i = 0; i <= N - BOARD_SIZE; i++) {
            for (int j = 0; j <= M - BOARD_SIZE; j++) {
                min = Math.min(min, getIncorrectCells(i, j, board));
            }
        }

        return min;
    }

    private static int getIncorrectCells(int x, int y, boolean[][] board) {
        int[] endPoint = {x + BOARD_SIZE, y + BOARD_SIZE};

        boolean correctColor = board[x][y];

        int count = 0;
        for (int i = x; i < endPoint[0]; i++) {
            for (int j = y; j < endPoint[1]; j++) {
                if (board[i][j] != correctColor) {
                    count++;
                }
                correctColor = !correctColor;
            }
            correctColor = !correctColor;
        }

        count = Math.min(count, MAX_CELLS - count);

        return count;
    }

    private static boolean[][] getChessBoard(int N, int M) throws IOException {
        boolean[][] board = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                if (line.charAt(j) == 'B') {
                    board[i][j] = true;
                }
            }
        }

        return board;
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
