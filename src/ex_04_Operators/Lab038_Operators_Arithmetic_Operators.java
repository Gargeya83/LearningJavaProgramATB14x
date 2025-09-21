package ex_04_Operators;

/* Operators
            1. An operator is a special symbol
            2. Tells the compiler to perform the specific mathematical or logical operations on operands.
            3. Operators are used to perform operations by using operands. (variabl names) -> age
            Unary operator which required with single operand
            Binary operator which required with the two operands
            Ternary operator which required three operands
         */

public class Lab038_Operators_Arithmetic_Operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        // + (Addition)
        // - (Subtraction)
        // * (Multiplication)
        // / (Division)
        // s% (Modulus) | Modulus - Remainder
        int a = 20;
        int b = 3;
        float c = 3.0f;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

        System.out.println(a/c);
        System.out.println("a+b");
        System.out.println(a+b);
    }
}
