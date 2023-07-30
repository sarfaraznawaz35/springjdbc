package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main(String[] args )
    {
        System.out.println( "My Program started.............." );
        // spring jdbc=> jdbcTemplate
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
       
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        
        //INSERT...........
//        Student student = new Student();
//        student.setId(863);
//        student.setName("John");
//        student.setCity("Lucknow");
//        
//        int result = studentDao.insert(student);
//        System.out.println("Student added" + result);
        
        
        //UPDATE........
        
        // Student student = new Student();
        // student.setId(456);
        // student.setName("Raj");
        // student.setCity("Siwan");
        // int result = studentDao.change(student);
        // System.out.println("data changed " +result);
        
        //DELETE.......
//        int result = studentDao.delete(666);
//        System.out.println("deleted" + result);
        
        
        //SELECT single data........
//        Student student = studentDao.getStudent(222);
//        System.out.println(student);
        
        
        //SELECTING Multiple or ALL data
        List<Student> students = studentDao.getAllStudents();
        for (Student s:students)
        {
        	System.out.println(s);
        }
        
    }
}
