package _8_array;

public class Demo3 {
    public static void main(String[] args) {
        class Student {
            int id;
            String name;
        }
        Student student = new Student();
        System.out.println(student.toString());//hashcode
        System.out.println(student);//hashcode

        int[] array = {1, 2, 3, 4, 5};
        System.out.println(array);//hashcode
    }
}
