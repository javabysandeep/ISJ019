package _7_misc;

public class Demo6Immutable {
    public static void main(String[] args) {
        //immutable class --> 1.final class, 2. private final fields, 3. no setters
        final class Student {
            final private int id;
            final String name;
            final String address;

            public Student(int id, String name, String address) {
                this.id = id;
                this.name = name;
                this.address = address;
            }
        }

        Student student = new Student(1,"Bhushan","Pune");

    }
}
