package temp.silver.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 미로 탐색
public class BOJ2178 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        // 입력
        st = new StringTokenizer(br.readLine());
        int N = stoi(st.nextToken());
        int M = stoi(st.nextToken());

        boolean[][] maze = getMaze(N, M);

        // 처리
        int answer = solution(maze);

        // 출력
        System.out.println(answer);
    }

    private static int solution(boolean[][] maze) {
        int minMove = bfs(maze);

        return minMove;
    }

    private static int bfs(boolean[][] maze) {
        int count = 0;

        Queue<Integer> que = new LinkedList<>();
        

        return count;
    }

    private static boolean[][] getMaze(int N, int M) throws IOException {
        boolean[][] maze = new boolean[N][M];

        for (int row = 0; row < N; row++) {
            String line = br.readLine();
            for (int col = 0; col < M; col++) {
                char ch = line.charAt(col);

                maze[row][col] = ch == '1';
            }
        }

        return maze;
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
