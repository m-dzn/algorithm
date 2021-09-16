package temp.silver.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// DFS와 BFS
public class BOJ1260 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;
    private static final StringBuilder sb = new StringBuilder();

    private static boolean[][] graph;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        // 입력
        st = new StringTokenizer(br.readLine());
        int N = stoi(st.nextToken());
        int M = stoi(st.nextToken());
        int V = stoi(st.nextToken());

        int[][] edges = getEdgesArr(M);

        // 처리
        String answer = solution(N, M, V, edges);

        // 출력
        System.out.println(answer);
    }

    private static String solution(int N, int M, int V, int[][] edges) {
        graph = new boolean[N + 1][N + 1];
        visited = new boolean[N + 1];

        drawGraph(edges);

        dfs(V);
        sb.append(System.lineSeparator());
        bfs(V, N);

        return sb.toString();
    }

    private static void drawGraph(int[][] edges) {
        for (int[] edge : edges) {
            int vertex1 = edge[0];
            int vertex2 = edge[1];
            graph[vertex1][vertex2] = graph[vertex2][vertex1] = true;
        }
    }

    private static void addToVertexList(int vertex) {
        sb.append(vertex).append(' ');
    }

    private static void dfs(int current) {
        visited[current] = true;
        addToVertexList(current);

        for (int next = 1; next < visited.length; next++) {
            if (graph[current][next] && !visited[next]) {
                dfs(next);
            }
        }
    }

    private static void bfs(int start, int N) {
        boolean[] visited = new boolean[N + 1];

        Queue<Integer> que = new LinkedList<>();
        que.offer(start);
        visited[start] = true;
        addToVertexList(start);

        while (!que.isEmpty()) {
            int current = que.poll();

            // 큐에서 나온 값과 연결된 vertex가 있는지 모두 돌아보면서 que에 넣자
            for (int next = 1; next < graph.length; next++) {
                if (graph[current][next] && !visited[next]) {
                    que.offer(next);
                    visited[next] = true;
                    addToVertexList(next);
                }
            }
        }
    }

    private static int[][] getEdgesArr(int M) throws IOException {
        int[][] graph = new int[M][2];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            graph[i][0] = stoi(st.nextToken());
            graph[i][1] = stoi(st.nextToken());
        }

        return graph;
    }

    private static int stoi(String value) {
        return Integer.parseInt(value);
    }

}
