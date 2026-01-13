package _7_misc;

public class Demo1Final {

    public static void main(String[] args) {
        //final abstract class A{}//CTE
        abstract class A {
            // final abstract void m1();//CTE
        }//CTE

        //variable[LV, SV,IV], method, class ---> class

        final int variable = 100;
        //variable = 200; // reassignment--CTE as variable is final

    }
}
