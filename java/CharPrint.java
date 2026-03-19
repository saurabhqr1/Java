public class CharPrint {
    public static void main(String[] args){
        int i;
        int j;
        int Alf = 65;
        for(i=0;i<4;i++){
            for(j=0;j<i+1;j++){
                System.out.print((char)Alf+" ");
                Alf++;
            }
            System.out.println();
        }
    }
    
}
