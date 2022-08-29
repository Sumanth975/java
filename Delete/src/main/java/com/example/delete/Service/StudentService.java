package com.example.delete.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.delete.Entity.Student;
import com.example.delete.Repository.StudentRepository;



@Service
public class StudentService {
	@Autowired
	StudentRepository repo;
	public void addStudent(Student student) {
		repo.save(student);
	}
	public List<Student> getStudent(){
		return repo.findAll();
	}

}
