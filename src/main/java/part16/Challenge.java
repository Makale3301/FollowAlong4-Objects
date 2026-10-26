package part16;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=11407s
// Guide: GUIDE.md in this folder
//
// SECTION D — Challenge. Finish the two methods below. Then run ChallengeTest until every
// test is green. Change only the lines marked YOUR CODE.
// You need a for loop (part 08) and String methods like charAt and indexOf (part 11).

public class Challenge {

    // Return the text with every character written twice.
    // doubleLetters("hi")     should return "hhii"
    // doubleLetters("Java")   should return "JJaavvaa"
    // doubleLetters("")       should return ""
    public static String doubleLetters(String s) {
        // This stores my new word
        String result = "";

        // This goes through every letter
        for (int i = 0; i < s.length(); i++) {

            // This adds each letter twice
            result = result + s.charAt(i) + s.charAt(i);
        }

        // This gives back my new word
        return result;

    }

    // Count how many times word appears in s. Do not count overlaps:
    // once you find word, keep looking AFTER it.
    // countWord("hi hi hi", "hi")   should return 3
    // countWord("aaaa", "aa")       should return 2   (not 3)
    // countWord("hello", "bye")     should return 0
    public static int countWord(String s, String word) {
        // This starts my count at zero
        int count = 0;

        // This starts looking at the beginning
        int start = 0;

        // This keeps checking for the word
        while (s.indexOf(word, start) != -1) {

            // This finds where the word starts
            int position = s.indexOf(word, start);

            // This adds one to my count
            count++;

            // This moves past the word I found
            start = position + word.length();
        }
        // This gives back the total
        return count;

    }
}
