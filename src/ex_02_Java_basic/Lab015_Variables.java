package ex_02_Java_basic;

public class Lab015_Variables {

    public static void main(String[] args) {
        // ```
        // data_type variable_name =  variable_value
        //```

        byte age = 65;
        byte age_sunil = 45;
        // short age_sunil = 65;
        //byte pra2= 128; // overflowing out of space
        //int enum = 1234; /* this is not possible as enum is keyword, but if we replace enum to Enum then it will work since Java is a

        // byte -> data type - type of container
        // age_sunil ->  variable_name |  identifier
        // = -> Assignment Operator ?  (after some time)
        // 65 -> Variable Value |  Literal

        byte age2 = 30;
        age = 66;
        age_sunil = 122;
        age_sunil = 111;
        System.out.println(age_sunil);
        System.out.println(age);
        System.out.println(age2);

        /* data_type variable_name or identifier = variable_value or literal */

        int myNum = 5;              // Integer (whole number)
        float myFloatNum = 5.99f;   // Floating point number
        char myLetter = 'D';        // Character
        boolean myBool = true;      // Boolean
        String myText = "Hello";    // String

        System.out.println("Integer: " + myNum);
        System.out.println("Float: " + myFloatNum);
        System.out.println("Character: " + myLetter);
        System.out.println("Boolean: " + myBool);
        System.out.println("String: " + myText);
    }
}
