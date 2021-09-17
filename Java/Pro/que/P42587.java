package que;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P42587 {

    public static void main(String[] args) {
        P42587 p = new P42587();
        int[][] priorities = {{2,1,3,2}, {1,1,9,1,1,1}};
        int[] locations = {2, 0};

        for (int i = 0; i < priorities.length; i++) {
            System.out.println(p.solution(priorities[i], locations[i]));
        }
    }

    public int solution(int[] priorities, int location) {
        int cnt = 0;

        Queue<int[]> que = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            int[] document = {i, priorities[i]};
            que.offer(document);
        }

        Arrays.sort(priorities);

        int maxIdx = priorities.length - 1;

        while (!que.isEmpty()) {
            int[] document = que.poll();

            if (document[1] < priorities[maxIdx]) {
                que.offer(document);
            } else {
                cnt++;
                maxIdx--;

                if (document[0] == location) break;
            }
        }

        return cnt;
    }
}
