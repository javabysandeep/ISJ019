package com.itshaala.springbootspringmvcjdbcwebservice.dao;

import com.itshaala.springbootspringmvcjdbcwebservice.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Student> getAllStudents() {
        String sql = "select * from student_tbl";
        List<Student> students = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
        return students;
    }

    public Student getStudentById(int id) {
        String sql = "select * from student_tbl where id = ?";
        Student student = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Student.class), id);
        return student;
    }

    public void addStudent(Student student) {
        String sql = "insert into student_tbl (name, email, phone) values (?, ?, ?)";
        jdbcTemplate.update(sql, student.getName(), student.getEmail(), student.getPhone());
    }

    public void updateStudent(Student student) {
        String sql = "update student_tbl set name = ?, email = ?, phone = ? where id = ?";
        jdbcTemplate.update(sql, student.getName(), student.getEmail(), student.getPhone(), student.getId());
    }

    public void deleteStudent(int id) {
        String sql = "delete from student_tbl where id = ?";
        jdbcTemplate.update(sql, id);
    }

}