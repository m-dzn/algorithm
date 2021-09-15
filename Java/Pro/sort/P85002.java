package sort;

import java.util.Arrays;

public class P85002 {

    public static void main(String[] args) {
        P85002 p = new P85002();
        int[][] weights = {{50, 82, 75, 120}, {145,92,86}, {60,70,60}};
        String[][] head2head = {{"NLWL","WNLL","LWNW","WWLN"}, {"NLW","WNL","LWN"}, {"NNN","NNN","NNN"}};

        for (int t = 0; t < weights.length; t++) {
            int[] result = p.solution(weights[t], head2head[t]);
            System.out.println(Arrays.toString(result));
        }
    }

    public int[] solution(int[] weights, String[] head2head) {
        int[] answer = new int[weights.length];

        Boxer[] boxers = new Boxer[weights.length];

        fight(boxers, weights, head2head);  // 선수들이 시합을 진행합니다

        Arrays.sort(boxers);    // Comparable의 compare() 메서드를 오버라이딩해 만든 기준대로 정렬

        for (int i = 0; i < weights.length; i++) {
            Boxer boxer = boxers[i];
            answer[i] = boxer.getId();
        }

        return answer;
    }

    private void fight(Boxer[] boxers, int[] weights, String[] head2head) {
        final char W = 'W';
        final char L = 'L';

        for (int i = 0; i < boxers.length; i++) {
            boxers[i] = new Boxer(i + 1, weights[i]);

            for (int j = 0; j < i; j++) {
                char matchResult = head2head[i].charAt(j);

                switch (matchResult) {
                    case W:
                        boxers[i].win(weights[j]);
                        boxers[j].lose();
                        break;
                    case L:
                        boxers[i].lose();
                        boxers[j].win(weights[i]);
                        break;
                    default:
                }
            }
        }
    }

}

class Boxer implements Comparable {
    private int id;
    private int weight;
    private int wins;
    private int games;
    private int highWeightWins;

    public Boxer(int id, int weight) {
        this.id = id;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public int getWeight() {
        return weight;
    }

    public int getHighWeightWins() {
        return highWeightWins;
    }

    public double getWinningRate() {
        return games == 0 ? 0 : (double) wins / games;
    }

    public void win(int enemyWeight) {
        if (weight < enemyWeight) highWeightWins++;

        wins++;
        games++;
    }

    public void lose() {
        games++;
    }

    @Override
    public int compareTo(Object o) {
        Boxer that = (Boxer) o;

        int comparedWinningRate = Double.compare(that.getWinningRate(),this.getWinningRate());
        if (comparedWinningRate != 0) return comparedWinningRate;

        int comparedHighWeightWins = that.getHighWeightWins() - this.getHighWeightWins();
        if (comparedHighWeightWins != 0) return comparedHighWeightWins;

        int comparedWeight = that.getWeight() - this.getWeight();
        if (comparedWeight != 0) return comparedWeight;

        return this.getId() - that.getId();
    }
}