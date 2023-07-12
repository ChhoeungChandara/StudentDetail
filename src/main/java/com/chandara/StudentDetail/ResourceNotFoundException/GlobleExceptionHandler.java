package com.chandara.StudentDetail.ResourceNotFoundException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobleExceptionHandler {
	@ExceptionHandler(ApiException.class)
	public  ResponseEntity<?> handlerExecption(ApiException e){
		ErrorRespone respone = new ErrorRespone(e.getHttpStatus(),e.getMessage());
		return ResponseEntity.status(e.getHttpStatus()).body(respone.getMessage());
		
	}
	
}
