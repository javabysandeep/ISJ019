package _2_controlStatements.forDemos;

public class Demo4 {
    public static void main(String[] args) {
        boolean flag = false;

        for (System.out.println("initialization"); flag;System.out.println("incr/decr") ) {
            System.out.println("for body");
        }
        //loop wont run once
        //output : initialization

    }
}
