import java.util.*;
public class ArrayElementSearch {
    public static void main(String [] args){
        boolean found = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. of Elements in Array :");
        int n = sc.nextInt();
        int [] x = new int[n];
        System.out.println("Enter element of Array :");
        for (int i =0; i<n; i++){
            x[i] = sc.nextInt();
        }
        System.out.println("Enter element you want to Search :");
        int y = sc.nextInt();
        for(int i =0 ; i<n ; i++){
            if(x[i]== y){
              System.out.println("Found at "+ (i+1)+ " th Position.");
              found = true;
              break;
        }
    }
       if(found == false){
            System.out.println("Not Found !!");

        }

    }
}
