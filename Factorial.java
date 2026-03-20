import java.util.*;
public class Factorial {
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
        int a = sc.nextInt();
        int value = Fact(a);
        System.out.println(value);

    }
    
}
