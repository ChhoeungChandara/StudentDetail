package com.chandara.StudentDetail.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chandara.StudentDetail.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
