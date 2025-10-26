package Java_Question;
import java.util.Scanner;
public class Q16_Person_is_Check_Eligible_to_vote {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the age");
        int age=scanner.nextInt();

        if(age>=21) System.out.println("Person is eligible to vote");
        else System.out.println("Person is not eligible to vote");

        scanner.close();
    }
}
