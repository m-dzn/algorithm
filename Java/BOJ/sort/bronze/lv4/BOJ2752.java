package sort.bronze.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 세수 정렬
public class BOJ2752 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numbers = getNumberArray(st);

        // 처리
        String answer = solution(numbers);

        // 출력
        System.out.println(answer);
    }

    private static int[] getNumberArray(StringTokenizer st) {
        int[] array = new int[st.countTokens()];
        for (int i = 0; i < array.length; i++) {
            array[i] = stoi(st.nextToken());
        }
        return array;
    }

    private static String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();

        sort(numbers);

        for (int number : numbers) {
            sb.append(number).append(' ');
        }

        return sb.toString();
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

    private static void sort(int[] numbers) {
        mergeSort(0, numbers.length - 1, numbers);
    }

    private static void mergeSort(int left, int right, int[] arr) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;

        mergeSort(left, mid, arr);
        mergeSort(mid + 1, right, arr);

        sorting(left, mid, right, arr);
    }

    private static void sorting(int left, int mid, int right, int[] arr) {
        int[] sorted = new int[right - left + 1];
        int lp = left, rp = mid + 1, tempArrIdx = 0;

        while (lp <= mid && rp <= right) {
            sorted[tempArrIdx++] =
                    arr[lp] < arr[rp] ? arr[lp++] : arr[rp++];
        }

        if (lp > mid) {
            while (rp <= right) sorted[tempArrIdx++] = arr[rp++];
        } else {
            while (lp <= mid) sorted[tempArrIdx++] = arr[lp++];
        }

        merge(left, right, arr, sorted);
    }

    private static void merge(int left, int right, int[] arr, int[] tempArr) {
        for (int k = left; k < right; k++) {
            arr[k] = tempArr[k - left];
        }
    }

}

class BOJ2752_Quick {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numbers = getNumberArray(st);

        // 처리
        String answer = solution(numbers);

        // 출력
        System.out.println(answer);
    }

    private static int[] getNumberArray(StringTokenizer st) {
        int[] array = new int[st.countTokens()];
        for (int i = 0; i < array.length; i++) {
            array[i] = stoi(st.nextToken());
        }
        return array;
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

    private static String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();

        sort(numbers);

        for (int number : numbers) {
            sb.append(number).append(' ');
        }

        return sb.toString();
    }

    private static void sort(int[] arr) {
        quickSort(0, arr.length - 1, arr);
    }

    private static void quickSort(int left, int right, int[] arr) {
        if (left >= right) return;

        int pivot = arr[left + (right - left) / 2];
        int lp = left, rp = right;

        while (lp <= rp) {
            while (arr[lp] < pivot) lp++;
            while (arr[rp] > pivot) rp--;

            if (lp <= rp) {
                swap(lp++, rp--, arr);
            }
        }

        if (left < rp) quickSort(left, rp, arr);
        if (lp < right) quickSort(lp, right, arr);
    }

    private static void swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

class BOJ2752_Merge {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numbers = getNumberArray(st);

        // 처리
        String answer = solution(numbers);

        // 출력
        System.out.println(answer);
    }

    private static int[] getNumberArray(StringTokenizer st) {
        int[] array = new int[st.countTokens()];
        for (int i = 0; i < array.length; i++) {
            array[i] = stoi(st.nextToken());
        }
        return array;
    }

    private static String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();

        sort(numbers);

        for (int number : numbers) {
            sb.append(number).append(' ');
        }

        return sb.toString();
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

    private static void sort(int[] numbers) {
        mergeSort(0, numbers.length - 1, numbers);
    }

    private static void mergeSort(int left, int right, int[] arr) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;

        mergeSort(left, mid, arr);
        mergeSort(mid + 1, right, arr);

        merge(left, mid, right, arr);
    }

    private static void merge(int left, int mid, int right, int[] arr) {
        int[] sorted = new int[right - left + 1];
        int lp = left, rp = mid + 1, index = 0;

        while (lp <= mid && rp <= right) {
            if (arr[lp] < arr[rp]) {
                sorted[index++] = arr[lp++];
            } else {
                sorted[index++] = arr[rp++];
            }
        }

        if (lp > mid) {
            while (rp <= right) sorted[index++] = arr[rp++];
        } else {
            while (lp <= mid) sorted[index++] = arr[lp++];
        }

        for (int k = left; k <= right; k++) {
            arr[k] = sorted[k - left];
        }
    }

}