
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
        if (m_score1 == m_score2) {
            String all = "-All";
            if (m_score1 == 0) {
                return "Love" + all;
            } else if (m_score1 == 1) {
                return "Fifteen" + all;
            } else if (m_score1 == 2) {
                return "Thirty" + all;
            } else {
                return "Deuce";
            }
        } else if (m_score1 >= 4 || m_score2 >= 4) {
            int minusResult = m_score1 - m_score2;
            if (minusResult == 1) return "Advantage player1";
            else if (minusResult == -1) return "Advantage player2";
            else if (minusResult >= 2) return "Win for player1";
            else return "Win for player2";
        } else {
            return getScore(m_score1) + "-" + getScore(m_score2);
        }
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
