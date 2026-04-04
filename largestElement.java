
class Solution {
    public static int largestElement(int[] nums) {
            int max = nums[0];
            for(int i=0; i<nums.length ; i++){
                if(nums[i]>max){
                    max = nums[i];
                }
            }
            return max;
        }
    public static void main(String args[]){
        int[] arr = {-4, -3, 0, 1, -8};
        System.out.println("largest Element : " + largestElement(arr));

    }
}