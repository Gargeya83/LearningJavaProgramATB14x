package ex_06_Ternary_Operator;

public class Lab063_Ternary_Operator {

    public static void main(String[] args) {

        int age =18;
        String canIGotoGoa =  age > 18 ? "Yes" : "No";
        String AllowedtoDrink =  age>18 ? "Yes" : "No"; // condition and string because result is in string
        System.out.println(AllowedtoDrink);
        System.out.println(canIGotoGoa);

        int age1 = 19;
        String canIGotoGoa1 = age1 > 18 ? "Yes" : "No";
        System.out.println(canIGotoGoa1);

        int number = 5;
        String result = number>0 ? "+ve" : "-ve";
        System.out.println(result);



    }
}
