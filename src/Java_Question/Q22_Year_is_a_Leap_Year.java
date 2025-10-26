package Java_Question;
import java.util.Scanner;
public class Q22_Year_is_a_Leap_Year {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter year");
        int year =scanner.nextInt();

        if((year%4==0 && year%100!=0) || (year%400==0))
            System.out.println("Its a leap year");
        else System.out.println("Not a leap year");
    }
}
