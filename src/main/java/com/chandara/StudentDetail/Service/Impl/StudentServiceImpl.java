package com.chandara.StudentDetail.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chandara.StudentDetail.Model.Student;
import com.chandara.StudentDetail.Repository.StudentRepository;
import com.chandara.StudentDetail.ResourceNotFoundException.ResourceNotFoundException;
import com.chandara.StudentDetail.Service.StudentService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{
	private final StudentRepository studentRepository;

	@Override
	public Student create(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student> findStudent() {
		   List<Student> list = studentRepository.findAll();
		return list;
	}

	@Override
	public Student findStudentById(Integer id) {
		return studentRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("id",id));
	}

	@Override
	public Student updateStudent(Integer id, Student student) {
		Student students = findStudentById(id);
		students.setName(student.getName());
		students.setGender(student.getGender());
		students.setGrade(student.getGrade());
		students.setClassName(student.getClassName());
		return studentRepository.save(students);
	}

	@Override
	public void delete(Integer id) {
		Student studentId = findStudentById(id);
		studentRepository.delete(studentId);
	}
	
}
