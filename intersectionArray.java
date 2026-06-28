public class intersectionArray {
    public static void main(String[] args){
    int[] a = {34,44,55,86,23,4,41,56};
    int n = a.length;
    for(int i =1 ; i<n ; i++){
        int j = i;
        while(j>0 && a[j] < a[j-1]){
            int temp = a[j];
            a[j] = a[j-1];
            a[j-1] = temp;
            j--;
        }
    }
    for(int e : a){
    System.out.print(e + " ");
} } 
}