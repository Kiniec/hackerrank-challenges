package WeirdNotWeird;

import java.util.Scanner;

public class WeirdNotWeird_Solution {
    public static void main(String[] args) {
        Scanner  input = new  Scanner(System.in);

        int n = input.nextInt();

        if (n%2 != 0  ){
            System.out.print("Weird");
        }//end if
        else if (n%2 == 0 && n>=2 && n<=5 ){
            System.out.println("Not Weird");
        }//end elseif
        else if ( n%2 == 0 && n>=6 && n<=20){
            System.out.print("Weird");
        }//end else if
        else {
            System.out.print("Not Weird");
        }


    }//end main()

}//end class WeirdNotWeird.WeirdNotWeird_Solution

/*Task
Given an integer,

, perform the following conditional actions:

    If is odd, print Weird
    If is even and in the inclusive range of to, print Not Weird
    If is even and in the inclusive range of to print Weird
    If is even and greater than , print Not Weird*/