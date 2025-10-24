import java.util.*;

public class NofDigits{
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Please Enter the Number: ");
        int number = scn.nextInt();
        int count = 0;
        while(number!=0){
            number=number/10;
            count++;

        }
        System.out.println("The given number has "+count+" number of digits");
    }
}