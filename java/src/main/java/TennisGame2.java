
public class TennisGame2 implements TennisGame {
    public int score1 = 0;
    public int score2 = 0;

    public String player1 = "";
    public String player2 = "";

    public TennisGame2() {
    }

    public String getScore() {
        if (score1 == score2 && score1 < 3) {
            if (score1 == 0)
                return "Love" + "-All";
            if (score1 == 1)
                return "Fifteen" + "-All";
            if (score1 == 2)
                return "Thirty" + "-All";
        }
        if (score1 == score2 && score1 >= 3)
            return "Deuce";

        if (score1 > 0 && score2 == 0) {
            if (score1 == 1)
                player1 = "Fifteen";
            if (score1 == 2)
                player1 = "Thirty";
            if (score1 == 3)
                player1 = "Forty";

            player2 = "Love";
        }
        if (score2 > 0 && score1 == 0) {
            if (score2 == 1)
                player2 = "Fifteen";
            if (score2 == 2)
                player2 = "Thirty";
            if (score2 == 3)
                player2 = "Forty";

            player1 = "Love";
        }
        if (score1 > score2 && score1 < 4) {
            if (score1 == 1)
                player1 = "Fifteen";
            if (score1 == 2)
                player1 = "Thirty";
            if (score1 == 3)
                player1 = "Forty";
            if (score2 == 1)
                player2 ="Fifteen";
            if (score1 == 2)
                player1 = "Thirty";
            if (score2 == 2)
                player2 = "Thirty";
            if (score2 == 3)
                player2 = "Forty";
            return player1 + "-" + player2;
        }

        if (score2 > score1 && score2 < 4 || score1 > score2 && score1 < 4) {
            if (score1 == 1)
                player1 = "Fifteen";
            if (score1 == 2)
                player1 = "Thirty";
            if (score1 == 3)
                player1 = "Forty";
            if (score2 == 1)
                player2 ="Fifteen";
            if (score2 == 2)
                player2 = "Thirty";
            if (score2 == 3)
                player2 = "Forty";
            return player1 + "-" + player2;
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
        if (score2 > score1) {
            return "Advantage player2";
        }

        return "Love" + "-" + player2;
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