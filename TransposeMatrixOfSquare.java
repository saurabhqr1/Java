public class TransposeMatrixOfSquare {
    public static void main(String[] args) {
        int[][] temp = {{0}};
        int[][] arr = {{2,8,3},{7,2,1},{5,5,4}};

        // Output of Elements of 2D array
        for(int i = 0 ; i<arr.length+1 ; i++){
            for(int j = i+1 ; j<arr[0].length-1 ; j++){
                if(arr[i][j] != arr[j][i]){
                    temp[0][0] = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp[0][0];
                }
            }
        }
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j<arr[0].length ; j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
}
}
