package com.capgemini.exception;


public class NoSuchNgoException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	 public NoSuchNgoException() {
		super();
	}

	public NoSuchNgoException(String message) {
		super(message);

}
}