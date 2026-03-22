import java.util.*;
public class NumberConversion {
    public static int BinaryToDecimal(int len, String binary){
        int decimal = 0;
        for(int i=0; i<len; i++){
            int num = binary.charAt(len - 1- i) -'0';
            decimal += num*(Math.pow(2, i));
        }
        return decimal;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary Number :");
        String binary = sc.nextLine();
        int len = binary.length();
        System.out.println(BinaryToDecimal(len, binary));
        
    }
    
}
