package com.springjdbc;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.entities.Student;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        System.out.println("Program Started");
        
//        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/jdbcconfig.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        
        Student student = new Student();
        student.setId(41479);
        student.setName("Anuj Rampal");
        student.setCity("Pune");

//        Student student = new Student();
//        student.setId(222);
//        student.setName("Sanika Deokar");
//        student.setCity("Pune");
        
        int result = studentDao.insert(student);

//        Student s = studentDao.getStudent(41471);

        System.out.println("Number of records affected = " + result);
        
        List<Student> s = studentDao.getAllStudents();
        
        for(Student std : s) {
            System.out.println(std);
        }
    }
}
