package com.itshaala.springbootdatajpawebservice.dao;

import com.itshaala.springbootdatajpawebservice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student, Integer> {
}
