public class ScoringClass {

    int m_score1;
    int m_score2;

    ScoringClass(int _m_score1, int _m_score2)
    {
        m_score1 =  _m_score1;
        m_score2 = _m_score2;
    }
    public String getScore() {

        if (m_score1==m_score2)         {return getDrawResult();}
        if (m_score1>=4 || m_score2>=4) {return getAdvantageOrWinResult();}
        return getOngoingResult();
    }

    private String getOngoingResult() {
        OngoingResultClass ongoingResult = new OngoingResultClass(m_score1, m_score2);
        return ongoingResult.score();
    }

    private String getAdvantageOrWinResult() {
        AdvantageOrWinClass advantageOrWin = new AdvantageOrWinClass(m_score1, m_score2);
        return advantageOrWin.score();
    }

    private String getDrawResult( ) {
        DrawResultClass drawResult = new DrawResultClass(m_score1);
        return drawResult.score();
    }

}
