package _7_misc;

public class Student {
    //step 01 : create private constructor to prevent object creation outside the class
    private Student() {
    }

    //step 02 : create static instance variable to hold the single object
    private static final Student INSTANCE = new Student();

    //step 03 : provide static method which returns single and same instance
    public static Student getInstance() {
        return INSTANCE;
    }
}