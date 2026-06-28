public class reverseAnArray {
    public static void swap(int [] arr, int n) {
          int i =0, j= n -1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        } 
    }
    public static void main(String [] args){
        int [] arr = {23, 44, 55, 85, 39};
        int n = arr.length;
        swap(arr,n);
        for(int a : arr){
            System.out.print(a + "  ");
        }
    }
}
