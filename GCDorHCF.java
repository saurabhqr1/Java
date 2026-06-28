public class GCDorHCF {
    public static void main(String[] args) {
        int a = 12, b = 16, hcf = 1 ;
        int h = Math.min(a, b);
        for(int i = 1; i<=h ; i++){
            if(a%i == 0 && b%i == 0){
                hcf = i;
            }
        }
        System.out.println(hcf);
    }
}
