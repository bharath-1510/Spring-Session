package org.accolite;

import org.accolite.model.Address;
import org.accolite.model.Employee;
import org.accolite.services.StudentDao;
import org.accolite.services.TestAnnotationDl;
import org.accolite.services.impl.StudentDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@ComponentScan(basePackages = "org.accolite")
public class App {
    @Bean
    public Employee employee() {
        return new Employee(1, "Ram", "123@gmail.com",
                new Address("Tuty", "TamilNadu"), Map.of("DevOps Engineer",2,"Software Engineer",3),Arrays.asList("12132332", "1212121"));
    }

    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        Employee employ = (Employee) context.getBean("employ");
//        System.out.println(employ);
//        Employee employ1 = (Employee) context.getBean("employ1");
//        System.out.println(employ1);
//        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);

//        System.out.println(context.getBean("employee"));
//        TestAnnotationDl testAnnotation = (TestAnnotationDl) context.getBean("TestAnnotation");
//        testAnnotation.sendprint();
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        JdbcTemplate bean = (JdbcTemplate) context.getBean("jdbcTemplate");
        StudentDaoImpl studentDao = new StudentDaoImpl();
        studentDao.setJdbcTemplate(bean);
//        System.out.println(studentDao.createStudent(2,"Ram"));
//        System.out.println(studentDao.createStudent(3,"Sita"));
        studentDao.getAllStudents().stream().forEach(System.out::println);
        System.out.println(studentDao.getStudent(3));

    }
}