public class ChangeString {
    public static void main(String[] args) {
        String s = "aBCd";
        if (Character.isLowerCase(s.charAt(0))) {
            System.out.println(s.toLowerCase());
        } else {
            System.out.println(s.toUpperCase());
        }
    }
}