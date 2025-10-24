import java.util.*;

public class inverseofnum{
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the number to be inversed: ");
        int number = scn.nextInt();
        int count = 1;
        int inv_num=0;
        while (number!=0){
            int digit = number%10;
            number=number/10;
            inv_num= inv_num+ count*(int)Math.pow(10,digit-1);
            count++;
        }
        System.out.println(inv_num);

    }
}