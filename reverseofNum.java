import java.util.*;
public class reverseofNum{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the number to be reversed: ");
        int numb = scn.nextInt();
        int digit;

        while(numb!=0){
        digit=numb%10;
        numb = numb/10;
        System.out.println(digit);
        }
    }
}