package com.example.mentorsystembackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.mentorsystembackend.model.student;
@Repository
public interface StudentRepository extends JpaRepository <student, Long>{
}
