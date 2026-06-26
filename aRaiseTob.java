import java.util.*;
public class aRaiseTob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base : ");
        int a = sc.nextInt();
        System.out.print("Enter Power : "); 
        int b = sc.nextInt();
        System.out.print("Result is : ");
        System.out.print(Raise(a,b));
    }
    public static int Raise(int a, int b) {
        if(b==0) return 1;
        else return a*Raise(a, b-1);
    }
    // 
    
}
