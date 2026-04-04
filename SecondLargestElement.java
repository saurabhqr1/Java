class SecondLargestElement {
    public static int SecondLargestElement1(int[] nums) {
            int max = nums[0];
            int i;
            for(i=0; i<nums.length ; i++){
                if(nums[i]>max){
                    max = nums[i];
                }
            }
            return nums[i];
        }
    public static void main(String args[]){
        int[] arr = {7, 7, 2, 2, 10, 10, 10};
        System.out.println("largest Element : " + SecondLargestElement1(arr));
    }
}