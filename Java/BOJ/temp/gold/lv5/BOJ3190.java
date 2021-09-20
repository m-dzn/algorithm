package temp.gold.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ3190 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static char[][] board;
    private static int[][] commands;

    private static final char APPLE = 'A', LEFT = 'L', RIGHT = 'D';
    private static int N, K, L;

    public static void main(String[] args) {
        input();

        Snake snake = new Snake();
        int seconds = 0, commandIdx = 0;

        while (true) {
            seconds++;

            if (!snake.isMovable(board)) break;

            if (commands[commandIdx][0] == seconds) {
                snake.changeDirection((char) commands[commandIdx][1]);
                commandIdx = Math.min(commandIdx + 1, commands.length - 1);
            }
        }

        System.out.println(seconds);
    }

    private static void input() {
        try {
            N = stoi(br.readLine());
            K = stoi(br.readLine());

            board = new char[N + 1][N + 1];

            StringTokenizer st;
            for (int k = 0; k < K; k++) {
                st = new StringTokenizer(br.readLine());
                int x = stoi(st.nextToken());
                int y = stoi(st.nextToken());
                board[x][y] = APPLE;
            }

            L = stoi(br.readLine());

            commands = new int[L][2];

            for (int l = 0; l < L; l++) {
                st = new StringTokenizer(br.readLine());
                commands[l][0] = stoi(st.nextToken());
                commands[l][1] = st.nextToken().charAt(0);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

    private static class Snake {
        private static final int[][] dirArr = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // 우하좌상 (오른쪽부터 시계방향)

        int direction = 0;
        final Deque<SnakePart> parts = new LinkedList<>();

        public Snake() {
            SnakePart startingPoint = new SnakePart(1, 1);
            parts.offer(startingPoint);
        }

        public void changeDirection(char command) {
            if (command == LEFT) {
                direction--;
                if (direction < 0) direction = 3;
            } else {
                direction++;
                direction %= 4;
            }
        }

        public boolean isMovable(char[][] board) {
            SnakePart oldHead = parts.peek();

            int nextX = oldHead.x + dirArr[direction][0];
            int nextY = oldHead.y + dirArr[direction][1];
            SnakePart newHead = new SnakePart(nextX, nextY);

            if (isOutOfBoard(newHead) || isSnakePartExist(newHead)) return false;

            if (board[newHead.x][newHead.y] != APPLE) {
                noApple();
            } else {
                eatApple(newHead);
            }

            parts.offerFirst(newHead);

            return true;
        }

        private void eatApple(SnakePart newHead) {
            board[newHead.x][newHead.y] = 0;
        }

        private boolean isOutOfBoard(SnakePart head) {
            return head.x < 1 || head.y < 1 || head.x > N || head.y > N;
        }

        private boolean isSnakePartExist(SnakePart head) {
            for (SnakePart body : parts) {
                if (head.equals(body)) return true;
            }

            return false;
        }

        private void noApple() {
            parts.pollLast();
        }

        private static class SnakePart {
            int x;
            int y;

            public SnakePart(int x, int y) {
                this.x = x;
                this.y = y;
            }

            @Override
            public boolean equals(Object o) {
                SnakePart that = (SnakePart) o;

                if (this.x == that.x && this.y == that.y) return true;

                return false;
            }
        }
    }

}
