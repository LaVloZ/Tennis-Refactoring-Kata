
public class TennisGame3 implements TennisGame {
    
    private int p2;
    private int p1;
    private final String player1;
    private final String player2;

    public TennisGame3(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String getScore() {
        String s;
        if (p1 < 4 && p2 < 4 && !(p1 + p2 == 6)) {
            String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"}; 
            s = p[p1];
            return (p1 == p2) ? s + "-All" : s + "-" + p[p2];
        } else {
            if (p1 == p2)
                return "Deuce";
            s = p1 > p2 ? player1 : player2;
            return ((p1-p2)*(p1-p2) == 1) ? "Advantage " + s : "Win for " + s;
        }
    }
    
    public void wonPoint(String playerName) {
        if ("player1".equals(playerName))
            this.p1 += 1;
        else
            this.p2 += 1;
        
    }

}
