import java.util.*;
public class RevPrint {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int rem = 0;
        int rev = 0; 
        System.out.println("Enter A number you Want to Reverse :");
        int num = sc.nextInt();
        while(num>0)
        {
            rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        System.out.println(rev);
    }
}

