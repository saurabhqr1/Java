import java.util.*;
public class DecimalToBinary{
    public static void D2B(int x){
        int result = 0;
        int i=0;
        while(x>0){
            int r = x%2;
            result += (r*((int)Math.pow(10,i)));
            x=x/2;
            i++;
        }
    System.out.println("Binary is : "+ result );

    }
    public static void main(String args[]){
        int p;
        System.out.println("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        p= sc.nextInt();
        D2B(p);
    }
}