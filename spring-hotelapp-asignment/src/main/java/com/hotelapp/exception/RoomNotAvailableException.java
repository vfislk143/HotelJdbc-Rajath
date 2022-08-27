package com.hotelapp.exception;

public class RoomNotAvailableException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RoomNotAvailableException() {
		super();
	}

	public RoomNotAvailableException(String message) {
		super(message);
	}
	
}
