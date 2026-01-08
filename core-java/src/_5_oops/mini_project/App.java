package _5_oops.mini_project;

import _5_oops.mini_project.controller.StudentController;
import _5_oops.mini_project.model.Student;

public class App {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();

        Student student = new Student();
        student.setId(101);
        student.setName("Bhushan");
        student.setEmail("bhushan@gmail.com");
        student.setAge("23.5");
        student.setPhone("1234");

        studentController.addStudent(student);
        studentController.updateStudent(student);
        studentController.deleteStudent(101);
    }
}
