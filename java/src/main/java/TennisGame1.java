
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
            score = getScore(m_score1) + "-All";
            if (m_score1 > 2) {
                score = "Deuce";
            }

        } else if (m_score1 >= 4 || m_score2 >= 4) {
            int minusResult = m_score1 - m_score2;
            if (minusResult == 1) score = "Advantage player1";
            else if (minusResult == -1) score = "Advantage player2";
            else if (minusResult >= 2) score = "Win for player1";
            else score = "Win for player2";
        } else {
            return getScore(m_score1) + "-" + getScore(m_score2);
        }
        return score;
    }

    private String getScore(int score) {
        if (score == 0) {
            return "Love";
        } else if (score == 1) {
            return "Fifteen";
        } else if (score == 2) {
            return "Thirty";
        } else if (score == 3) {
            return "Forty";
        }
        return "";
    }
}
