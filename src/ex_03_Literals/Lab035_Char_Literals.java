package ex_03_Literals;

public class Lab035_Char_Literals {
    public static void main(String[] args) {
        char c1 = 'A'; // Character can be anything A-Z, a-z, and special character !@#$%^&*()_+
        // char c = "A"; // "" == String = Bunch of Char
        char c10 = 65; // ASCII value of A, (limited numbers) - A -> 65
        char my_laugh_smily = '\u1f60';  // Unicode value of 'A'
        // char ch = "A"; // Error: it's a string, not a character, use single quotes for char
        char ruppes = '₹';


        System.out.println(ruppes);
        System.out.println("Character 1: " + c1);
        System.out.println("Character 2: " + c10);
        System.out.println(my_laugh_smily);

        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space

        // Escape Char
        char new_line = '\n'; // New line character
        char tab_line = '\t';  // Tab character
        char back_space = '\b';  // Backspace character
        char backslash = '\\'; // Backslash character
        char carriage_return = '\r';

        System.out.println("GargeyaBorgaonkar");
        System.out.println("Gargeya" + new_line + "Borgaonkar");
        System.out.println("Gargeya\nBorgaonkar");
        System.out.println("Gargeya" + tab_line + "Borgaonkar");
        System.out.println("Gargeya" + back_space + "Borgaonkar");
        System.out.println(" ----- ");
        System.out.println("Gargeya is " + carriage_return + "Borgaonkar");
        System.out.println("Hi, This is a First line" + new_line + "This is second line\n This is Third line");



    }
}
