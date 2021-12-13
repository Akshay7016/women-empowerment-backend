package com.capgemini.exception;


public class NGONotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public NGONotFoundException()
	{}
    
	public NGONotFoundException(String msg)
	{
	  super(msg);	
	}
}
