import java.util.*;
public class isInteger{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number  :  ");
        double n = sc.nextDouble();
        double m = (int)n ;
        if(n-m == 0) System.out.println("Integer ! ");
        else System.out.println("Not an Integer !");

    }


}