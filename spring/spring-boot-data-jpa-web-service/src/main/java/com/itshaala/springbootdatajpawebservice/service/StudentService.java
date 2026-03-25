package com.itshaala.springbootdatajpawebservice.service;

import com.itshaala.springbootdatajpawebservice.dao.StudentDao;
import com.itshaala.springbootdatajpawebservice.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    public List<Student> getAllStudents() {
        return studentDao.findAll();
    }

    public Student getStudentById(int id) {
        return studentDao.findById(id).get();
    }

    public void addStudent(Student student) {
        studentDao.save(student);
    }

    public void updateStudent(Student student) {
        studentDao.save(student);
    }

    public void deleteStudent(int id) {
        studentDao.deleteById(id);
    }
}