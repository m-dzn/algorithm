package sort.silver.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 좌표 정렬하기
public class BOJ11650 {

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

        Arrays.sort(points, (p1, p2) -> {
            if (p1.getX() == p2.getX()) {
                return p1.getY() - p2.getY();
            }

           return p1.getX() - p2.getX();
        });

        for (Point point : points) {
            sb
                .append(point.getX())
                .append(' ')
                .append(point.getY())
                .append('\n');
        }

        return sb.toString();
    }

    private static Point[] getPointArray(int N) throws IOException {
        StringTokenizer st;
        Point[] arr = new Point[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = stoi(st.nextToken());
            int y = stoi(st.nextToken());

            arr[i] = new Point(x, y);
        }

        return arr;
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

class BOJ11650_Merge {

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
        // 정렬
        sort(points);

        // 출력 양식에 맞게 String 객체에 담기
        StringBuilder sb = new StringBuilder();
        for (Point point : points) {
            sb
                .append(point.getX()).append(' ')
                .append(point.getY()).append('\n');
        }

        return sb.toString();
    }

    private static Point[] getPointArray(int N) throws IOException {
        StringTokenizer st;
        Point[] arr = new Point[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            int x = stoi(st.nextToken());
            int y = stoi(st.nextToken());

            arr[i] = new Point(x, y);
        }

        return arr;
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

    private static void sort(Point[] points) {
        mergeSort(points, 0, points.length - 1);
    }

    private static void mergeSort(Point[] arr, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        sorting(arr, left, mid, right);
    }

    private static void sorting(Point[] arr, int left, int mid, int right) {
        Point[] tempArr = new Point[right - left + 1];
        int lp = left, rp = mid + 1, idx = 0;

        while (lp <= mid && rp <= right) {
            int lpX = arr[lp].getX(), rpX = arr[rp].getX();

            if (lpX != rpX) {
                tempArr[idx++] = lpX < rpX ? arr[lp++] : arr[rp++];
                continue;
            }

            int lpY = arr[lp].getY(), rpY = arr[rp].getY();
            tempArr[idx++] = lpY < rpY ? arr[lp++] : arr[rp++];
        }

        if (lp > mid) {
            while (rp <= right) tempArr[idx++] = arr[rp++];
        } else {
            while (lp <= mid) tempArr[idx++] = arr[lp++];
        }

        merge(arr, tempArr, left);
    }

    private static void merge(Point[] arr, Point[] tempArr, int start) {
        int end = start + tempArr.length;
        for (int k = start; k < end; k++) {
            arr[k] = tempArr[k - start];
        }
    }

}