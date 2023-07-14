package com.chandara.StudentDetail.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.chandara.StudentDetail.DTO.subjectDTO;
import com.chandara.StudentDetail.Model.Subject;

@Mapper
public interface SubjectMapper {
	
	SubjectMapper INSTANCE = Mappers.getMapper(SubjectMapper.class);
	
	@Mapping(source="dto.names",target = "name")
	Subject dtoTooModel(subjectDTO dto);

}
