package part19;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13857s
//        rewatch from about 3:51:00 for static variables,
//        and from about 3:54:50 for static methods and Math.round
// Guide: GUIDE.md in this folder, steps 3–9
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
// Stretch B3 also adds to your Friend class.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args) {
        // This shows how many friends I have
        System.out.println(Friend.numberOfFriends);

        // This creates my first friend
        Friend a = new Friend("Gary");

        // This creates my second friend
        Friend b = new Friend("Plankton");

        // This shows the new total
        System.out.println(Friend.numberOfFriends);

        // This prints the total using the method
        Friend.displayFriends();

        /*
         MY GUESS:
         0
         2
         You have 2 friends

         The number changes because both friends share the same static count.
        */

        // This rounds the number
        long rounded = Math.round(3.7);

        // This gets the square root
        double root = Math.sqrt(81);

        // This picks the bigger number
        int bigger = Math.max(4, 9);

        // This prints all three answers
        System.out.println(rounded + " " + root + " " + bigger);

        // This calls my square method
        System.out.println(Stretch.square(5));

        // This calls the same method another way
        System.out.println(square(12));

        // This creates another friend
        Friend c = new Friend("Karen");

        // This shows who the newest friend is
        System.out.println("Newest friend: " + Friend.newestFriend);
    }

    // This multiplies a number by itself
    static int square(int n) {
        return n * n;

    }
}
