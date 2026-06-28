import java.util.*;
public class NumberOfVowelString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.nextLine();
        int cout = 0;
        for(int i = 0 ; i<s.length() ; i++){

            switch (s.charAt(i)) {
                case 'a': 
                case 'e':  
                case 'i':  
                case 'o':  
                case 'u': 
                         cout++;
                         break; 
            }
        }
        System.out.println("No. of Vowels : "+cout );
    }
}
