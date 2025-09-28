package ex_06_Ternary_Operator;

public class Lab067_TO_Even_Odd {
    public static void main(String[] args) {
        //  Step 1- Input , Output -> data type

        int num = 7;
        System.out.println("Checking Number is Even or Odd");

        // Step 2 - Ternary operator to check even or odd
        String result = (num%2 == 0) ? "even" : "odd";

        System.out.println("The number is = " +result);
        System.out.printf("The number is = %s%n", result);


/*
        String result;
        int a =10;
        int b,c;
        c= a%2;
        System.out.println("Checking Number is Even or Odd");
        result = c==0 ? "Even" : "Odd";
        System.out.printf("The number is = %s", result);

        int number  = 11;
        String result = (number % 2 ==0) ? "Even" : "Odd";
        System.out.println(result);

 */
    }
}
