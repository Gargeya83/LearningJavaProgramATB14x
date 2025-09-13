package ex_02_Java_basic;

public class Lab008_Keywords_Identifiers {
    public static void main(String[] args) {
        // Keywords are reserved words in Java
        // They cannot be used as identifiers (e.g., variable names, method names)
        // int if = 10; // This is not allowed

        // Identifiers are names used to identify variables, methods, classes, etc.
        int if1 = 10; // This is allowed
        System.out.println(if1); // Output: 10

        // Identifiers can contain letters, digits, underscores, and dollar signs
        int $ = 10; // This is allowed
        System.out.println($); // Output: 10

        // Identifiers cannot start with a digit
        // int 1a = 10; // This is not allowed

        // Identifiers are case-sensitive
        int a = 10;
        int A = 20;
        System.out.println(a); // Output: 10
        System.out.println(A); // Output: 20

        // Identifiers cannot be a keyword
        // int if = 10; // This is not allowed
        // int if1 = 10; // This is allowed
    }
}
