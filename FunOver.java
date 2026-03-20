public class FunOver {
    public static int sum(int a, int b){
        return a+b;
    }
    // Function Overloading using DataType
    public static int sum1(int x, int y){
        return x+y;
    }
    public static float sum1(float x, float y){
        return x+y;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String args[]){
        System.out.println("Sum:" + sum(4, 5, 6));
        System.out.println("Sum: " + sum(8, 9));
        System.out.println("sum1 : "+ sum1(5,7));
        System.out.println("sum1 : "+ sum1(5.6f, 8.9f));

    }
}
// Function Overloading using DataType




