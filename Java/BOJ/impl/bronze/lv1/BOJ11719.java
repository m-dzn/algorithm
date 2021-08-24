package impl.bronze.lv1;

import java.io.*;

// 그대로 출력하기 2
public class BOJ11719 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력 & 처리 & 출력
        String line = "";
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }

}
