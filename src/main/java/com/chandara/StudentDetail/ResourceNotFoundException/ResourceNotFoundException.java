package com.chandara.StudentDetail.ResourceNotFoundException;

import org.springframework.http.HttpStatus;

public class ResourceNotFoundException extends ApiException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(String ResourceName,Integer id) {
		super(HttpStatus.NOT_FOUND,String.format("%s = %d not found",ResourceName,id));
	}

}
