public class RevNumByRecursion {
    public static void main(String[] args) {
        int n = 4352;
        Reverse(n,0);
    }
    public static void Reverse(int n, int r) {
       if(n==0){
        System.out.println(r);
         return;
       }
       Reverse(n/10,r*10+n%10);
    }
}
