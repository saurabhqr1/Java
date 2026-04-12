import java.util.*;
public class OddEvenBitManupulation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int a = sc.nextInt();
        int b = a&1;
        if(b==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }

    }
}
