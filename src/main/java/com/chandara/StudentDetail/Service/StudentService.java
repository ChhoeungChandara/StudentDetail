package com.chandara.StudentDetail.Service;

import java.util.List;

import com.chandara.StudentDetail.Model.Student;

public interface StudentService {
	Student create(Student student);
	List<Student> findStudent();
	Student findStudentById(Integer id);
	Student updateStudent(Integer id,Student student);
}
