package sort.silver.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 나이순 정렬
public class BOJ10814 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        // 입력
        int N = stoi(br.readLine());
        Member[] members = getMemberArray(N);
        br.close();

        // 처리
        String answer = solution(members);

        // 출력
        System.out.println(answer);
    }

    private static String solution(Member[] members) {
        StringBuilder sb = new StringBuilder();

        sort(members);

        for (Member member : members) {
            sb
                .append(member.getAge())
                .append(' ')
                .append(member.getName())
                .append("\n");
        }

        return sb.toString();
    }
    private static Member[] getMemberArray(int N) throws IOException {
        Member[] members = new Member[N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            members[i] = new Member(stoi(st.nextToken()), st.nextToken());
        }
        return members;
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

    private static class Member {
        private int age;
        private String name;

        public Member(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }

    private static void sort(Member[] members) {
        mergeSort(members, 0, members.length - 1);
    }

    private static void mergeSort(Member[] arr, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        sorting(arr, left, mid, right);
    }

    private static void sorting(Member[] arr, int left, int mid, int right) {
        Member[] tempArr = new Member[right - left + 1];
        int lp = left, rp = mid + 1, idx = 0;

        while (lp <= mid && rp <= right) {
            int lpAge = arr[lp].getAge(), rpAge = arr[rp].getAge();
            tempArr[idx++] = lpAge <= rpAge ? arr[lp++] : arr[rp++];
        }

        if (lp > mid) {
            while (rp <= right) tempArr[idx++] = arr[rp++];
        } else {
            while (lp <= mid) tempArr[idx++] = arr[lp++];
        }

        merge(arr, tempArr, left);
    }

    private static void merge(Member[] arr, Member[] tempArr, int start) {
        int end = start + tempArr.length;
        for (int k = start; k < end; k++) {
            arr[k] = tempArr[k - start];
        }
    }

}

class BOJ10814_SB {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st;

        StringBuilder[] sbArr = new StringBuilder[200 + 1];
        for (int i = 0; i <= 200; i++) {
            sbArr[i] = new StringBuilder();
        }

        // 입력
        int N = stoi(br.readLine());
        for (int i = 0; i < N; i++) {
            String member = br.readLine();
            st = new StringTokenizer(member);
            int age = stoi(st.nextToken());

            sbArr[age].append(member).append("\n");
        }
        br.close();

        // 출력
        StringBuilder sb = new StringBuilder();
        for (StringBuilder tempSB : sbArr) {
            sb.append(tempSB);
        }

        System.out.println(sb);
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }
}