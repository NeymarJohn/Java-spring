package com.piggymetrics.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ErrorHandler {

	private final static Logger log = LoggerFactory.getLogger(ErrorHandler.class);

	// TODO add MethodArgumentNotValidException handler
	// TODO remove such general handler
	@ExceptionHandler(IllegalArgumentException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public void processValidationError(IllegalArgumentException e) {
		log.debug("Returning HTTP 400 Bad Request", e);
	}
}
