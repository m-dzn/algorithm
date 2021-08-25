package bruteforce.silver.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 덩치
public class BOJ7568 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        // 입력
        int N = stoi(br.readLine());
        Person[] people = getPersonArray(N);

        br.close();

        // 처리
        String answer = solution(people);

        // 출력
        System.out.println(answer);
    }

    private static String solution(Person[] people) {
        StringBuilder sb = new StringBuilder();
        int[] countingArr = new int[people.length];

        for (int i = 0; i < people.length - 1; i++) {
            for (int j = i + 1; j < people.length; j++) {
                int comparisonResult = people[i].compareTo(people[j]);

                switch (comparisonResult) {
                    case 1:
                        countingArr[j]++;
                        break;
                    case -1:
                        countingArr[i]++;
                        break;
                }
            }
        }

        for (int ranking : countingArr) {
            sb.append(ranking + 1).append(' ');
        }

        return sb.toString();
    }

    private static Person[] getPersonArray(int N) throws IOException {
        Person[] arr = new Person[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int weight = stoi(st.nextToken());
            int height = stoi(st.nextToken());

            arr[i] = new Person(weight, height);
        }
        return arr;
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

    private static class Person {
        private int weight;
        private int height;

        public Person(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }

        public int compareTo(Person that) {
            int result = 0;

            if (this.weight > that.weight
                    && this.height > that.height) {
                result = 1;
            } else if (this.weight < that.weight
                    && this.height < that.height) {
                result = -1;
            }

            return result;
        }
    }
}