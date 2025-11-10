package ex_27_Exceptions;

public class Lab231_Finally_Not_Executed {
    public static void main(String[] args) {
        try {
            int a =  10/10; // Force exception
            System.out.println("Try Executed");
            System.exit(0);  // JVM exits here → finally won't execute
            //  return;
        } catch (Exception e) {
            System.out.println("Catching the exception");
        } finally {
            System.out.println("I will be always executed!");
        }

    }
}
