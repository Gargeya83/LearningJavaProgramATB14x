package ex_06_Ternary_Operator;

public class Lab068_To_Three_Max {
    public static void main(String[] args) {

        int n1 = 2;
        int n2 = 9;
        int n3 = -11;
        // LBF
        // Logic Building Formula

        // Step 1 ->  Find the inputs and outputs data type.
        // I/O -> n1,n2,n3 -> int
        // O/P -> int - max number or String we can message with max number.


        // Step 2 - Rough Logic, Think about it.
        //  n1 >  n2 && n1 > n3 ->  n1
        //  n2 > n3 && n2 > n1 -> n2
        //  n3


        // Step 3 - Dryn Run - program

        int max = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);
        String max1 = n1>=n2 ? (n1>=n3? "N1 is Highest ":"N3 is highest"):(n2>=n3 ? "N2 is highest": "N3 is highestsss");
        System.out.printf("max is %d",max);
        System.out.printf("max is %d",max1);

    }
}

/*
CheckGreatest_Ternary
//Interview - Zeta → (AT) Ter nested → Max between 3 numbers →  int n1 = 2; int n2 = 9;  int n3 = -11;
        int n1,n2,n3;
        String result;
        n1=-80;
        n2=-11;
        n3=11;
        result = (n1 > n2 && n1 > n3) ? "n1 is greatest" : ((n2>n3 && n2>n1) ? "n2 is greatest": ((n3>n2 && n3>n1) ? "n3 is greatest": "Not a Greater Number"));
        System.out.println(result);
 */