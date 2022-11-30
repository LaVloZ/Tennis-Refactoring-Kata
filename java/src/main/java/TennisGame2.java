
public class TennisGame2 implements TennisGame {
    public int score1 = 0;
    public int score2 = 0;

    public String player1 = "";
    public String player2 = "";

    public TennisGame2() {
    }

    public String getScore() {
        String score = "";
        if (score1 == this.score2 && score1 < 4) {
            if (score1 == 0)
                return "Love" + "-All";
            if (score1 == 1)
                return "Fifteen" + "-All";
            if (score1 == 2)
                score = "Thirty";
            score += "-All";
        }
        if (score1 == this.score2 && score1 >= 3)
            return "Deuce";

        if (score1 > 0 && this.score2 == 0) {
            if (score1 == 1)
                player1 = "Fifteen";
            if (score1 == 2)
                player1 = "Thirty";
            if (score1 == 3)
                player1 = "Forty";

            player2 = "Love";
            score = player1 + "-" + player2;
        }
        if (this.score2 > 0 && score1 == 0) {
            if (this.score2 == 1)
                player2 = "Fifteen";
            if (this.score2 == 2)
                player2 = "Thirty";
            if (this.score2 == 3)
                player2 = "Forty";

            player1 = "Love";
            score = "Love" + "-" + player2;
        }

        if (score1 > this.score2 && score1 < 4) {
            if (score1 == 2)
                player1 = "Thirty";
            if (score1 == 3)
                player1 = "Forty";
            if (this.score2 == 1)
                player2 = "Fifteen";
            if (this.score2 == 2)
                player2 = "Thirty";
            return player1 + "-" + player2;
        }

        if (this.score2 > score1 && this.score2 < 4) {
            if (this.score2 == 2)
                player2 = "Thirty";
            if (this.score2 == 3)
                player2 = "Forty";
            if (score1 == 1)
                player1 = "Fifteen";
            if (score1 == 2)
                player1 = "Thirty";
            return player1 + "-" + player2;
        }

        if (score1 > this.score2 && this.score2 >= 3) {
            score = "Advantage player1";
        }

        if (this.score2 > score1 && score1 >= 3) {
            score = "Advantage player2";
        }

        if (score1 >= 4 && this.score2 >= 0 && (score1 - this.score2) >= 2) {
            return "Win for player1";
        }
        if (this.score2 >= 4 && score1 >= 0 && (this.score2 - score1) >= 2) {
            return "Win for player2";
        }
        return score;
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