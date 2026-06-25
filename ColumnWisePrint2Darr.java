public class ColumnWisePrint2Darr {
        public static void main(String[] args) {

        int[][] arr = {{2,8,3,4},{7,2,1,6},{5,5,4,1}};

        // Output of Elements of 2D array
        for(int j = 0 ; j<arr[0].length ; j++){
            for(int i = 0 ; i<arr.length ; i++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
}
}
