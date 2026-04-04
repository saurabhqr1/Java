import java.util.*;
public class LinearSearch{
    public static int Linear_Search1(int key , int[] myArr){
        for(int i=0;i<myArr.length ; i++){
            if(myArr[i]==key){
                return i;
            }
               
            }
            return -1;
        }
    
    public static void main(String[] args){
        int a=5;
        int array[]={3, 4, 5, 6, 7, 8, 9};
        System.out.println("array :"+ Linear_Search1(a,array));
     }
    }