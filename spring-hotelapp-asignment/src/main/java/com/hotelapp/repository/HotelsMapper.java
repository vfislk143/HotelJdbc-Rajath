package com.hotelapp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hotelapp.model.HotelBooking;

public class HotelsMapper implements RowMapper<HotelBooking> {

	@Override
	public HotelBooking mapRow(ResultSet rs, int rowNum) throws SQLException {
		String name=rs.getString(" hotel_Name");
		int id =rs.getInt(" room_Id");
		String city = rs.getString("city");
		double rating = rs.getDouble("rating");
		String  type =rs.getString("type");
		
		HotelBooking hotel = new HotelBooking();
		hotel.setHotelname(name);
		hotel.setCostperday(rating);
		hotel.setRoomid(id);
		hotel.setRoomType(type);
		
		
		return hotel;
	}

	

	

}
