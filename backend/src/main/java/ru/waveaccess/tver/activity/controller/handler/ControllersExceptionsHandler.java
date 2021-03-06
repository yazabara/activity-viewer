package ru.waveaccess.tver.activity.controller.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ru.waveaccess.tver.activity.exception.ActivityUserDataException;
import ru.waveaccess.tver.activity.exception.GroupDataException;
import ru.waveaccess.tver.activity.exception.InterestDataException;

@ControllerAdvice
public class ControllersExceptionsHandler {

	@ExceptionHandler(ActivityUserDataException.class)
	public ResponseEntity handleUserExceptions(ActivityUserDataException ex) {
		return ResponseEntity.badRequest().body("Work with user throw exception with message: " + ex.getLocalizedMessage());
	}

	@ExceptionHandler(GroupDataException.class)
	public ResponseEntity handleGroupExceptions(GroupDataException ex) {
		return ResponseEntity.badRequest().body("Work with user throw exception with message: " + ex.getLocalizedMessage());
	}

	@ExceptionHandler(InterestDataException.class)
	public ResponseEntity handleInterestExceptions(InterestDataException ex) {
		return ResponseEntity.badRequest().body("Work with interest throw exception with message: " + ex.getLocalizedMessage());
	}
}
