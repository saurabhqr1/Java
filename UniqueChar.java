public class UniqueChar {
    public static void main(String[] args) {
        String str = new String("vallv");
        int n = str.length();
        int[] freq = new int[26];
        for(int i = 0; i<n ; i++){
            char ch = str.charAt(i);
            int idx = ch - 'a';
            freq[idx]++;
        }

        int i = 0, j = str.length()-1;
        int c = -1;
        while(i != j){
            char ch = str.charAt(i);
            int idx = ch - 'a';
            if(freq[idx] == 1){
                c = i;
                break ;
            }
            i++;
        }
        System.out.println(str.valueOf(c));

    }
}
