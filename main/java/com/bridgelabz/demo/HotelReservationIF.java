package com.bridgelabz.demo;
import java.util.ArrayList;
public interface HotelReservationIF {
    public void addHotel(String hotelName, int rating, double regularCustomerRate, int i);
    public int getHotelListSize();
    public void printHotelList();
    public ArrayList<Hotel> getHotelList();
}

