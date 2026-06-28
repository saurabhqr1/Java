import java.util.*;
public class PrimeNoOptmizedAndRange{
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2; i*i <=n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void PrimeInRange(int n){
        for(int i=2; i<n; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
            System.out.print("");
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number : ");
        int n = sc.nextInt();
        if(isPrime(n)){
        System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
        System.out.println("Enter Range of Prime : ");
        int y = sc.nextInt();
        PrimeInRange(y);
    }
}