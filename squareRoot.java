public class squareRoot {
    public static void main(String[] args) {
        int n = 15;
        System.out.print(sqrtoF(n));
    }
    public static int sqrtoF(int n){
        int root = 0;
        for(int i = 1; i<n ; i++){
            if(i*i<=n){
                root = i;
            }else{
                break;
            }
        }
        return root;
    }
    
}
