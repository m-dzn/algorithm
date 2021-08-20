package impl.bronze.lv5;

// We love kriii
public class BOJ10718 {

    public static void main(String[] args) {
        // 처리
        String answer = solution();

        // 출력
        System.out.println(answer);
    }

    private static String solution() {
        StringBuilder sb = new StringBuilder();
        String msg = "강한친구 대한육군";

        for (int i = 0; i < 2; i++) {
            sb.append(msg).append("\n");
        }

        return sb.toString();
    }

}
