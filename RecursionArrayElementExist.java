public class RecursionArrayElementExist {
    public static void main(String[] args) {
        int [] arr = {67, 5, 6, 76, 55, 53, 89, 35, 85};
        int value = 85; 
        System.out.print(exists(arr, value, 0));
    }
    public static boolean exists(int [] arr, int value, int idx) {
        if(idx == arr.length) return false;
        if(arr[idx] == value ) {  
            return true;
        }
        return exists(arr,value,idx+1);

    }
}
