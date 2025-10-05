package Java_Question;

import java.util.Scanner;

// Write a program to reverse a string without using inbuilt functions.
public class Q8_Reverse_String {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse:" + " ");
        String userinput = sc.nextLine();
        String reversed = "";

        for (int i = userinput.length() - 1; i >= 0; i--) {
            reversed = reversed + userinput.charAt(i);
        }
        System.out.println("Reversed string: " + reversed);
    }
}



