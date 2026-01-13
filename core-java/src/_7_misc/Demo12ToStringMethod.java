package _7_misc;

public class Demo12ToStringMethod {
    public static void main(String[] args) {
        class A {
        }
        A ref = new A();
        //_7_misc.Demo12ToStringMethod$1A @ 5f184fc6
        System.out.println(ref.getClass().getName() + "@" + Integer.toHexString(ref.hashCode()));
        System.out.println(ref.toString());
        System.out.println(ref);
        ref.equals(null);

        /*

        public boolean equals(Object obj) {
                return this == obj;
         }

        * */





    }
}
