package com.hotelapp;

import com.hotelapp.constant.AppConstant;
import com.hotelapp.payload.Order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class HotelappApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelappApplication.class, args);

	}
		@KafkaListener(topics = AppConstant.TOPIC,groupId = "group_customer_order")
		public void kafkaSuscriberContent(String order){
			System.out.println("---------------------------Msg fetched from Kafka---------------------------");
			System.out.println(order);
		}
	}


