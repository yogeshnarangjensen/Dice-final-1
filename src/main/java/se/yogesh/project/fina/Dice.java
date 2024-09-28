package se.yogesh.project.fina;
import java.util.Random;


    public class Dice {
        private Random random;

        public Dice() {
            random = new Random();  // Initialize Random object
        }

        public int roll() {
            return random.nextInt(6) + 1;  // Roll the dice, returning a value between 1 and 6
        }
    }


