
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
        String score;
        if (m_score1 == m_score2) {
            if (m_score1 <= 2) {
                return getScore(m_score1) + "-All";
            }
            return "Deuce";
        } else if (m_score1 >= 4 || m_score2 >= 4) {
            int minusResult = m_score1 - m_score2;
            if (minusResult == 1) return "Advantage player1";
            else if (minusResult == -1) return "Advantage player2";
            else if (minusResult >= 2) return "Win for player1";
            return "Win for player2";
        }
        return getScore(m_score1) + "-" + getScore(m_score2);
    }

    private String getScore(int score) {
        if (score == 0) return "Love";
        if (score == 1) return "Fifteen";
        if (score == 2) return "Thirty";
        if (score == 3) return "Forty";
        return "";
    }
}
