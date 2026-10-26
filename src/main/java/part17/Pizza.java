package part17;

public class Pizza {


    // These store my pizza ingredients
    String bread;
    String sauce;
    String cheese;
    String topping;
    // This creates a pizza with no ingredients
    Pizza() {
    }
    // This creates a pizza with bread
    Pizza(String bread) {
        this.bread = bread;
    }
    // This creates a pizza with bread and sauce
    Pizza(String bread, String sauce) {
        this.bread = bread;
        this.sauce = sauce;
    }
    // This creates a pizza with three ingredients
    Pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }
    // This creates a pizza with four ingredients
    Pizza(String bread, String sauce, String cheese, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }
    // This turns my pizza information into a description
    public String toString() {

        // This gives back all my pizza ingredients
        return bread + " pizza with " + sauce + ", " + cheese + " and " + topping;
    }

}
