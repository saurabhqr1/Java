import java.util.*;
public class HwMultiAddInArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. of Elements in Array :");
        int n = sc.nextInt();
        int [] x = new int[n];
        int [] y = new int[n];
        System.out.print("Enter "+ n +" Array Elements :  ");
        for (int i =0; i<n; i++){
            x[i] = sc.nextInt();
            if(i%2==0){
                y[i]= x[i] + 10;
            }
            else y[i] = x[i]*2;
        System.out.println(x[i] + "  "+ y[i] + "  ");
        }
        

    }
    
}
