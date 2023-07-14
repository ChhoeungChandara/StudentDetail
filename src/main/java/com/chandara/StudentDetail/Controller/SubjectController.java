package com.chandara.StudentDetail.Controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chandara.StudentDetail.DTO.subjectDTO;
import com.chandara.StudentDetail.Mapper.SubjectMapper;
import com.chandara.StudentDetail.Model.Subject;
import com.chandara.StudentDetail.Service.SubjectService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("subject")
public class SubjectController {
	
	private final SubjectService subjectService;
	
	@PostMapping
	public ResponseEntity<?> savaSubject(@RequestBody subjectDTO subjectDTO){
		Subject subject = SubjectMapper.INSTANCE.dtoTooModel(subjectDTO);
		return ResponseEntity.ok(subjectService.create(subject));
	}
	
	@GetMapping
	public ResponseEntity<?> getAll(){
		return ResponseEntity.ok(subjectService.getAll());
	}
}
