import java.util.*;

public class SUM{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The No.:");
        int i=0;
        int n = sc.nextInt();
        int sum = 0;
        while(i<=n){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum is : " + sum);
    }
}