package com.chandara.StudentDetail.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chandara.StudentDetail.Model.Student;
import com.chandara.StudentDetail.Service.StudentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("students")
public class StudentController {
	private final StudentService studentService;
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Student student){
		return ResponseEntity.ok(studentService.create(student));
	}
	
	@GetMapping
	public ResponseEntity<?> getAll(){
		return ResponseEntity.ok(studentService.findStudent());
	}
	
	@GetMapping("{id}")
	public ResponseEntity<?> getById(@PathVariable Integer id){
		return ResponseEntity.ok(studentService.findStudentById(id));
	}
	@PutMapping("{id}")
	public ResponseEntity<?> UpdateStudent(@PathVariable Integer id,@RequestBody Student student){
		return ResponseEntity.ok(studentService.updateStudent(id, student));
	}
	

}
