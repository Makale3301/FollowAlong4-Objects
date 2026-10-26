package part20;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)

// No video in this part — it is a checkpoint.
// Look back at: part 18 (passing objects), part 17 (toString), part 02 (int vs double).
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
// Stretch B2 and B3 also change your Receiver class.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args) {
        // This creates my quarterback and receiver
        Quarterback carter = new Quarterback("Carter", 40);
        Receiver davis = new Receiver("Davis", 11);
        // This makes the quarterback throw two passes
        Receiver slot = davis;
        carter.throwTo(davis, 15);
        carter.throwTo(slot, 10);
        // This prints the receiver's information
        System.out.println(davis);
        // This shows integer division
        int completions = 2;
        int attempts = 3;
        // This prints different ways to divide
        System.out.println(completions / attempts);
        System.out.println(completions * 100 / attempts);
        System.out.println(completions * 100.0 / attempts);
        // This prints the average yards for Davis
        System.out.println(davis.yardsPerCatch());
        // This creates another receiver
        Receiver rookie = new Receiver("Lee", 3);
        // This prints the rookie's average
        System.out.println(rookie.yardsPerCatch());
        // This creates Brooks and gives him two catches
        Receiver brooks = new Receiver("Brooks", 84);
        brooks.catchBall(25);
        // This prints Brooks with one catch
        System.out.println(brooks);
        // This gives Brooks another catch
        brooks.catchBall(5);
        // This prints Brooks with two catches
        System.out.println(brooks);

    }

    // This calculates the average yards for each catch
    public double yardsPerCatch() {

        // If there are no catches, return zero
        if (catches == 0) {
            return 0.0;
        }

        // Divide the total yards by the number of catches
        return (double) yards / catches;
    }

}
