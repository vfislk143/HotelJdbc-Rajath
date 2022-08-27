package com.hotelapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelapp.model.HotelBooking;
import com.hotelapp.repository.IHotelImplRepository;

@Service
public class IHotelServiceImpl implements IHotelService{
	@Autowired
	IHotelImplRepository ihotelrepository;
	
	
	public void setIhotelrepository(IHotelImplRepository ihotelrepository) {
		this.ihotelrepository = ihotelrepository;
	}

	@Override
	public void addHotel(HotelBooking hotelBooking) {
		ihotelrepository.addHotel(hotelBooking);
		
	}

	@Override
	public void deleteHotel(int roomId) {
		ihotelrepository.deleteHotel(roomId);
	}

	@Override
	public void updateHotel(int roomId, double costperday) {
		ihotelrepository.updateHotel(roomId, costperday);
	}

	@Override
	public List<HotelBooking> getAll() {
		return ihotelrepository.findAll();
	}

	@Override
	public List<HotelBooking> getByHotelName(String hotelname) {
		return ihotelrepository.findByHotelName(hotelname);
	}

	@Override
	public HotelBooking getByRoomId(int roomId) {
		return ihotelrepository.findByRoomId(roomId);
	}

	@Override
	public List<HotelBooking> getByCostPerDay(double costperday) {
		return ihotelrepository.findByCostPerDay(costperday);
	}

	@Override
	public List<HotelBooking> getByroomType(String roomType) {
		return ihotelrepository.findByroomType(roomType);
	}

	

}
