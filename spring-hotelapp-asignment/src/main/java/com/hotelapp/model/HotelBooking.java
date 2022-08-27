package com.hotelapp.model;

public class HotelBooking {
	String hotelName;
	int roomId;
	double costperday;
	String roomType;
	public HotelBooking() {
		super();
	}
	public HotelBooking(String hotelname,  double coastperday, String roomType) {
		super();
		this.hotelName = hotelname;
	
		this.costperday = coastperday;
		this.roomType = roomType;
	}
	public String getHotelname() {
		return hotelName;
	}
	public void setHotelname(String hotelname) {
		this.hotelName = hotelname;
	}
	public int getRoomid() {
		return roomId;
	}
	public void setRoomid(int roomid) {
		this.roomId = roomid;
	}
	public double getCostperday() {
		return costperday;
	}
	public void setCostperday(double costperday) {
		this.costperday = costperday;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	@Override
	public String toString() {
		return "HotelBooking [hotelname=" + hotelName + ", roomid=" + roomId + ", costperday=" + costperday
				+ ", roomType=" + roomType + "]";
	}
	
}