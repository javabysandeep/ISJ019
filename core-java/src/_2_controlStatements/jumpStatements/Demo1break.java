package _2_controlStatements.jumpStatements;

public class Demo1break {
    public static void main(String[] args) {
       // break; //CTE  as break cannot be used outside the loop or switch

        for (;;){
            System.out.println("loop");
            break;
        }
        //output  : only loop
        ///break means end of loop
    }
}
