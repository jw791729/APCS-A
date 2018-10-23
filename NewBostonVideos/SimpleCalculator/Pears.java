
/**
 * Pears class is for the calculator.
 *
 * Jason Wheaton
 * @version 10-23
 */

import java.util.Scanner;

class Pears{
    public static void main (String args []){
        Scanner bobby = new Scanner (System.in);
        double fNum, sNum, Answer;
        System.out.println("Enter 1st #: ");
        fNum = bobby.nextDouble();
        System.out.println("Enter 2nd #: ");
        sNum = bobby.nextDouble();
        Answer = fNum + sNum;
        System.out.println(Answer);
        

    

    
    }
}
