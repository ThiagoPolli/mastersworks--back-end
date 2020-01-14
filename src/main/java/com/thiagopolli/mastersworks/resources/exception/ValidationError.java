package com.thiagopolli.mastersworks.resources.exception;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {

	
	private static final long serialVersionUID = 1L;

	
	private List<FildMessage> errors = new ArrayList<>();
	
	public ValidationError(Integer status, String msg, Long timeStamp) {
		super(status, msg, timeStamp);
		
	}

	public List<FildMessage> getErrors() {
		return errors;
	}

	public void addError(String filedName, String messagem) {
		errors.add(new FildMessage(filedName, messagem));
	}

}