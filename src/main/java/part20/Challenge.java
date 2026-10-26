package part20;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)

// No video in this part — it is a checkpoint.
//
// SECTION D — Challenge. Two methods. The test in src/test/java/part20/ChallengeTest.java checks them.
// Change only the lines marked YOUR CODE. The README explains each one.

public class Challenge {

    // A lottery ticket has three numbers.
    //   all three the same                          → 10
    //   b and c are BOTH different from a           → 5
    //   anything else                               → 0
    //   ticketResult(2, 2, 2) → 10     ticketResult(1, 2, 3) → 5     ticketResult(2, 2, 1) → 0
    public static int ticketResult(int a, int b, int c) {
        // All three numbers match
        if (a == b && b == c) {
            return 10;
        }

        // The second and third numbers are different from the first
        if (a != b && a != c) {
            return 5;
        }

        // No win
        return 0;

    }

    // true if x and y show up the same number of times inside s.
    //   sameCount("catdog", "cat", "dog")   → true    (once each)
    //   sameCount("catcat", "cat", "dog")   → false   (twice and zero times)
    //   sameCount("", "cat", "dog")         → true    (zero each)
    public static boolean sameCount(String s, String x, String y) {
        // Start both counters at zero
        int countX = 0;
        int countY = 0;

        // Go through each letter
        for (int i = 0; i < s.length(); i++) {

            // Count how many times x appears
            if (s.substring(i, i + 1).equals(x)) {
                countX++;
            }

            // Count how many times y appears
            if (s.substring(i, i + 1).equals(y)) {
                countY++;
            }
        }

        // Check if both counts match
        return countX == countY;

    }
}
