package Java_Question;

public class Q2_Max_between_3_numbers_using_ternary_operator {

    public static void main(String[] args) {

        int n1=35, n2=20, n3=85;

        String Max_number = (n1 > n2 && n1 > n3) ? "n1 is greatest" : (n2>n3 && n2>n3) ? "n2 is greatest" : "n3 is greatest";

        System.out.println("Max_number:" + Max_number);


    }
}
