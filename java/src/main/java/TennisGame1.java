
public class TennisGame1 implements TennisGame {

    private int score1 = 0;
    private int score2 = 0;

    public TennisGame1() {
    }

    public void wonPoint(String playerName) {
        if ("player1".equals(playerName))
            score1 += 1;
        else
            score2 += 1;
    }

    public String getScore() {
        if (score1 == score2) {
            if (score1 <= 2) {
                return getScore(score1) + "-All";
            }
            return "Deuce";
        }
        if (score1 < 4 && score2 < 4) {
            return getScore(score1) + "-" + getScore(score2);
        }
        if (score1 - score2 == 1) return advantageFor("player1");
        if (score2 - score1 == 1) return advantageFor("player2");
        if (score1 - score2 >= 2) return winFor("player1");
        return winFor("player2");
    }

    private static String winFor(String player1) {
        return "Win for " + player1;
    }

    private static String advantageFor(String player1) {
        return "Advantage " + player1;
    }

    private String getScore(int score) {
        if (score == 0) return "Love";
        if (score == 1) return "Fifteen";
        if (score == 2) return "Thirty";
        return "Forty";
    }
}
