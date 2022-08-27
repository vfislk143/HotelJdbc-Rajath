package com.hotelapp.repository;

import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.sql.ResultSet;

import com.hotelapp.model.HotelBooking;
import com.hotelapp.util.DBQueries;
@Repository
public class IHotelImplRepository implements  IHotelRepository{

	private JdbcTemplate jdbcTemplate;
	
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public void addHotel(HotelBooking hotelBooking) {
		//String SQL = DBQueries.INSERTQUERY;
		Object[] hotelArray = {
		hotelBooking.getHotelname(),hotelBooking.getCostperday(),hotelBooking.getRoomType()
		
			};
		jdbcTemplate.update(DBQueries.INSERTQUERY,hotelArray);
}
	

	@Override
	public void deleteHotel(int roomid) {
		jdbcTemplate.update(DBQueries.DELETEQUERY,roomid);
	}

	@Override
	public void updateHotel(int roomId, double coastperday) {
		String  sql= DBQueries.UPDATEQUERY;
		jdbcTemplate.update(sql,roomId,coastperday);
	}
	
	
	
	@Override
	public List<HotelBooking> findAll() {
		RowMapper<HotelBooking> mapper=new HotelsMapper();
		List<HotelBooking> hotels=
				jdbcTemplate.query(DBQueries.SELECTQUERY,mapper);
		return hotels;
	}

	@Override
	public List<HotelBooking> findByHotelName(String hotelname)  {
		
			
	
		
		
		return jdbcTemplate.query(DBQueries.SELECTBYNAME,( rs,  rowNum)->{
			HotelBooking hotel= new HotelBooking();
			hotel.setHotelname(rs.getString("hotel_Name"));
			hotel.setRoomid(rs.getInt("room_Id"));
			hotel.setCostperday(rs.getInt("coast_Per_Day"));
			hotel.setRoomType(rs.getString("room_Type"));
			
			return hotel;
		}, hotelname);
		
	}

	@Override
	public HotelBooking findByRoomId(int roomid)   {
		return jdbcTemplate.queryForObject(DBQueries.SELECTBYID,( rs,  rowNum)->{
			HotelBooking hotel= new HotelBooking();
			hotel.setHotelname(rs.getString("hotel_Name"));
			hotel.setRoomid(rs.getInt("room_Id"));
			hotel.setCostperday(rs.getInt("coast_Per_Day"));
			hotel.setRoomType(rs.getString("room_Type"));
			
			return hotel;
		}, roomid);
		
	}

	@Override
	public List<HotelBooking> findByCostPerDay(double coastperday) {
		return jdbcTemplate.query(DBQueries.SELECTBYCOST,( rs,  rowNum)->{
			HotelBooking hotel= new HotelBooking();
			hotel.setHotelname(rs.getString("hotel_Name"));
			hotel.setRoomid(rs.getInt("room_Id"));
			hotel.setCostperday(rs.getInt("coast_Per_Day"));
			hotel.setRoomType(rs.getString("room_Type"));
			
			return hotel;
		}, coastperday);
		
	}

	@Override
	public List<HotelBooking> findByroomType(String roomType)   {
		return jdbcTemplate.query(DBQueries.SELECTBYTYPE,( rs,  rowNum)->{
			HotelBooking hotel= new HotelBooking();
			hotel.setHotelname(rs.getString(" hotel_Name"));
			hotel.setRoomid(rs.getInt("room_Id"));
			hotel.setCostperday(rs.getInt("coast_Per_Day"));
			hotel.setRoomType(rs.getString("room_Type"));
			
			return hotel;
		}, roomType);
		
	}
	



}
