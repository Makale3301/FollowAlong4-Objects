package part18;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13181s
//        rewatch from about 3:39:40 for arrays of objects,
//        and from about 3:46:10 for passing an object to a method
// Guide: GUIDE.md in this folder, steps 2–9
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
// Stretch B2 also adds a method to your Garage class.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args) {
        /*
        MY GUESS:
        pizza
        hamburger
        2
        */

        // This makes an array that holds two foods
        Food[] lunch = new Food[2];

        // This puts a pizza in the first spot
        lunch[0] = new Food("pizza");

        // This prints the first food's name
        System.out.println(lunch[0].name);

        // This prints the number of spots in the array
        System.out.println(lunch.length);

        // STRETCH B1

        // This creates my fridge items
        String[] fridge = {"milk", "eggs", "cheese"};

        // This checks every item in my fridge
        for (String item : fridge) {

            // This prints each item
            System.out.println("In the fridge: " + item);
        }

        // STRETCH B2

        // This creates my garage
        Garage garage = new Garage();

        // This creates my BMW
        Car bmw = new Car("BMW");

        // This parks my BMW
        garage.park(bmw);

        // This makes my BMW leave
        garage.leave(bmw);

        // STRETCH B3

        // This creates an array of cars
        Car[] lot = {
                new Car("Honda"),
                new Car("Ford"),
                new Car("Kia")
        };

        // This checks every car in the lot
        for (Car car : lot) {

            // This parks each car
            garage.park(car);
        }

    }
}
