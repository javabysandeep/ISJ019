package _2_controlStatements.jumpStatements;

public class Demo7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                return; //end of the method
            }
            System.out.println(i);
        }

        System.out.println("rest of the main");
        //output : 1,2,3,4
    }
}
