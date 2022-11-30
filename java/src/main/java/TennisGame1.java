
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
        int tempScore;
        if (m_score1 == m_score2) {
            score = switch (m_score1) {
                case 0 -> "Love-All";
                case 1 -> "Fifteen-All";
                case 2 -> "Thirty-All";
                default -> "Deuce";
            };
        } else {
            if (m_score1>=4 || m_score2>=4)
            {
                int minusResult = m_score1 - m_score2;
                if (minusResult == 1) score = "Advantage player1";
                else if (minusResult == -1) score = "Advantage player2";
                else if (minusResult >= 2) score = "Win for player1";
                else score = "Win for player2";
            }
            else
            {
                for (int i = 1; i < 3; i++)
                {
                    if (i == 1) tempScore = m_score1;
                    else {
                        score += "-";
                        tempScore = m_score2;
                    }
                    switch (tempScore) {
                        case 0 -> score += "Love";
                        case 1 -> score += "Fifteen";
                        case 2 -> score += "Thirty";
                        case 3 -> score += "Forty";
                    }
                }
            }
        }
        return score;
    }
}
