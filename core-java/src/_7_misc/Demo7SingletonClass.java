package _7_misc;

public class Demo7SingletonClass {
    public static void main(String[] args) {
       // Student student1 = new Student();//CTE --> constructor is private
        //Student student2 = new Student();//CTE --> constructor is private
        //Student student3 = new Student();//CTE --> constructor is private
        Student s1 = Student.getInstance();
        Student s2 = Student.getInstance();
        Student s3 = Student.getInstance();
    }
}
