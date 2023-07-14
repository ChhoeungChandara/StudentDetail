package com.chandara.StudentDetail.Service.Impl;
import java.util.List;
import org.springframework.stereotype.Service;
import com.chandara.StudentDetail.Model.Subject;
import com.chandara.StudentDetail.Repository.SubjectRepository;
import com.chandara.StudentDetail.Service.SubjectService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class SubjectServiceImpl implements SubjectService{
	private final SubjectRepository subjectRepository;

	@Override
	public Subject create(Subject subject) {
		return subjectRepository.save(subject);
	}

	@Override
	public List<Subject> getAll( ) {
		return subjectRepository.findAll();
	}

}
