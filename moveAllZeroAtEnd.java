public class moveAllZeroAtEnd {
    public static void main(String[] args) {
        int[] arr = { 54, 0, 0, 35, 67, 45, 0, 89, 0,};
        int n = arr.length;
        for(int i = 0 ; i < n -1 ; i++){
            for(int j = 0 ; j<n-1-i ; j++){
                if(arr[j] == 0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    for(int a : arr){
        System.out.print(a + "   ");
    }
    }
    
}
