package com.hotelapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hotelapp.model.HotelBooking;
import com.hotelapp.service.IHotelService;

@SpringBootApplication
public class SpringHotelappAsignmentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringHotelappAsignmentApplication.class, args);
	}
	@Autowired
	IHotelService hotelService;

	@Override
	public void run(String... args) throws Exception {
		//hotelService.addHotel(new HotelBooking("Prince", 14999, "laxury"));
		//hotelService.updateHotel(9999,1 );
		//hotelService.deleteHotel(4);
		
		//hotelService.getByCostPerDay(9999).forEach(System.out::println);
		//hotelService.getAll().forEach(System.out::println);
		//hotelService.getByHotelName("Taj").forEach(System.out::println);
		System.out.println(hotelService.getByRoomId(1));
		//hotelService.getByroomType("single").forEach(System.out::println);
	}

}
