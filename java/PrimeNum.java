import java.util.*;
public class PrimeNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean isPrime = true;
        System.out.println("Enter Number to Check Prime :");
        int num = sc.nextInt();
         for(int i = 2 ; i<=Math.sqrt(num); i++){          //i<=num-1     
            if(num%i==0){
                isPrime = false;
            }

        }
        if(isPrime){
          System.out.println("Prime");  
        }
        else{
        System.out.println("Not Prime");
        }
    }    
}
