package part16;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=11407s
//        rewatch 3:10:07–3:19:32 for constructors and "this",
//        3:19:50–3:25:04 for local and global variables
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
// Your extra classes (Counter, Pet, Broken) go in THIS file,
// BELOW the last } of class Stretch, without the word public.

public class Stretch {
    public static void main(String[] args) {

        // STRETCH A

        /*
        MY GUESS:
        3
        10
        3
        20

        The first number is local.
        The second number belongs to the object.
        */

        // This creates my counter
        Counter c = new Counter();

        // This runs my counter
        c.show();

        // This changes my counter's number
        c.count = 20;

        // This runs my counter again
        c.show();


        // STRETCH B1

        // This creates my first pet
        Pet pet1 = new Pet("Max", 3);

        // This creates my second pet
        Pet pet2 = new Pet("Luna", 5);

        // This makes my first pet speak
        pet1.speak();

        // This makes my second pet speak
        pet2.speak();


        // STRETCH B2

        // This gives my first pet a birthday
        pet1.birthday();

        // This prints my pet's new age
        pet1.speak();


        // STRETCH B3

        // This creates my broken object
        Broken broken = new Broken("Max", 3);

        // This prints my object's information
        System.out.println(broken.name + " " + broken.age);
    }
}


// STRETCH A

// This class keeps track of a number
class Counter {

    // This stores my number
    int count = 10;

    // This method shows my numbers
    void show() {

        // This creates a local number
        int count = 3;

        // This prints the local number
        System.out.println(count);

        // This prints the object's number
        System.out.println(this.count);
    }
}


// STRETCH B

// This class holds my pet information
class Pet {

    // This stores my pet's name
    String name;

    // This stores my pet's age
    int age;

    // This constructor creates my pet
    Pet(String name, int age) {

        // This saves my pet's name
        this.name = name;

        // This saves my pet's age
        this.age = age;
    }

    // This method makes my pet speak
    void speak() {

        // This prints my pet's information
        System.out.println(name + " is " + age + " years old");
    }

    // This method gives my pet a birthday
    void birthday() {

        // This increases my pet's age
        age++;

        // This prints a birthday message
        System.out.println("Happy birthday, " + name + "!");
    }
}


// STRETCH B3

// This class shows how constructors work
class Broken {

    // This stores my name
    String name;

    // This stores my age
    int age;

    // This constructor fixes the problem
    Broken(String name, int age) {

        // This saves the name to my object
        this.name = name;

        // This saves the age to my object
        this.age = age;

    }
}
