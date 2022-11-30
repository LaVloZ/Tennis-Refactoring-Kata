
public class TennisGame2 implements TennisGame {
    public int score1 = 0;
    public int score2 = 0;

    public String player1 = "";
    public String player2 = "";

    public TennisGame2() {
    }

    public String getScore() {
        if (score1 == score2 && score1 >= 3)
            return "Deuce";
        if (score1 == score2) {
            if (score1 == 0) {
                return "Love" + "-All";
            }
            if (score1 == 1) {
                return "Fifteen" + "-All";
            }
            if (score1 == 2) {
                return "Thirty" + "-All";
            }
        }

        if (score2 < 4 && score1 < 4) {
            return extracted(score1) + "-" + extracted(score2);
        }
        if (score1 - score2 >= 2) {
            return "Win for player1";
        }
        if (score2 - score1 >= 2) {
            return "Win for player2";
        }
        if (score1 > score2) {
            return "Advantage player1";
        }
        return "Advantage player2";

    }

    private String extracted(int score1) {
        if (score1 == 0)
            return "Love";
        if (score1 == 1)
            return "Fifteen";
        if (score1 == 2)
            return "Thirty";
        return "Forty";
    }

    public void P1Score() {
        score1++;
    }

    public void P2Score() {
        score2++;
    }

    public void wonPoint(String player) {
        if ("player1".equals(player))
            P1Score();
        else
            P2Score();
    }
}