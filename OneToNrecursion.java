import java.util.*;
public class OneToNrecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(1,n);
    }
    public static void print(int x , int n) {
        System.out.print(x + "  ");
        if(x>=n) return;
        print(x+1 , n );
        
    }
}
