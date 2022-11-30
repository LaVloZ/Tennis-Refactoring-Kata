
public class TennisGame2 implements TennisGame
{
    public int score1 = 0;
    public int score = 0;
    
    public String P1res = "";
    public String P2res = "";

    public TennisGame2() {
    }

    public String getScore(){
        String score = "";
        if (score1 == this.score && score1 < 4)
        {
            if (score1 ==0)
                score = "Love";
            if (score1 ==1)
                score = "Fifteen";
            if (score1 ==2)
                score = "Thirty";
            score += "-All";
        }
        if (score1 == this.score && score1 >=3)
            score = "Deuce";
        
        if (score1 > 0 && this.score ==0)
        {
            if (score1 ==1)
                P1res = "Fifteen";
            if (score1 ==2)
                P1res = "Thirty";
            if (score1 ==3)
                P1res = "Forty";
            
            P2res = "Love";
            score = P1res + "-" + P2res;
        }
        if (this.score > 0 && score1 ==0)
        {
            if (this.score ==1)
                P2res = "Fifteen";
            if (this.score ==2)
                P2res = "Thirty";
            if (this.score ==3)
                P2res = "Forty";
            
            P1res = "Love";
            score = P1res + "-" + P2res;
        }
        
        if (score1 > this.score && score1 < 4)
        {
            if (score1 ==2)
                P1res="Thirty";
            if (score1 ==3)
                P1res="Forty";
            if (this.score ==1)
                P2res="Fifteen";
            if (this.score ==2)
                P2res="Thirty";
            score = P1res + "-" + P2res;
        }
        if (this.score > score1 && this.score < 4)
        {
            if (this.score ==2)
                P2res="Thirty";
            if (this.score ==3)
                P2res="Forty";
            if (score1 ==1)
                P1res="Fifteen";
            if (score1 ==2)
                P1res="Thirty";
            score = P1res + "-" + P2res;
        }

        if (score1 > this.score && this.score >= 3)
        {
            score = "Advantage player1";
        }
        
        if (this.score > score1 && score1 >= 3)
        {
            score = "Advantage player2";
        }
        
        if (score1 >=4 && this.score >=0 && (score1 - this.score)>=2)
        {
            score = "Win for player1";
        }
        if (this.score >=4 && score1 >=0 && (this.score - score1)>=2)
        {
            score = "Win for player2";
        }
        return score;
    }

    public void P1Score(){
        score1++;
    }
    
    public void P2Score(){
        score++;
    }

    public void wonPoint(String player) {
        if ("player1".equals(player))
            P1Score();
        else
            P2Score();
    }
}