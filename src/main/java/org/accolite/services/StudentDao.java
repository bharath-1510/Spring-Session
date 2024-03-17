package org.accolite.services;

import org.accolite.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public interface StudentDao {
    int createStudent(int rollno,String name);

    List<Student>  getAllStudents();

    String getStudent(int rollno);
}
