package com.algodomain.task.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.algodomain.task.utils.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> resourceNotFoundExceptionHandler(ResourceNotFoundException ex){
		String message = ex.getMessage();
		return new ResponseEntity<ApiResponse>(new ApiResponse(message,false),HttpStatus.NOT_FOUND);	
	}
	
	
	@ExceptionHandler(ResourceExistsException.class)
	public ResponseEntity<ApiResponse> resourceExistExceptionHandler(ResourceExistsException ex){
		String message = ex.getMessage();
		return new ResponseEntity<ApiResponse>(new ApiResponse(message,false),HttpStatus.BAD_REQUEST);
	}
}
