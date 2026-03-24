package com.itshaala.controller;

import com.itshaala.dao.StudentDao;
import com.itshaala.model.Student;
import com.itshaala.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/create-form")
    public String createForm() {
        return "create-form";
    }

    @GetMapping("/update-form")
    public String updateForm() {
        return "update-form";
    }

    @PostMapping
    public String createStudent(@ModelAttribute Student student) {
        studentService.createStudent(student);
        return "student-create-success";
    }

    @PutMapping
    public void updateStudent(@ModelAttribute Student student) {
        studentService.updateStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable("id") int studentId) {
        studentService.deleteStudentById(studentId);
    }

    @GetMapping("/{id}")
    public ModelAndView getStudentById(@PathVariable("id") int studentId) {
        Student student = studentService.getStudentById(studentId);
        ModelAndView modelAndView = new ModelAndView("student_by_id");
        modelAndView.addObject("student", student);
        return modelAndView;
    }
}
