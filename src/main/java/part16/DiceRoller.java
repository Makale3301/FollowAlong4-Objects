package part16;
import java.util.Random;
public class DiceRoller {

        // This picks random numbers
        Random random = new Random();

        // This stores my number
        int number;

        // This runs when I create a dice roller
        DiceRoller() {
            roll();
        }

        // This rolls my dice
        void roll() {
            number = random.nextInt(6) + 1;
            System.out.println(number);
        }
    }


