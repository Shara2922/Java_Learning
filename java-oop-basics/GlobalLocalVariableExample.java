// ✅ GLOBAL vs LOCAL VARIABLES

public class ScoreManager {
    // Global (instance) variable: accessible throughout the class
    int score = 0;

    public void increaseScore() {
        // Local variable: only accessible inside this method
        int bonus = 10;

        score += bonus;
        System.out.println("Updated score: " + score);
    }

    public static void main(String[] args) {
        ScoreManager manager = new ScoreManager();
        manager.increaseScore();
    }
}
