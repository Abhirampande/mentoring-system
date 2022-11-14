package com.example.mentorsystembackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MentorRepository  extends JpaRepository<MentorRepository, Long> {
}
