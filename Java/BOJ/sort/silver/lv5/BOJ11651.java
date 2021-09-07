package sort.silver.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 좌표 정렬하기 2
public class BOJ11651 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        // 입력
        int N = stoi(br.readLine());
        Point[] points = getPointArray(N);
        br.close();

        // 처리
        String answer = solution(points);

        // 출력
        System.out.println(answer);
    }

    private static String solution(Point[] points) {
        StringBuilder sb = new StringBuilder();

        Arrays.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                if (p1.getY() == p2.getY()) {
                    return p1.getX() - p2.getX();
                }
                return p1.getY() - p2.getY();
            }
        });

        for (Point point : points) {
            sb.append(point.getX()).append(' ')
                    .append(point.getY()).append("\n");
        }

        return sb.toString();
    }

    private static Point[] getPointArray(int N) throws IOException {
        StringTokenizer st;
        Point[] points = new Point[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            int x = stoi(st.nextToken());
            int y = stoi(st.nextToken());

            points[i] = new Point(x, y);
        }
        return points;
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

    private static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}
