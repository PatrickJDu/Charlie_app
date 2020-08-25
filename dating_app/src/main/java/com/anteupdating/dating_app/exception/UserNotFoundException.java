package com.anteupdating.dating_app.exception;

public class UserNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public UserNotFoundException(Long id) {
		super("User id does not exist: " + id);
	}
}
