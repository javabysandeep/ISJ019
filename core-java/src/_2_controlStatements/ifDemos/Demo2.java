package _2_controlStatements.ifDemos;

public class Demo2 {
    public static void main(String[] args) {
        //if () { } //CTE -- condition specified
        //if (1) { } //CTE -- condition must be of boolean type

        if (false) {
            System.out.println("A");
            System.out.println("B");
        }
        if (1 > 2) {
            System.out.println("C");
            System.out.println("D");
        }

        boolean isExecute = true;
        if (isExecute) {
            System.out.println("E");
            System.out.println("F");
        }


    }
}
