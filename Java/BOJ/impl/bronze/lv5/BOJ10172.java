package impl.bronze.lv5;

// 개
public class BOJ10172 {

    public static void main(String[] args) {
        // 처리
        String answer = solution();

        // 출력
        System.out.println(answer);
    }

    private static String solution() {
        StringBuilder sb = new StringBuilder();

        sb.append("|\\_/|").append(System.lineSeparator());
        sb.append("|q p|   /}").append(System.lineSeparator());
        sb.append("( 0 )\"\"\"\\").append(System.lineSeparator());
        sb.append("|\"^\"`    |").append(System.lineSeparator());
        sb.append("||_/=\\\\__|");

        return sb.toString();
    }

}
