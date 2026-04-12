class SecondLargestElement {
    public static int SecondLargestElement1(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                secondLargest = max;   
                max = nums[i];         
            } else if (nums[i] > secondLargest && nums[i] != max) {
                secondLargest = nums[i]; 
            }
        }
        return secondLargest;
    }

    public static void main(String args[]) {
        int[] arr = {7, 7, 2, 2, 10, 10, 10};
        System.out.println("Second Largest Element: " + SecondLargestElement1(arr));
    }
}