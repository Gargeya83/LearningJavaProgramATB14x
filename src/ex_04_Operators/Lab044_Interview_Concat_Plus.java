package ex_04_Operators;

public class Lab044_Interview_Concat_Plus {

    public static void main(String[] args) {

        String first_name = "Pramod";
        String last_name = "Dutta";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b); // Concatenation first, then addition as strings.
        System.out.println(a + b + first_name + last_name); // Addition first, then concatenation.

        // BOD-MAS - Bracket of Div, mul, add, sub
        System.out.println(first_name + last_name + (a + b));
    }
}
