import java.util.*;

public class DigitsOfNumber{
    public static void main(String [] args){
        Scanner scn  = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num = scn.nextInt();
        int count = 0;
        int orginal_num = num;

        while(num!=0){
            num=num/10;
            count++;
        }

        num = orginal_num;

    
        while(count!=0){
            count--;
            int digit=num/(int)Math.pow(10,count);         // 1223   ->1 2 2 3
            num = num%(int)Math.pow(10,count);
            System.out.println(digit);
        }

    }
}