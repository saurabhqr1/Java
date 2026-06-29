public class RecursionArrElementPrint {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,9,22,34,56,77,89};
        Print(arr,0);
    }
    public static void Print(int[] arr, int idx) {
        int n = arr.length;
        if(idx==n) return;
        System.out.print(arr[idx] + " ");
        Print(arr, idx+1);
    }
}
