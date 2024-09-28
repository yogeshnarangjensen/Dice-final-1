package se.yogesh.project.fina;

 public class Player {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;  // Start with 0 score
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addToScore(int points) {
        this.score += points;  // Add points to the total score
    }
}


