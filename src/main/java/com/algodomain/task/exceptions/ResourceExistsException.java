package com.algodomain.task.exceptions;

import org.springframework.stereotype.Component;

@Component
public class ResourceExistsException extends RuntimeException {

	String resourceName;
	String fieldName;
	long fieldValue;
	
	public ResourceExistsException() {
		super();
	}

	public ResourceExistsException(String resourceName, String fieldName, long fieldValue) {
		super(resourceName + " " + "already exists with " + fieldName + " : " + fieldValue );
	}

	
}
