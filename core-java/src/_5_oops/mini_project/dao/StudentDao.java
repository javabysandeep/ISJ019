package _5_oops.mini_project.dao;

import _5_oops.mini_project.model.Student;

public class StudentDao {
    public void addStudent(Student student) {
        System.out.println("student added successfully");
    }

    public void updateStudent(Student student) {
        System.out.println("student updated successfully");
    }

    public void deleteStudent(int studentId) {
        System.out.println("student deleted successfully");
    }
}
