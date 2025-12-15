package _2_controlStatements.jumpStatements;

public class Demo2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        //output : 1,2,3,4
    }
}
