package Java_Programming_Assessment_MCQ;

/*Write a program that demonstrates comparison and logical operators.

**Requirements:**
        - Use comparison operators (==, !=, <, >, <=, >=)
- Use logical operators (&&, ||, !)
- Print boolean results with explanatory messages

 */
public class Q3_Comparison_and_Logical_Operators {
    public static void main(String[] args) {
        int a = 10, b=20;

        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);

        boolean a1 = true;
        boolean b1 = false;
        System.out.println(a1 && b1);
        System.out.println(a1 || b1);
        System.out.println(!b1);



    }
}
