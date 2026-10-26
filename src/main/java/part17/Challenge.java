package part17;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=12741s
//        (no video for the challenge — it uses arrays, from part 10)
//
// SECTION D — Challenge. Two methods. The test in src/test/java/part17/ChallengeTest.java checks them.
// Change only the lines marked YOUR CODE. The README explains each one.

public class Challenge {

    // Add up the numbers in the array, but 13 does not count,
    // and neither does the number right after a 13.
    //   sumSkip13({1, 2, 3})      → 6
    //   sumSkip13({1, 13, 5, 2})  → 3     (13 and 5 are skipped)
    //   sumSkip13({})             → 0
    public static int sumSkip13(int[] nums) {
        // This starts my total at zero
        int sum = 0;

        // This checks every number in my array
        for (int i = 0; i < nums.length; i++) {

            // This skips 13 and the number right after it
            if (nums[i] == 13) {
                i++;
            } else {

                // This adds the other numbers to my total
                sum = sum + nums[i];
            }
        }

        // This gives back my total
        return sum;

    }

    // true if two numbers NEXT TO EACH OTHER in the array are both equal to value.
    //   hasPair({1, 2, 2}, 2)  → true
    //   hasPair({2, 1, 2}, 2)  → false   (the 2s are not next to each other)
    //   hasPair({7}, 7)        → false
    public static boolean hasPair(int[] nums, int value) {
        // This checks each number and the one after it
        for (int i = 0; i < nums.length - 1; i++) {

            // This checks if both numbers match my value
            if (nums[i] == value && nums[i + 1] == value) {

                // This means I found a matching pair
                return true;
            }
        }

        // This means I didn't find a matching pair
        return false;

    }
}
