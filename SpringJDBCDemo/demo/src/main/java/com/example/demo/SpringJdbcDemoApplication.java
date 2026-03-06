package com.example.demo;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcDemoApplication.class, args);

		Student s = context.getBean(Student.class);

		StudentService service = context.getBean(StudentService.class);

		s.setRollNo(3);
		s.setName("Surendhar");
		s.setMarks(57);

		service.addStudent(s);

		List<Student> students = service.getSudents();
		System.out.println(students);

	}


}
