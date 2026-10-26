package part16;

public class Human {
    // This stores the person's name
    String name;

    // This stores their age
    int age;

    // This stores their weight
    double weight;

    // This sets up a new human
    Human(String name, int age, double weight) {

        // This saves their name
        this.name = name;

        // This saves their age
        this.age = age;

        // This saves their weight
        this.weight = weight;
    }

    // This makes the person eat
    void eat() {
        // This prints an eating message
        System.out.println(this.name + " is eating");
    }

    // This makes the person drink
    void drink() {
        // This prints a drinking message
        System.out.println(this.name + " is drinking *burp*");
    }
}