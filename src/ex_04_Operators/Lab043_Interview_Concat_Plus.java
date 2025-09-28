package ex_04_Operators;

public class Lab043_Interview_Concat_Plus {
    public static void main(String[] args) {

        //  + ->
        int a = 10;
        int b = 20;
        System.out.println("a+b");

        // + -> String -> Concatenation
        String first_name = "Gargeya";
        String last_name = "Borgaonkar";
        System.out.println(first_name+last_name); // Concatenation, not addition, because both are strings.
        //System.out.println("first_name+ " " +last_name");

        // System.out.println(first_name-last_name); // Not valid
        // System.out.println(first_name*last_name); // Not valid
        // System.out.println(first_name/last_name); // Not valid

        // + -> behave differently with the data type.
        // + -> operator overloading
        // + operator behaves differently based on the data types of the operands. Is this operator overloading?
        // No, Java does not support operator overloading in the traditional sense like C++.
    }
}
