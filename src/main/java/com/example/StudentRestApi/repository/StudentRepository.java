package com.example.StudentRestApi.repository;

import com.example.StudentRestApi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student, Integer> {
}
