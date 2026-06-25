public class TransposeOfAnyMAtrix {
    public static void main(String[] args) {
    int[][] arr = {{1,2,3},{2,4,5},{1,4,1}};
    int r = arr.length;
    int c = arr[0].length;
    int[][] brr = new int[c][r];

        for(int i = 0 ; i < brr.length ; i++){
            for(int j = 0 ; j<brr[0].length ; j++){
                brr[i][j] = arr[j][i];
            }
        }
                // Output of Elements of 2D array
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j<arr[0].length ; j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("Transpose of Matrix : \n");
                // Output of Elements of 2D array
        for(int i = 0 ; i<brr.length ; i++){
            for(int j = 0 ; j<brr[0].length ; j++){
                System.out.print(brr[i][j] + "  ");
            }
            System.out.println();
        }
        
}
}
