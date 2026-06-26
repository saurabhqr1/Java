import java.util.*;
public class FactorialOfNumRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int p = fact(n);
        System.out.println(p);
    }
    public static int fact(int n) {
        if(n==0) return 1;
        else{
            return n*fact(n-1);
        }
    }
}
