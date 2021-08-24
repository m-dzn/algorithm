package sort.bronze.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 수 정렬하기
public class BOJ2750 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        // 입력
        int N = stoi(br.readLine());
        int[] numbers = getNumbersArray(N);

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
            sb.append(number).append(System.lineSeparator());
        }

        return sb.toString();
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

    private static int[] getNumbersArray(int N) throws IOException {
        int[] arr = new int[N];

        for (int i = 0 ; i < N; i++) {
            arr[i] = stoi(br.readLine());
        }

        return arr;
    }


    private static void sort(int[] numbers) {
        quickSort(0, numbers.length - 1, numbers);
    }

    private static void quickSort(int left, int right, int[] numbers) {
        if (left < right) {
            int newPivotIdx = partition(left, right, numbers);

            quickSort(left, newPivotIdx - 1, numbers);
            quickSort(newPivotIdx, right, numbers);
        }
    }

    private static int partition(int left, int right, int[] numbers) {
        int pivot = numbers[left + (right - left) / 2];

        while (left <= right) {
            while (numbers[left] < pivot) left++;
            while (numbers[right] > pivot) right--;

            if (left <= right) {
                swap(left++, right--, numbers);
            }
        }

        return left;
    }

    private static void swap(int a, int b, int[] numbers) {
        int temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;
    }
}
