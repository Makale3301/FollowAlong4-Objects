package part20;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)

// Part 20 — CHECKPOINT. No video, no guide.
//
// You write this whole class yourself, starting from an empty file.
// The README lists everything a Receiver needs, one step at a time.
// Main.java uses it, so you can run Main to check your work.
//
// Leave the "package part20;" line alone.
// Under these comments, type the class: public class Receiver { ... }
//
// When it works, put a // comment ABOVE every line of code, in YOUR OWN WORDS (Section B).

package part20;

public class Receiver {

    // These store my receiver's information
    private String name;
    private int number;
    private int catches;
    private int yards;

    // This creates my receiver
    public Receiver(String name, int number) {
        this.name = name;
        this.number = number;
        this.catches = 0;
        this.yards = 0;
    }

    // This gets the receiver's name
    public String getName() {
        return name;
    }

    // This gets the jersey number
    public int getNumber() {
        return number;
    }

    // This gets the number of catches
    public int getCatches() {
        return catches;
    }

    // This gets the total yards
    public int getYards() {
        return yards;
    }

    // This adds a catch and the yards gained
    public void catchBall(int gain) {
        catches++;
        yards += gain;
    }

    // This prints the receiver's information
    public String toString() {
        return "#" + number + " " + name + ": "
                + catches + " catches, " + yards + " yards";
    }
}
