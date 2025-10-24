import java.util.*;

public class Primecheck{
    public static void main(String[] args){
    
        int t, n;

        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the number of inputs: ");
        t=scn.nextInt();

        for(int j=1;j<=t;j++){
            System.out.println("Please enter the number to be tested: ");
            n=scn.nextInt();
            
            int isprime = 1;
            for(int i = 2; i*i<n; i++){
                
                if(n%i==0){
                    isprime=0;
                    break;
                }
            }
            if(isprime==1){
                System.out.println("The given number is a prime number");
            }
            else{
                System.out.println("The given number is not a prime number");
            }



        }
        
    }
}