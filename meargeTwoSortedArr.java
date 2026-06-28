import java.util.*;
public class meargeTwoSortedArr {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 6, 8, 9};
        int[] arr2 = {2, 4, 5, 7, 10, 15, 30, 56, 90};
        ArrayList <Integer> newArr =new ArrayList<>();
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0, j= 0 ;
        while(i<n1 && j<n2){
            if (arr1[i] <= arr2[j]){
                 newArr.add(arr1[i]);
                 i++;
            }
            else{
                newArr.add(arr2[j]);
                j++;
            }
        }
        while(i<n1){
                newArr.add(arr1[i]);
                i++;
        }
        while(j<n2){
                newArr.add(arr2[j]);
                j++;
        }
        for(int a : newArr){
            System.out.print(a + "  ");
        }
    } 
}
