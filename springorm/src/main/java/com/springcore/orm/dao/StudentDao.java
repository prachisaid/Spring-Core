package com.springcore.orm.dao;

import com.springcore.orm.entities.Student;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class StudentDao {
    
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public StudentDao() {
    }

    public StudentDao(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
    
    @Transactional
    public int insert(Student student){
        int result = (Integer) this.hibernateTemplate.save(student);
        return result;
    }
    
    public Student getStudent(int studentId) {
        Student student = this.hibernateTemplate.get(Student.class, studentId);
        return student;
    }
    
    public List<Student> getAllStudents() {
        List<Student> students = this.hibernateTemplate.loadAll(Student.class);
        return students;
    }
    
    @Transactional
    public void deleteStudent(int studentId) {
        Student result = this.hibernateTemplate.get(Student.class, studentId);
        this.hibernateTemplate.delete(result);
    }
    
    @Transactional
    public void updateStudent(Student student) {
        this.hibernateTemplate.update(student);
    }
}
