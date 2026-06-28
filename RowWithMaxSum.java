
public class RowWithMaxSum {
    public static void main(String[] args) {

        int[][] arr = {{1,2,3},{2,4,5},{1,4,1}};

        // Output of Elements of 2D array
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j<arr[0].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int row = -1;
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j<arr[0].length ; j++){
                sum += arr[i][j];
            }
            if(sum>maxSum){
                maxSum = sum;
                row = i;
            }
            sum = 0;
        }
        System.out.println("Row "+ row + " With Max Sum "+ maxSum);
        
}
}
