package Java_Question;

import java.util.Scanner;

// Write a program to reverse a string without using inbuilt functions.
public class Q8_Reverse_String {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse:" + " ");
        String userinput = sc.nextLine();
        String reversed = "";

        for (int i = userinput.length() - 1; i >= 0; i--) {
            reversed = reversed + userinput.charAt(i);
        }
        System.out.println("Reversed string: " + reversed);
    }
}

  /*
 Approach 1
		/*
		String s = "Welcome";
	    String rev = "";

		for(int i=s.length()-1; i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}

------------------------------------------------------------------------
		// Approach 2

		String s = "Welcome";
	    String rev = "";

		for(int i=s.length()-1; i>=0;i--)
		{
		rev= rev+s.charAt(i);
		}
			System.out.print("Reverse string i:"+rev);

-------------------------------------------------------------

		// Approach 3: - Without using string method
		String s= "Welcome";

		String rev="";

		char a[]=s.toCharArray();// this will convert string to character type array
		for (int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}


-----------------------------------------------------------------------------
		// Approach 4:By converting string char array type
				//by converting string into array

        String s= "Welcome";	//1.Original string
        String rev = "";        // 2. An empty string 'rev' is initialized to store the reversed string.
        char a[] = s.toCharArray();  // 3. Convert the original string into a character array.

        System.out.print("Character Array:");
        for (int i=0; i<a.length; i++) {
        System.out.print(a[i] + " ");
        }

		for (int i=a.length-1;i>=0;i--)
		{
			rev= rev+a[i];
			System.out.println("Reverse string:" +rev);
			}

---------------------------------------------------------------

		// Approach  5: Using string buffer class


		StringBuffer s=new StringBuffer("Welcome");

		System.out.println("Reverse string:"+ s.reverse());

--------------------------------------------------------------------
Approach 6: Using string builder class

StringBuilder s=new StringBuilder("Welcome");

System.out.println("Reverse string:" +s.reverse());

------------------------------------------------------------------
Using While loop

  Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the string you want to reverse:");
        String stringBuilder= scanner.next();
        int len=stringBuilder.length();
        String revers="";
        while(len>0){
            revers=revers+stringBuilder.charAt(len-1);
            len--;
        }
        System.out.println("reverse is :"+revers);
    }
}
   */


