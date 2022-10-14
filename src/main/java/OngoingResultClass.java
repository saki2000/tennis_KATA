public class OngoingResultClass {

    private int m_score1;
    private int m_score2;

    public OngoingResultClass (int score_1, int score_2)
    {
        m_score1 = score_1;
        m_score2 = score_2;
    }

    public String score()
    {
        return onGoingResultNames(m_score1) + "-" +onGoingResultNames(m_score2);
    }

    private String onGoingResultNames(int tempScore) {

        String score = "";
        return switch (tempScore) {

            case 0 -> score +="Love";
            case 1 -> score +="Fifteen";
            case 2 -> score +="Thirty";
            case 3 -> score += "Forty";
            default -> score;
        };
    }
}
