public class waveArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        swap(arr,n);

    }
    public static void swap(int [] arr, int n) {
        for(int i = 0 ; i<n ; i+=2 ){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for(int a : arr){
            System.out.print(a + "  ");
        }
        
    }
    
}
