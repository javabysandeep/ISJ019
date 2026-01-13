package _7_misc;

public class Demo13ToEqualsMethod {
    public static void main(String[] args) {
        class A {
        }
        A ref1 = new A();
        A ref2 = new A();
        System.out.println(10 == 10);//true
        System.out.println(10 == 20);//false
        System.out.println(ref1 == ref2);//false
        System.out.println(ref1.equals(ref2));//false
        ref1 = ref2;
        System.out.println(ref1.equals(ref2));//true



        /*

        public boolean equals(Object obj) {
                return this == obj;// ---> ref1 == ref2
         }

        * */


    }
}
