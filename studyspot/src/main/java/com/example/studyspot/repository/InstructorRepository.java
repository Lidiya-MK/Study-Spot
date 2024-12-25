package com.example.studyspot.repository;

import com.example.studyspot.model.Instructor;
import com.example.studyspot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InstructorRepository extends JpaRepository<Student, Integer> {
    Optional<Student> findByEmail(String email);

    Instructor save(Instructor instructor);
}
