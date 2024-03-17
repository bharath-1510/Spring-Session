package org.accolite.services.impl;

import org.accolite.model.Student;
import org.accolite.services.StudentDao;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private JdbcTemplate jdbcTemplate;

    @Override
    public int createStudent(int rollno, String name) {
        String sql = "insert into student(id, name) values(" + rollno + ",'" + name + "')";
        return jdbcTemplate.update(sql);
    }

    @Override
    public List<Student> getAllStudents() {
        String sql = "select * from student";
        List<Student> students = jdbcTemplate.query(sql, new StudentMapper());
        return students;
    }

    @Override
    public String getStudent(int rollno) {
        String sql = "select * from student where id = " + rollno;
        Student student = jdbcTemplate.query(sql, new ResultSetExtractor<Student>() {
            @Override
            public Student extractData(ResultSet rs) throws SQLException, DataAccessException {
                Student student = new Student();

                while (rs.next()) {
                    student.setId(rs.getInt("id"));
                    student.setName(rs.getString("name"));

                }
                return student;
            }
        });
        return student.getName();
    }
}
