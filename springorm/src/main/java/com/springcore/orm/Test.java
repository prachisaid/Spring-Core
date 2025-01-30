package com.springcore.orm;

import com.springcore.orm.dao.StudentDao;
import com.springcore.orm.entities.Student;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/ormconfig.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean go = true;
        
        while(go) {
            System.out.println("PRESS 1 to add new Student");
            System.out.println("PRESS 2 to display all Students");
            System.out.println("PRESS 3 to get details of one Student");
            System.out.println("PRESS 4 to delete a Student");
            System.out.println("PRESS 5 to update a Student");
            System.out.println("PRESS 6 to exit");

            int input = Integer.parseInt(br.readLine());
            
            switch (input) {
                case 1:
                    System.out.println("Enter details of student(id, name, city)");
                    int id = Integer.parseInt(br.readLine());
                    String name = br.readLine();
                    String city = br.readLine();
                    Student student = new Student(id, name, city);
                    int result = studentDao.insert(student);
                    System.out.println("Record has been inserted " + result);
                    break;
                
                case 2:
                    List<Student> students = studentDao.getAllStudents();
                    for(Student s : students) {
                        System.out.println(s.getStudentId() + " " + s.getStudentName() + " " + s.getStudentCity());
                    }   
                    break;
                
                case 3:
                    System.out.println("Enter id of student to display");
                    int sid = Integer.parseInt(br.readLine());
                    Student student1 = studentDao.getStudent(sid);
                    System.out.println(student1.getStudentId() + " " + student1.getStudentName() + " " + student1.getStudentCity());
                    break;
                
                case 4:
                    System.out.println("Enter id of student to delete");
                    int did = Integer.parseInt(br.readLine());
                    studentDao.deleteStudent(did);
                    System.out.println("Student has been deleted");
                    break;
                 
                case 5:
                    System.out.println("Enter details of student(id, name, city) to update");
                    int oldid = Integer.parseInt(br.readLine());
                    String newname = br.readLine();
                    String newcity = br.readLine();
                    Student student2 = new Student(oldid, newname, newcity);
                    int result1 = studentDao.insert(student2);
                    System.out.println("Record has been updated " + result1);
                    break;
                
                case 6:
                    go = false;
                    break;
            }
        }
    }
}

























 
        // Insert
        // Student student = new Student(31479, "Tanuj Kumar", "Banglore");
        // int result = studentDao.insert(student);
        // System.out.println("Number of records inserted : " + result);
        
        // Select
        // Student student1 = studentDao.getStudent(31471);
        // System.out.println(student1.getStudentId() + " " + student1.getStudentName() + " " + student1.getStudentCity());
        
        // Select All
        // List<Student> students = studentDao.getAllStudents();
        // for(Student s : students) {
        //    System.out.println(s.getStudentId() + " " + s.getStudentName() + " " + s.getStudentCity());
        // }