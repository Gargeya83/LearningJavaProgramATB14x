package ex_03_Literals;

public class Lab032_Boolean_Literals {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        boolean is_Java_fun = true;

        System.out.println(a);  // Output: true
        System.out.println(b);  // Output: false
        System.out.println("Is Java fun? " + is_Java_fun);  // Output: Is Java fun? true


        boolean is_married = true;
        boolean is_married_amit = false;
        // boolean is_married_amit = 123;
        //boolean is_married_test = 123 //We cannot give any value to the boolean
        boolean is_not_married = false;
        System.out.println("These are the boolean literals which have True and False = " + is_married + is_not_married);

    }
}
