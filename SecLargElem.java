public class SecLargElem {
    public static void main(String[] args) {
        int [] arr = { 2, 3, 75, 32, 43};
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            else if(arr[i] > secMax && arr[i] != max ) {
                secMax = arr[i];
            }
        }
        System.out.println(secMax);
    }
}
