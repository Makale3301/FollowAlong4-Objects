package part19;

public class Friend {

    // This keeps track of how many friends I have
    static int numberOfFriends = 0;

    // This remembers my newest friend
    static String newestFriend;


    // This stores my friend's name
    String name;

    // This sets the name and adds one friend
    Friend(String name) {
        this.name = name;
        numberOfFriends++;
    }

    // This prints how many friends I have
    static void displayFriends() {
        System.out.println("You have " + numberOfFriends + " friends");
    }

}
