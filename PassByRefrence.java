public class PassByRefrence {
    public static void change(int[] y){
        y[3]= 56;

    }
    public static void main(String [] args){
        int [] x = { 3, 4, 23, 43, 44, 5, 23, 45 };
        System.out.println("Before change "+ x[3]);
        change(x);
        System.out.println("After change " + x[3]);
    }
}
