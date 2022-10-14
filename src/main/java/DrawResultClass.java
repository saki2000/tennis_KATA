public class DrawResultClass {

    private int score;
    public DrawResultClass(int _score)
    {
        score = _score;
    }
    public String score()
    {
        return  switch (score)
                {
                    case 0 -> "Love-All";
                    case 1 -> "Fifteen-All";
                    case 2 -> "Thirty-All";
                    default -> "Deuce";
                };
    }
}
