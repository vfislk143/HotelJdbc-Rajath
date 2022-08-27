package com.hotelapp.service;

import java.util.List;

import com.hotelapp.exception.BookingIdNotFoundException;
import com.hotelapp.exception.RoomNotAvailableException;
import com.hotelapp.model.HotelBooking;

public interface IHotelService {
	
void addHotel(HotelBooking hotelBooking);
	
	void deleteHotel(int roomId);
	
	void updateHotel(int roomId,double costperday);
	
	List<HotelBooking> getAll();

	List<HotelBooking> getByHotelName(String hotelname) ;

HotelBooking getByRoomId(int roomId);

	List<HotelBooking> getByCostPerDay(double costperday) ;

	List<HotelBooking> getByroomType(String roomType);
}
