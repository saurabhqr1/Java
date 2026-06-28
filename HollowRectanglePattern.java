public class HollowRectanglePattern {
    public static void HRP(int i, int j){
        for(i=1; i<=4;i++){
            for(j=1; j<=5; j++){
                if(i==1 || i==4 || j==1 || j==5){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
                
            }
            System.out.println();
        }
    }
    
    
    public static void main(String args[]){
       HRP(4,5);
    }
    
}
