package com.capgemini.exception;

public class NoNgoPresentByLocationException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	 public NoNgoPresentByLocationException() {
		super();
	}

	public NoNgoPresentByLocationException(String message) {
		super(message);

}
}
