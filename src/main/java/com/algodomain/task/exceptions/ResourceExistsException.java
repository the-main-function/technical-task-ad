package com.algodomain.task.exceptions;

import org.springframework.stereotype.Component;

@Component
public class ResourceExistsException extends RuntimeException {

	public ResourceExistsException() {
		super();
	}

	public ResourceExistsException(String message) {
		super(message);
	}

	
}
