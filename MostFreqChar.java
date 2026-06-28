public class MostFreqChar {
    public static void main(String[] args) {
        String s = "aabbccddd";
        int n = s.length();
        int i=0, j=0, freq = 0, maxFreq = -1;
        while(j<n){
            if(s.charAt(i) == s.charAt(j)){
                j++;
                freq++;
            }
            else {
                i=j;
                if(maxFreq < freq){
                    maxFreq = freq;
                }
                freq = 1;
            }
        }
        System.out.println(maxFreq);

    }
}
