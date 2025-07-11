package com.sathya.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sathya.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
