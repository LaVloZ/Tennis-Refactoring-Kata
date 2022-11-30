
public class TennisGame2 implements TennisGame {
    public int score1 = 0;
    public int score2 = 0;

    public TennisGame2() {
    }

    public String getScore() {
        if (score1 == score2 && score1 >= 3)
            return "Deuce";
        if (score1 == score2) {
            return score(score1) + "-All";
        }

        if (score2 < 4 && score1 < 4) {
            return score(score1) + "-" + score(score2);
        }
        if (score1 - score2 >= 2) return "Win for player1";
        if (score2 - score1 >= 2) return "Win for player2";
        if (score1 > score2) return "Advantage player1";
        return "Advantage player2";

    }

    private String score(int score1) {
        if (score1 == 0) return "Love";
        if (score1 == 1) return "Fifteen";
        if (score1 == 2) return "Thirty";
        return "Forty";
    }

    public void wonPointForPlayer1() {
        score1++;
    }

    public void wonPointForPlayer2() {
        score2++;
    }

    public void wonPoint(String player) {
        if ("player1".equals(player))
            wonPointForPlayer1();
        else
            wonPointForPlayer2();
    }
}