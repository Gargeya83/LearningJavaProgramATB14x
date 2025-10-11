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


/*
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter String");
    String str = scanner.nextLine();
    int count = 0;
    boolean inWord = false;
    for (int i = 0 ; i < str.length() ; i++) {
        char ch = str.charAt(i);
        if (ch != ' ' && !inWord) {
            inWord = true;
            count++;
        } else if (ch == ' ') {
            inWord = false;
        }
    }
    System.out.println ("No. of words: " + count);
}
}

------------------------------------------------------------------------
public class NumberOfWords {
    public static void main(String[] args) {
        String str="Here is your string to validate the number of words.";
        String [] splitStr=str.split(" ");
        int len=splitStr.length;
        System.out.println("total number of words in string is: "+len);
        for (int i = 0; i < len; i++) {
            System.out.println("first letter of each word is:"+splitStr[i].charAt(0));
        }

    }
}

-------------------------------------------------------------------
public class P4_NumberOfWordsString {
    public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);
    System.out.println("Enter The String I will count the words");
    String userInput= sc.nextLine();
    String[] S1= userInput.split(" ");
    int count =0;
     for(String s:S1) {
          count++;
     } System.out.println(count);
}}
 */