package Java_Question;

import java.util.Scanner;

// Count the Number of Words in a String.
public class Q9_Count_number_of_words_string {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str= sc.nextLine().trim();

        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ' && !inWord) {
                // Start of a new word
                inWord = true;
                count++;
            } else if (ch == ' ') {
                // End of a word
                inWord = false;
            }
        }

        System.out.println("Number of words: " + count);

        sc.close();
    }
}


