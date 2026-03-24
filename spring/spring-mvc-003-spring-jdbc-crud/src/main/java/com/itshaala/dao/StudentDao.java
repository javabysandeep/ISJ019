package com.itshaala.dao;

import com.itshaala.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void createStudent(Student student) {
        String sql = "insert into student_tbl(name, email, phone) values(?,?,?)";
        jdbcTemplate.update(sql, student.getName(), student.getEmail(), student.getPhone());
    }

    public void updateStudent(Student student) {
        String sql = "update student_tbl set name=?, email=?, phone=? where id=?";
        jdbcTemplate.update(sql, student.getName(), student.getEmail(), student.getPhone(), student.getId());
    }

    public void deleteStudentById(int studentId) {
        String sql = "delete from student_tbl where id=?";
        jdbcTemplate.update(sql, studentId);
    }

    public Student getStudentById(int studentId) {
        String sql = "select * from student_tbl where id=?";
        return jdbcTemplate.queryForObject(sql, Student.class, studentId);
    }

}
