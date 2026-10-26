package part17;

public class Car {

    // This lets me create a car with my own information
    public Car(String make, String model, String color, int year) {
        // This saves my car brand
        this.make = make;
        // This saves my car model
        this.model = model;
        // This saves my car color
        this.color = color;
        // This saves my car year
        this.year = year;
    }

    // This stores my car brand
    String make = "Ford";
    // This stores my car model
    String model = "Mustang";
    // This stores my car color
    String color = "red";
    // This stores my car year
    int year = 2021;
    // This makes my car print its information
    public String toString() {
        return make + "\n" + model + "\n" + color + "\n" + year;
    }

}
