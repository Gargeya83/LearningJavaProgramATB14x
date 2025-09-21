package ex_03_Literals;

// Literals can be Numeric and Non-Numeric
// In below example the 10 is the literal
// data_types variable_name (identifier) = variable_value (literal)
        /* Types of Literals
                1. Boolean Literals - true/false
                2. Character literals
                3. String Literals
                4. Integral Literals
                5. Floating Literals
                6. null Literals, Scientific Literals
         */


public class Lab030_Literals_P1 {
    public static void main(String[] args) {
        // Integral literal
        int age = 65;
        int Enum = 9; //This is the valid variable because E is capital
        System.out.println("These are the integral literal = " + a + ", " + Enum);

        System.out.println(age);
        final float pi = 3.14f;   // literal - float
        System.out.println(pi);
        final int girl_age = 18;
        //girl_age = 19;
    }
}
