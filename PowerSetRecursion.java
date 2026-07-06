import java.util.*;
public class PowerSetRecursion {
    public static void main(String[] args) {
        String str = "abc";
        pwr("", str, 0);
    }
    public static void pwr(String ans, String str, int idx) {
        if(idx == str.length()){
            System.out.print(ans + "  ");
            return;
        }
        char ch = str.charAt(idx);
        pwr(ans+ch, str, idx+1);
        pwr(ans, str, idx+1);
    }
}
