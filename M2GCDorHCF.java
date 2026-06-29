public class M2GCDorHCF {
    public static void main(String[] args) {
        int a = 12;
        int b = 16;
        GCD(a,b);
        System.out.println(GCD(a, b));
    }
    public static int GCD(int a , int b) {
        if(a==0) return b;
        return GCD(b%a, a);
    }
}
