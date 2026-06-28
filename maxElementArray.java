public class maxElementArray {
    public static void main(String [] args){
        int [] arr = { 2, 4, 7, 9, 12, 2, 4, 7, 3 };
        int max = arr[0];
        for(int i=1; i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Max is : "+max);
    }
}
