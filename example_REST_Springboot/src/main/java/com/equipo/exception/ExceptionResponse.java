package com.equipo.exception;

import java.util.Date;

public class ExceptionResponse {
	
	private Date exceptionDate;
	private String exceptionMessage;
	private String exceptionDescription;
	
	
	
	public ExceptionResponse(Date exceptionDate, String exceptionMessage, String exceptionDescription) {
		super();
		this.exceptionDate = exceptionDate;
		this.exceptionMessage = exceptionMessage;
		this.exceptionDescription = exceptionDescription;
	}
	
	
	

}
