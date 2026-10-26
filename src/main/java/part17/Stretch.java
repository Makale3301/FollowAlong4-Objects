package part17;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=12528s
//        rewatch from about 3:28:50 if you forget how overloaded constructors work,
//        and from about 3:35:20 for toString
// Guide: GUIDE.md in this folder, steps 4–12
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
// Stretch B2 and B3 also change your Pizza and Car classes.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args) {
        // STRETCH A
        /*
        MY GUESS:
        flatbread
        olives
        null
        Ford
        Mustang
        red
        2021
        */
        // This creates my first pizza
        Pizza a = new Pizza("flatbread", "pesto");
        // This creates my second pizza
        Pizza b = new Pizza("thin crust", "tomato", "cheddar", "olives");
        // This creates an empty pizza
        Pizza c = new Pizza();
        // This prints my first pizza's bread
        System.out.println(a.bread);
        // This prints my second pizza's topping
        System.out.println(b.topping);
        // This prints my empty pizza's bread
        System.out.println(c.bread);
        // This creates my car
        Car car = new Car();
        // This prints my car information
        System.out.println(car);
        // STRETCH B1
        // This stores my car brand
        String make = "Honda";
        // This stores my car model
        String model = "Civic";
        // This stores my car year
        int year = 2019;
        // This makes a description of my car
        String description = year + " " + make + " " + model;
        // This prints my car description
        System.out.println(description);
        // STRETCH B2
        // This creates a pizza with four ingredients
        Pizza pizzaOne = new Pizza("thin crust", "tomato", "cheddar", "olives");
        // This prints my pizza description
        System.out.println(pizzaOne);
        // STRETCH B3
        // This creates another car with different information
        Car other = new Car("Toyota", "Corolla", "blue", 2018);
        // This prints my second car
        System.out.println(other);

    }
}
