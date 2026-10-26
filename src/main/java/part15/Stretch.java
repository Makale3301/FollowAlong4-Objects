package part15;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=10770s
//        rewatch 2:59:30–3:09:48 for objects, 2:57:15–2:59:12 for final
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
// Stretch A uses YOUR Car class from the follow-along, so do Section A first.
// Stretch B: your Phone class goes in THIS file, BELOW the last } of class Stretch.

public class Stretch {
    public static void main(String[] args) {
        // STRETCH A
        // This creates my first car
        Car a = new Car();
        // This creates my second car
        Car b = new Car();
        // This changes the first car's color
        a.color = "red";
        // This prints the first car's color
        System.out.println(a.color);
        // This prints the second car's color
        System.out.println(b.color);
        // This makes both variables point to the same car
        a = b;
        // This prints the first car's color again
        System.out.println(a.color);
        // This stores a value that cannot change
        final double TAX_RATE = 0.06;
        // This prints the tax rate
        System.out.println("Tax: " + TAX_RATE);
        // STRETCH B1
        // This creates my first phone
        Phone phone = new Phone();
        // This charges my phone
        phone.charge();
        // This charges my phone again
        phone.charge();
        // This prints my phone information
        System.out.println(phone.brand + " battery: " + phone.battery);
        // STRETCH B2
        // This creates my second phone
        Phone phone2 = new Phone();
        // This changes my second phone's brand
        phone2.brand = "Samsung";
        // This prints both phone brands
        System.out.println(phone.brand + " / " + phone2.brand);
        // This prints both phone batteries
        System.out.println(phone.battery + " / " + phone2.battery);
    }
}
// This class holds my phone information
class Phone {
    // This stores my phone's brand
    String brand = "Apple";
    // This stores my phone's battery
    int battery = 80;
    // This is the highest my battery can go
    final int MAX_BATTERY = 100;
    // This method charges my phone
    void charge() {
        // This increases my battery
        battery = battery + 10;
        // This keeps my battery from going over 100
        if (battery > MAX_BATTERY) {
            battery = MAX_BATTERY;
        }
        // This prints my battery level
        System.out.println("Charging... " + battery + "%");

    }
}
