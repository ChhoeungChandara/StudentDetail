package com.chandara.StudentDetail.Service;

import java.util.List;

import com.chandara.StudentDetail.Model.Subject;

public interface SubjectService {
	Subject create(Subject subject);
	List<Subject> getAll();

}
