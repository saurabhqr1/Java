public class PreInPostRecursion {
    public static void main(String[] args) {
        int n = 2;
        pip(n);
    }
    public static void pip(int n) {
        if(n==0) return;
        System.out.print(n + " ");
        pip(n-1);
        System.out.print(n + " ");
        pip(n-1);
        System.out.print(n + " ");
        
    }
}
