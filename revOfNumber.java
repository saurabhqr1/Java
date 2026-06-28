import java.util.*;
public class revOfNumber {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        long n = sc.nextLong();
        long rem, rev = 0;
        for(; n!=0 ;){
            rem = n%10;
            rev = rev * 10 + rem ;
            n /= 10;
        }
        System.out.println(rev);
        sc.close();
        
    }
}
