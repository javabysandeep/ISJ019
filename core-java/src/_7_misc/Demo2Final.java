package _7_misc;

public class Demo2Final {

    public static void main(String[] args) {
       class A {
           final int x;
           final int y;
           final static int z;
           static {
               z=20;
           }

           /*{
               x=10;
               y=20;
           }*/
           A(int x, int y){
               //super
               //instance block
               this.x=x;
               this.y=y;
           }
       }
       A a1 = new A(100,200);
       //a1.x=200;//CTE --> instance variables are final
       //a1.y=200;//CTE---> instance variables are final

    }
}
