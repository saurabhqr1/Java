class Complex{
   double x;
   double y;
   Complex(double x, double y){
      this.x = x;
      this.y = y;
   }
   void print(){
    if(y>=0) System.out.println(x+" + "+ y + "i");
    else System.out.println(x+" - "+ (-y) + "i");
   }
   void add(Complex z){
    x += z.x;
    y += z.y;
   }
   void multiply(Complex z){
      x = x*z.x - y*z.y;
      y = x*z.y + y*z.x;
   }
}
public class ComplexNumber {
    public static void main(String[] args) {
        Complex z1 = new Complex(5, -6);
        Complex z2 = new Complex(4, 7);
        z1.print(); z2.print();
        z1.add(z2);
        z1.print();
        z1.multiply(z2);
        z1.print();
    }  
}