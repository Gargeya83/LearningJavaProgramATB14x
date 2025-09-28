package ex_04_Operators;

public class Lab052_InstanceOf_Operator {
    public static void main(String[] args) {

        String s1 = new String("Pramod");
        int a = 10;
        System.out.println(s1 instanceof String);
        // System.out.println(a instanceof String); // Compilation Error: unexpected type
    }
}
