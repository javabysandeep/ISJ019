package _2_controlStatements.jumpStatements;

public class Demo3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
        //output :1,2,3,4,6,7,8,9,10
    }
}
