public class firstOccInSortedArr {
    public static void main(String[] args) {
        int[] a = {3, 5, 6, 8, 9, 9, 9, 12, 23, 43, 45};
        int target = 9;
        System.out.println(firstOccurance(a, target));
    }
    public static int firstOccurance(int [] a, int target){
        int low = 0, high = a.length-1;
        int value =  -1, mid;
        while(low<=high){
            mid = low + (high-low)/2;
            if(a[mid] == target){
                value = mid;
                high = mid -1;
            }
            else if(a[mid] > target){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return value;
    }
}
