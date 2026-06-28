public class rotateAnArray {
    public static void main(String[] args) {
        int [] arr = {11, 63, 33, 83, 59, 87, 53};
        int n = arr.length;
        int last ;
        int k =3;
        for(int j=0 ; j<k; j++){
            last = arr[n-1];
        for(int i = n-1; i>0 ; i--){
            arr[i]=arr[i-1];
        }

            arr[0] = last;
    }
        for(int a : arr){
            System.out.print(a + "  ");
        }
    }
}
