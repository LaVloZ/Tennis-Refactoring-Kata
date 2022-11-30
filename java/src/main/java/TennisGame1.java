
public class TennisGame1 implements TennisGame {

    private int m_score1 = 0;
    private int m_score2 = 0;

    public TennisGame1() {
    }

    public void wonPoint(String playerName) {
        if ("player1".equals(playerName))
            m_score1 += 1;
        else
            m_score2 += 1;
    }

    public String getScore() {
        String score = "";
        if (m_score1 == m_score2) {
            if (m_score1 == 0) {
                score = "Love" + "-All";
            } else if (m_score1 == 1) {
                score = "Fifteen" + "-All";
            } else if (m_score1 == 2) {
                score = "Thirty" + "-All";
            } else {
                score = "Deuce";
            }
        } else if (m_score1 >= 4 || m_score2 >= 4) {
            int minusResult = m_score1 - m_score2;
            if (minusResult == 1) score = "Advantage player1";
            else if (minusResult == -1) score = "Advantage player2";
            else if (minusResult >= 2) score = "Win for player1";
            else score = "Win for player2";
        } else {
            if (m_score1 == 0) {
                score = "Love";
            } else if (m_score1 == 1) {
                score = "Fifteen";
            } else if (m_score1 == 2) {
                score = "Thirty";
            } else if (m_score1 == 3) {
                score = "Forty";
            }
            score += "-";
            if (m_score2 == 0) {
                score = score + "Love";
            } else if (m_score2 == 1) {
                score = score + "Fifteen";
            } else if (m_score2 == 2) {
                score = score + "Thirty";
            } else if (m_score2 == 3) {
                score = score + "Forty";
            }
        }
        return score;
    }
}
