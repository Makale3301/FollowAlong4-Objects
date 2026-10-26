package part20;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)

// Part 20 — CHECKPOINT. No video, no guide.
//
// You write this whole class yourself, starting from an empty file.
// The README lists everything a Quarterback needs, one step at a time.
// Main.java uses it, so you can run Main to check your work.
//
// Leave the "package part20;" line alone.
// Under these comments, type the class: public class Quarterback { ... }
//
// When it works, put a // comment ABOVE every line of code, in YOUR OWN WORDS (Section B).
public class Quarterback {

    // These store my quarterback's information
    private String name;
    private int armStrength;
    private int attempts;
    private int completions;
    private int passingYards;

    // This creates my quarterback
    public Quarterback(String name, int armStrength) {
        this.name = name;
        this.armStrength = armStrength;
        this.attempts = 0;
        this.completions = 0;
        this.passingYards = 0;
    }

    // This gets the quarterback's name
    public String getName() {
        return name;
    }

    // This gets the number of attempts
    public int getAttempts() {
        return attempts;
    }

    // This gets the completed passes
    public int getCompletions() {
        return completions;
    }

    // This gets the total passing yards
    public int getPassingYards() {
        return passingYards;
    }

    // This throws the ball to a receiver
    public boolean throwTo(Receiver target, int yards) {
        attempts++;

        // This checks if the throw is too far
        if (yards > armStrength) {
            System.out.println("Carter -> " + target.getName()
                    + ", " + yards + " yards: INCOMPLETE");
            return false;
        }

        // This counts a completed pass
        completions++;
        passingYards += yards;

        // This gives the receiver the catch
        target.catchBall(yards);

        System.out.println("Carter -> " + target.getName()
                + ", " + yards + " yards: CAUGHT");

        return true;
    }

    // This calculates the completion percentage
    public int completionPercentage() {
        if (attempts == 0) {
            return 0;
        }

        return completions * 100 / attempts;
    }

    // This prints the quarterback's stats
    public String toString() {
        return name + ": " + completions + "/" + attempts
                + ", " + passingYards + " yards, "
                + completionPercentage() + "%";
    }

    // This throws a shorter 10-yard pass
    public boolean throwTo(Receiver target) {
        return throwTo(target, 10);
    }
}
