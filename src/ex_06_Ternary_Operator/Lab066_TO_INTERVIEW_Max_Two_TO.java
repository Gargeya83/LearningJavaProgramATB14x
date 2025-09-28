package ex_06_Ternary_Operator;

public class Lab066_TO_INTERVIEW_Max_Two_TO {
    public static void main(String[] args) {
        // Find the maximum number between two numbers.
        int x = 10;
        int y = 20;
        // System.out.println(Math.max(x,y));

        int max = x > y ? x : y;
        String result = x>y ? "X is bigger" : "Y is bigger";
        System.out.println(max);
        System.out.println(result);

    }
}
