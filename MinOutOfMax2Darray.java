public class MinOutOfMax2Darray{
    public static void main(String[] args) {

        int[][] arr = {{2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4}};

        // Output of Elements of 2D array
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j<arr[0].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int MinValue = Integer.MAX_VALUE;
        int row = -1;
        for(int i = 0 ; i<arr.length ; i++){
            int MaxValue = Integer.MIN_VALUE;
            for(int j = 0 ; j<arr[0].length ; j++){
                if(arr[i][j] > MaxValue){
                    MaxValue = arr[i][j];
                }
            }
            if(MaxValue<MinValue){
                MinValue = MaxValue;
            }
            
        }
        System.out.println(MinValue);
    }
}

