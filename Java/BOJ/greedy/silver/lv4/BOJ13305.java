package greedy.silver.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 주유소
public class BOJ13305 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int N = stoi(br.readLine());
        int[] roads = getRoads(N);
        int[] gasStations = getGasStations(N);

        // 처리
        long answer = solution(N, roads, gasStations);

        // 출력
        System.out.println(answer);
    }

    private static long solution(int N, int[] roads, int[] gasStations) {
        long totalGasFee = 0;

        int tempGasPrice = Integer.MAX_VALUE;
        int tempDist = 0;
        for (int i = 0; i < roads.length; i++) {
            if (tempGasPrice < gasStations[i]) {
                tempDist += roads[i];
            } else {
                totalGasFee += (long) tempDist * tempGasPrice;
                tempDist = roads[i];
                tempGasPrice = gasStations[i];
            }
        }

        totalGasFee += (long) tempDist * tempGasPrice;

        return totalGasFee;
    }

    private static int[] getGasStations(int N) throws IOException {
        int[] gasStations = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            gasStations[i] = stoi(st.nextToken());
        }

        return gasStations;
    }

    private static int[] getRoads(int N) throws IOException {
        int[] roads = new int[N - 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < roads.length; i++) {
            roads[i] = stoi(st.nextToken());
        }

        return roads;
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
