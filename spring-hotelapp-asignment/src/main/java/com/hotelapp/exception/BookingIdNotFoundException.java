package com.hotelapp.exception;

public class BookingIdNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BookingIdNotFoundException() {
		super();
	}

	public BookingIdNotFoundException(String message) {
		super(message);
	}
	
}
