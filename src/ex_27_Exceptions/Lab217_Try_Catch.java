package ex_27_Exceptions;

public class Lab217_Try_Catch {

    public static void main(String[] args) {
        String s1 = null;
        // java.lang.NullPointerException
        try {
            s1.trim();
        } catch (Exception e) {
            System.out.println("Error, Trim not allowed for the null values");// o/p - Error, Trim not allowed
        }
        // unchecked null pointer
    }
}
