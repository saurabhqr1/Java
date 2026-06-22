public class pelindromeString {
    public static void main(String[] args) {
        String s = "abccba";
        int i = 0, j=s.length()-1;
        while(i<j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else {
                System.out.println(" Not Pelindrome ");
                return;
            }
        }
        System.out.println("pelindrome ");
        return;
    }
}
