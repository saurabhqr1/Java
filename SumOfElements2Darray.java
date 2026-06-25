import java.util.*;
public class SumOfElements2Darray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][3];

         // Input of Elements of 2D array
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j<arr[0].length ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // Output of Elements of 2D array
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j<arr[0].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        // Sum of elements of 2D array
        int sum = 0;
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j<arr[0].length ; j++){
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}