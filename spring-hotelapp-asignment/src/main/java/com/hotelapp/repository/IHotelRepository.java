package com.hotelapp.repository;

import java.util.List;

import com.hotelapp.exception.BookingIdNotFoundException;
import com.hotelapp.exception.RoomNotAvailableException;
import com.hotelapp.model.HotelBooking;



public interface IHotelRepository {
	
	void addHotel(HotelBooking hotelBooking);
	
	void deleteHotel(int roomid);
	
	void updateHotel(int roomId,double costperday);

	List<HotelBooking> findAll();

	List<HotelBooking> findByHotelName(String hotelname);

	HotelBooking findByRoomId(int roomId) ;

	List<HotelBooking> findByCostPerDay(double costperday) ;

	List<HotelBooking> findByroomType(String roomType);



	
}
