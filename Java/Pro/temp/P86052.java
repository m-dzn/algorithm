package temp;

// 빛의 경로 사이클
public class P86052 {

    public static void main(String[] args) {
        P86052 p = new P86052();

        String[][] grids = { {"SL", "LR"}, {"S"}, {"R", "R"} };

        for (String[] grid : grids) {
            p.solution(grid);
        }
    }

    public int[] solution(String[] grid) {
        int[] answer = {};
        return answer;
    }
}
