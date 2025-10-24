import java.util.*;

public class FirstNFibonachi{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the number of terms in the Fibonacci series to display: ");
        int n = scn.nextInt();
        int a = 0;
        int b = 1;
        int c;
        System.out.println("\nHere is the Fibonachi series upto "+n+" Terms");
        for(int i=1;i<=n;i++){
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }

    }
}