public class SumOfSubstring {
     public static void main(String[] args) {
        String str = "6759";
        int n = str.length();
        int p, Sum = 0;
        for(int i =0; i<=n ; i++){
            for(int j=i+1 ; j<=n ; j++){
                p = Integer.parseInt(str.substring(i,j));
                Sum += p;
            }
        }
        System.out.println(Sum);
     }
}
