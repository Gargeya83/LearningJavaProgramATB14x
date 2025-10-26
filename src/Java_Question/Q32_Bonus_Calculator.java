package Java_Question;
/*
Calculate Bonus Based on Salary and Years of Experience.
          :- take the salary and Year info from the User.

Implement Bonus Calculation Logic:
Define the bonus structure based on salary and years of experience.
           :- If years of experience is less than 1 year: No bonus.
        :- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
           :- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
           :- If years of experience is greater than 6 years: Bonus is 15% of the salary.
*/

import java.util.Scanner;

public class Q32_Bonus_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter salary: ");
        double salary = scanner.nextDouble();
        System.out.println("Enter years of experience(in years): ");
        double year_exp = scanner.nextDouble();
        if (year_exp <= 1){
            System.out.println("No Bonus");
        } else if (year_exp > 1 && year_exp < 4) {
            System.out.println("You got a bonus of 5% of the salary: "+(0.05 * salary));
        } else if (year_exp > 4 && year_exp <= 6) {
            System.out.println("You got a bonus of 10% of the salary: "+(0.10 * salary));
        }
        else {
            System.out.println("You got a bonus of 15% of the salary: "+(0.15 * salary));
        }
    }
}

