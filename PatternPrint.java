public class PatternPrint {
    public static void main(String[] args){
        int i;
        int n=4;
        int j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
}
