import java.util.*;
public class Function {
    public static void Swap(int p, int q){
        int temp;
        temp = p;
        p = q;
        q = temp;
        System.out.println("After Swappig :"+ "a = " + p + " b ="+ q);

    }
    public static void CalSum(int int1, int int2) {
        int sum = int1 + int2;
        System.out.println("Sum is : "+ sum);
    }
    public static void  main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Swap(a, b);
        CalSum(a, b);
    }

}
