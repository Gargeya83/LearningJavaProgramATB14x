package ex_02_Java_basic;

public class Lab013_Multiple_Main {
    public static void main(String[] args) {

    }

    public static void main(int args) {

    }
    public static void main(String args) {

    }
    public static void main(float args) {

    }

    //There can be multiple main methods in a class with different parameters.=> Main method overloading
    //But JVM will only call the main method which has string array as an argument.
    //The main method signature must be exactly as below:
    //public static void main(String[] args) {
    //    System.out.println("This is main method");
    //}
}
