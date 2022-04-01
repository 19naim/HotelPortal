package com.myHotelPortal;

import java.io.Serializable;

public class BookingLogs implements Serializable {
    private String hotelName;
    private String location;
    private String customerName;
    private String customerEmail;
    private int numberOfSingleRoom;
    private int numberOfDoubleRoom;
    private int numberOfPrcdntSuit;
    private double totalCost;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getNumberOfSingleRoom() {
        return numberOfSingleRoom;
    }

    public void setNumberOfSingleRoom(int numberOfSingleRoom) {
        this.numberOfSingleRoom = numberOfSingleRoom;
    }

    public int getNumberOfDoubleRoom() {
        return numberOfDoubleRoom;
    }

    public void setNumberOfDoubleRoom(int numberOfDoubleRoom) {
        this.numberOfDoubleRoom = numberOfDoubleRoom;
    }

    public int getNumberOfPrcdntSuit() {
        return numberOfPrcdntSuit;
    }

    public void setNumberOfPrcdntSuit(int numberOfPrcdntSuit) {
        this.numberOfPrcdntSuit = numberOfPrcdntSuit;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}




