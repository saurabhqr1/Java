import java.util.*;
public class OnlyRough {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        long n = sc.nextLong();
        long fact = 1;
        while( n!=0 ){
            fact *= n;
            n--;
        }
        System.out.println(fact);
    }
}
