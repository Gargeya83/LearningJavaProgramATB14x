package ex_02_Java_basic;

public class Lab011_Common_math_Exception {
    public static void main(String[] args) {
        System.out.println(10/0);
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        // at ex_01_Java_Basics.Lab011_Common_math_Exception.main(Lab011_Common_math_Exception.java:4)
        // System.out.println(10/0); // This will cause an ArithmeticException
        System.out.println(10/2);
    }
}
