import java.util.*;
public class BinomialCofficent {
    public static int Fact(int n){
        if(n<0){
            System.out.println("Factorial is not defined for negetive values.");
            return -1;
        }

        if(n==1 || n==0){
            return 1;
        }
        else{
            return (n*Fact(n-1));
        }

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF n :");
        int n = sc.nextInt();
        System.out.println("ENTER THE VALUE OF r:");
        int r = sc.nextInt();
        if(r > n || n < 0 || r < 0){
            System.out.println("Invalid input");
            return;
        }

        int value1 = Fact(n);
        int value2 = Fact(r);
        int value3 = Fact(n-r);
        int BiCo = value1/(value2*value3) ;

        System.out.println("Binomial is: "+ BiCo);

    }
    
}
