package ex_06_Ternary_Operator;

public class Task_Sep20 {
    public static void main(String[] args) {

    //find whether provided number is an even/odd
    int num=30;
    String result= num %2==0 ? "Even Number" : "Odd Number";
	        System.out.println(num +" is an " +result);

    int num1=15;
    String result1= num1 %2==0 ? "Even Number" : "Odd Number";
	        System.out.println(num1 +" is an " +result1);

    // find max of 3 integers
    int n1 = 2; int n2 = 9;  int n3 = -11 ;
    int result2= (n1>n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
	        System.out.println("Maximum number is: " + result2);

    // Real age Identification
    int age=59;
    String result3= age<18 ? "Minor" : (age>=60 ? "Senior": "Adult");
	        System.out.println ("Person with age "+ age + " is an " + result3);
}
}
