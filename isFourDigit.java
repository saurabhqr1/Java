import java.util.*;
public class isFourDigit {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        int count = 0;
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        while(n!=0){
            n = n/10;
            count++;
        }
        System.out.println("It is " + count +" digit Number.");

        } 

    }

