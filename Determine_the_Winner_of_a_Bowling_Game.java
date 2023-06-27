public class Determine_the_Winner_of_a_Bowling_Game {
    public int isWinner(int[] player1, int[] player2) {
        int score1 = calculateScore(player1);
        int score2 = calculateScore(player2);
        if (score1 > score2) {
            return 1;
        } else if (score2 > score1) {
            return 2;
        } else {
            return 0;
        }
    }

    public static int calculateScore(int[] player) {
        int sum = 0;
        for (int i = player.length - 1; i >= 0; i--) {
            if ((i - 1 > -1) && player[i - 1] == 10) {
                sum += player[i] * 2;
            } else if ((i - 2 > -1) && player[i - 2] == 10) {
                sum += player[i] * 2;
            } else {
                sum += player[i];
            }
        }
        return sum;
    }
}
