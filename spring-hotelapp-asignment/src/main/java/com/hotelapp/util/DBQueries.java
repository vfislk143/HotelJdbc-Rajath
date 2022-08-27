package com.hotelapp.util;

public class DBQueries {

	public static final String INSERTQUERY = "INSERT INTO HOTELBOOKING(hotel_Name,coast_Per_Day,room_Type)values(?,?,?)";
	public static final String UPDATEQUERY = "UPDATE HOTELBOOKING SET coast_Per_Day=? WHERE room_Id=?";
	public static final String DELETEQUERY = "DELETE FROM HOTELBOOKING  WHERE room_Id=?";

	public static final String SELECTQUERY = "SELECT * FROM HOTELBOOKING";
	public static final String SELECTBYTYPE = "SELECT * FROM HOTELBOOKING WHERE room_Type=?";
	public static final String SELECTBYNAME = "SELECT * FROM HOTELBOOKING WHERE hotel_Name=?";
	public static final String SELECTBYID = "SELECT * FROM HOTELBOOKING WHERE room_Id=?";
	public static final String SELECTBYCOST = "SELECT * FROM HOTELBOOKING WHERE coast_Per_Day=?";
}


