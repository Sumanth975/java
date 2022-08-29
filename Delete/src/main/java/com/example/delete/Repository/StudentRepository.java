package com.example.delete.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.delete.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

}
