package ex_06_Ternary_Operator;

public class Lab069_Real_Age_Classification {
    public static void main(String[] gargeya_args) {

        // Step 1 - Validate input
        if (gargeya_args.length == 0) {
            System.out.println("Please provide your age as a command-line argument.");
            return;
        }

            // Step 2 - Read input
            String user_input =  gargeya_args[0]; //
            System.out.println(user_input);
            //System.out.println(user_input instanceof String);
            System.out.println("User Input (String): " + user_input);

            // Input - String
            // String - Int
            //String-Input --> need to be converted to Int
            int age = Integer.parseInt(user_input);

            String result = (age < 18) ? "Minor" : ((age <= 60) ? "Adult": "Sr. Citizen");
            System.out.println("Age Classification: " + result);

            int int_Age = Integer.parseInt(user_input);
            String result1 = (int_Age) <= 0 ? "Invalid age" : (int_Age >0 && int_Age < 18) ? "Minor" : (int_Age >=18 && int_Age < 60 ? "Adult" : "Senior Citizen");
            System.out.println(result1);

        }
    }

/*
//Real_Age_Classification (  age → 59 ) →  Minor, Adult (Adult , Sr Senior) - Ternary Operator
        int age;
        String result;
        age=17;
        result = (age >=60) ? "The Person is Senior Citizen" : ((age < 60 && age >=18)? "The person is Adult":((age<18)?"The Person is Minor":"Unwanted data Entered"));
        System.out.println(result);
 */