package Java_Question;

/*
Find if a Person Can Travel Based on Visa Status and Age.
take the input from the user for
Age (integer).
Visa Status (String or boolean).
Check Eligibility:
        :- If age is 18 or older and visa status is valid, the person can travel.
Otherwise, the person cannot travel.
Validation Criteria
Age: - Must be a non-negative integer.
        :- Should be greater than or equal to 18 to be eligible to travel.
Visa Status :- Must be a valid string indicating the visa status (e.g., "valid" or "invalid").
        :- You can also use a boolean where true indicates a valid visa and false indicates an invalid visa.
       */

import java.util.Scanner;

public class Q34_Travel_Visa_Based_On_Status_And_Age {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Visa Status (valid/invalid): ");
        String visa = sc.nextLine().toLowerCase();

        if (age < 0)
            System.out.println("Invalid age entered!");
        else if (age < 18)
            System.out.println("Not eligible: Must be 18 or older to travel.");
        else if (visa.equals("valid"))
            System.out.println("You are allowed to travel.");
        else
            System.out.println("You cannot travel due to invalid visa.");
    }
}

