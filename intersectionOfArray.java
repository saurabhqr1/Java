import java.util.*;
public class intersectionOfArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 4, 1, 4};
        int[] nums2 = {5, 4, 1, 4};
        ArrayList<Integer> arr = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                arr.add(nums1[i]);
                i++;
                j++;
            }
            else if (nums1[i] > nums2[j]) {
                j++;
            }
            else {
                i++;
            }
        }

        System.out.println(arr);
    }
}
