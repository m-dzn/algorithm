package math.silver.lv5;

// 셀프 넘버
public class BOJ4673 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        boolean[] selfNumbers = new boolean[10001];

        for (int i = 1; i <= 10000; i++) {
            int selfNumber = i;
            int tempNum = i;

            while (tempNum > 0) {
                selfNumber += tempNum % 10;
                tempNum /= 10;
            }

            if (selfNumber > 10000) continue;
            selfNumbers[selfNumber] = true;
        }

        for (int i = 1; i < selfNumbers.length; i++) {
            if (!selfNumbers[i]) {
                sb.append(i).append(System.lineSeparator());
            }
        }

        System.out.println(sb);
    }

}
