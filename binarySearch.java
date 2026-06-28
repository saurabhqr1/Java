public class binarySearch{
    public static int binary1(int[] a , int target){
        int l = 0, h = a.length -1;
        while(l<=h){
            int m = l+(h-l)/2;
            if(a[m] == target){
                return m;
            }
            else if(a[m] > target){
                h = m-1;
            }
            else {
                l = m + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {4, 5, 6, 7, 8, 99, 100, 333, 544, 677, 1020};
        int t = 100;
        int p = binary1(a,t);
        System.out.println(p);
    }
}