package temp.gold.lv5;

import java.io.*;
import java.util.*;

public class BOJ2800 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private static final ArrayList<int[]> parenPositions = new ArrayList<>();
    private static final Set<String> formulaSet = new HashSet<>();
    private static boolean[] visited;

    private static String formula;

    public static void main(String[] args) throws IOException {
        formula = br.readLine();

        Stack<Integer> stack = new Stack<>();

        // parenPosition에는 오른쪽에 위치한 괄호가 먼저 들어간다
        for (int i = 0; i < formula.length(); i++) {
            char ch = formula.charAt(i);

            if (ch == '(') {
                stack.push(i);
            } else if (ch == ')') {
                int start = stack.pop();
                parenPositions.add(new int[]{start, i});
            }
        }

        visited = new boolean[parenPositions.size()];

        dfs(0);

        formulaSet.remove(formula);

        List<String> formulaList = new ArrayList(formulaSet);
        Collections.sort(formulaList);

        for (String result : formulaList) {
            bw.write(result);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static void dfs(int index) {
        if (index >= visited.length) {
            StringBuilder sb = new StringBuilder();

            boolean[] skipPosition = new boolean[formula.length()];
            for (int i = 0; i < visited.length; i++) {
                if (!visited[i]) continue;

                int[] parenPosition = parenPositions.get(i);
                skipPosition[parenPosition[0]] = skipPosition[parenPosition[1]] = true;
            }

            for (int j = 0; j < skipPosition.length; j++) {
                if (skipPosition[j]) continue;

                sb.append(formula.charAt(j));
            }

            formulaSet.add(sb.toString());
        } else {
            int nextIdx = index + 1;

            visited[index] = true;
            dfs(nextIdx);

            visited[index] = false;
            dfs(nextIdx);
        }
    }

}
