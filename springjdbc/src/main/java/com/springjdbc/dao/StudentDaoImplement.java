package com.springjdbc.dao;

import com.springjdbc.entities.Student;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component("studentDao")
public class StudentDaoImplement implements StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    @Override
    public int insert(Student student) {
        String query = "INSERT INTO student(id, name, city) VALUES(?, ?, ?)";
        int result = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
        return result;
    }

    @Override
    public int change(Student student) {
        String query = "UPDATE student SET name=?, city=? WHERE id=?";
        int result = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
        return result;
    }

    @Override
    public int delete(int studentId) {
        String query = "DELETE FROM student WHERE id=?";
        int result = this.jdbcTemplate.update(query, studentId);
        return result;
    }

    @Override
    public Student getStudent(int studentId) {
        RowMapper<Student> rowMapper = new RowMapperImplement();
        String query = "SELECT * FROM student WHERE id = ?";
        Student result = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
        return result;
    }

    @Override
    public List<Student> getAllStudents() {
      String query = "SELECT * FROM student";
      List<Student> result = this.jdbcTemplate.query(query, new RowMapperImplement());
      return result;
    }
    
}
