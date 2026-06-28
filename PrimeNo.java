import java.util.*;
public class PrimeNo{


    public static void main(String args[]){
        int n;
        boolean check = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n = sc.nextInt();
        if(n<=1){
            check = false;
        }
        for(int i=2; i<n; i++){

            if(n%i==0){
                check = false;
                break;
            }
        }
        if(check){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}