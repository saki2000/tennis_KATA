public class AdvantageOrWinClass {
    int m_score1;
    int m_score2;

    public AdvantageOrWinClass (int score_1, int score_2)
    {
        m_score1 = score_1;
        m_score2 = score_2;
    }

    public String score()
    {
        String score;
        int minusResult = m_score1-m_score2;
        if (minusResult==1) score ="Advantage player1";
        else if (minusResult ==-1) score ="Advantage player2";
        else if (minusResult>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }



}
