package _2_controlStatements.switchDemos;

public class Demo3 {
    public static void main(String[] args) {
        int digit = 10;
        if(digit==0)System.out.println("zero");
        if(digit==1)System.out.println("one");
        if(digit==2)System.out.println("two");
        if(digit==3)System.out.println("three");
        if(digit==4)System.out.println("four");
        if(digit==5)System.out.println("five");
        if(digit==6)System.out.println("six");
        if(digit==7)System.out.println("seven");
        if(digit==8)System.out.println("eight");
        if(digit==9)System.out.println("nine");
        if(digit<0 || digit>9)System.out.println("invalid input");
    }

}
