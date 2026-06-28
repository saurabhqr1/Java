public class selectionSort {
    public static void main(String[] args) {
        int [] a = { 43, 46, 23, 5, 67, 33, 9, 56, 22};
        
        int n = a.length;
        for(int i = 0 ; i < n ; i++){
            int minInd = i;
            for(int j = i+1 ; j < n ; j++){
                if(a[j] < a[minInd]){
                    minInd = j;
                }
            }
            int temp = a[i];
                a[i] = a[minInd];
                a[minInd] = temp;
        }
        for( int b : a){
            System.out.print(b + "   ");
        }
    }
}
