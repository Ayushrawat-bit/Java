public class ObjectReferenceLab {

    static void addBonus(ScoreBox box, int bonus) {
        box.setScore(box.getScore() + bonus);
    }

    static void replaceLocally(ScoreBox box) {
        box = new ScoreBox(999); 
        System.out.println("Inside replaceLocally: " + box);
    }

    static ScoreBox createScoreBox(int score) {
        return new ScoreBox(score);
    }
    public static void main(String[] args) {

        ScoreBox a = new ScoreBox(50);
        ScoreBox alias = a;

        ScoreBox b = new ScoreBox(30);

        addBonus(alias, 20);
        System.out.println("After alias bonus: " + a);

        replaceLocally(a);
        System.out.println("After replaceLocally: " + a);

        ScoreBox c = createScoreBox(70);
        System.out.println("Newly created: " + c);

        System.out.println("a == alias: " + (a == alias));
        System.out.println("a == b: " + (a == b));         
        System.out.println("b == c: " + (b == c));         
    }
}
