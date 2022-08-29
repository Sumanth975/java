package com.example.delete.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.delete.Entity.Student;
import com.example.delete.Service.StudentService;
@CrossOrigin
@RestController
public class StudentController {
	@Autowired
	StudentService service;
	@GetMapping("/students")
	public List<Student> getStudent() {
		System.out.println(service.getStudent());
		return service.getStudent();
	}
	@PostMapping("/addstudent")
	public void addStudent(@RequestBody Student student) {
		System.out.println(student);
		service.addStudent(student);
	}
}
