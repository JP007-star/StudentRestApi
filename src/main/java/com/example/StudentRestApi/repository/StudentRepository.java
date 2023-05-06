package com.example.StudentRestApi.repository;
import com.example.StudentRestApi.entity.Student;   /// --> user defined packages
import org.springframework.data.jpa.repository.JpaRepository;   /// --> build in package or other party package

public interface StudentRepository extends JpaRepository <Student, Integer> {
}
