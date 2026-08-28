public class ScoreBox {
    private int score;

    public ScoreBox(int score) {
        if (score >= 0) {
            this.score = score;
        } else {
            this.score = 0; 
        }
    }
    public int getScore() {
        return score;
    }
    public boolean setScore(int newScore) {
        if (newScore >= 0) {
            this.score = newScore;
            return true;
        }
        return false;
    }
    public String toString() {
        return "ScoreBox{score=" + score + "}";
    }
}
