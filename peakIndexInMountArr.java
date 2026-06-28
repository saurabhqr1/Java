public class peakIndexInMountArr {
    public static void main(String[] args) {
        int [] arr = {0,5,10,5,2,0};
        System.out.println(peakIndex(arr));

    }
    public static int peakIndex(int[] arr){
        int low = 0,high = arr.length-1,mid = -1;
        while(low<=high){
            mid = low + (high-low)/2;
            if(arr[mid]<arr[mid+1]){
                low = mid -1;
            }
            else{
                high = mid;
            }
        }
        return low;
    }
}
