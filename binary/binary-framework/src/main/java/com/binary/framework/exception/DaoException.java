package com.binary.framework.exception;


public class DaoException extends FrameworkException {
	private static final long serialVersionUID = 1L;

	public DaoException() {
		super();
	}
	
	public DaoException(String message) {
		super(message);
	}
	
	public DaoException(Throwable cause) {
		super(cause);
	}
	
	public DaoException(String message, Throwable cause) {
		super(message, cause);
	}
	
	
}


