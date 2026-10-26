package part15;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=10770s
//        starts at about 2:59:30 — stop at about 3:09:48, when he says
//        "if you would like a copy of all this code"
// Guide: GUIDE.md in this folder, Video 2 — the same lesson, written out step by step
//
// Part 15, video 2 — objects (object-oriented programming)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide).
//    His class with main is called Main. Yours is called ObjectOriented.
//    Leave the "package part15;" line and the "public class ObjectOriented" line alone.
//    He also makes a second class called Car. YOU make that file too:
//    right-click the part15 folder -> New -> Java Class -> type Car -> Enter.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    in THIS file AND in Car.java, saying in YOUR OWN WORDS what that line does.

public class ObjectOriented {
    public static void main(String[] args) {

        // This creates my first car
        Car myCar1 = new Car();

        // This prints the car's model
        System.out.println(myCar1.model);

        // This prints the car's make
        System.out.println(myCar1.make);

        // This prints the car's model again
        System.out.println(myCar1.model);

        // This makes my car drive
        myCar1.drive();

        // This makes my car brake
        myCar1.brake();

        // This creates my second car
        Car myCar2 = new Car();

        // This prints my first car's make
        System.out.println(myCar1.make);

        // This prints my first car's model
        System.out.println(myCar1.model);

        // This adds a blank line
        System.out.println();

        // This prints my second car's make
        System.out.println(myCar2.make);

        // This prints my second car's model
        System.out.println(myCar2.model);

    }
}
