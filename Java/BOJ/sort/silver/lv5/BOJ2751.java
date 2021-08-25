package sort.silver.lv5;

import java.io.*;

// 수 정렬하기 2
public class BOJ2751 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        // 입력
        int N = stoi(br.readLine());
        int[] numbers = getNumberArray(N);

        // 처리
        String answer = solution(numbers);

        // 출력
        System.out.println(answer);
        br.close();
    }

    private static String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();

        sort(numbers);

        for (int number : numbers) {
            sb.append(number).append("\n");
        }

        return sb.toString();
    }

    private static int[] getNumberArray(int N) throws IOException {
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = stoi(br.readLine());
        }
        return arr;
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

    private static void sort(int[] numbers) {
        mergeSort(numbers, 0, numbers.length - 1);
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        sorting(arr, left, mid, right);
    }

    private static void sorting(int[] arr, int left, int mid, int right) {
        int[] tempArr = new int[right - left + 1];
        int lp = left, rp = mid + 1, idx = 0;

        while (lp <= mid && rp <= right) {
            tempArr[idx++] =
                    arr[lp] < arr[rp] ? arr[lp++] : arr[rp++];
        }

        if (lp > mid) {
            while (rp <= right) tempArr[idx++] = arr[rp++];
        } else {
            while (lp <= mid) tempArr[idx++] = arr[lp++];
        }

        merge(arr, tempArr, left);
    }

    private static void merge(int[] arr, int[] tempArr, int start) {
        int end = start + tempArr.length;
        for (int k = start; k < end; k++) {
            arr[k] = tempArr[k - start];
        }
    }

}

class BOJ2751_Counting {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final int MAX_N = 2_000_000;

    public static void main(String[] args) throws IOException {
        // 입력
        int N = stoi(br.readLine());
        int[] numbers = getNumberArray(N);

        // 처리
        String answer = solution(numbers);

        // 출력
        System.out.println(answer);
        br.close();
    }

    private static String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();

        sort(numbers);

        for (int number : numbers) {
            sb.append(number).append("\n");
        }

        return sb.toString();
    }

    private static int[] getNumberArray(int N) throws IOException {
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = stoi(br.readLine());
        }
        return arr;
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

    private static void sort(int[] numbers) {
        countingSort(numbers);
    }

    private static void countingSort(int[] arr) {
        boolean[] bucket = new boolean[MAX_N + 1];

        int ZERO_POSITION = MAX_N / 2;
        for (int number : arr) {
            bucket[ZERO_POSITION + number] = true;
        }
        int arrIdx = 0;
        for (int bucketIdx = 0; bucketIdx < bucket.length; bucketIdx++) {
            if (bucket[bucketIdx]) {
                arr[arrIdx++] = bucketIdx - ZERO_POSITION;
            }
        }
    }
}

class BOJ2751_Counting2 {

    private static final int NUMBER_RANGE = 2_000_000;
    private static final int ZERO_POSITION = NUMBER_RANGE / 2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 입력
        int N = stoi(br.readLine());
        boolean[] bucket = new boolean[NUMBER_RANGE + 1];

        // 구현
        for (int i = 0; i < N; i++) {
            bucket[ZERO_POSITION + stoi(br.readLine())] = true;
        }

        // 출력
        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i]) {
                sb.append(i - ZERO_POSITION).append("\n");
            }
        }
        System.out.println(sb);
        br.close();
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }
}