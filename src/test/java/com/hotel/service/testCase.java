package com.hotel.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class testCase {

    @Autowired
    private HotelService hotelService;

    @Test
    void testHotel(){
        System.out.println(hotelService.getById(2));
    }
}
