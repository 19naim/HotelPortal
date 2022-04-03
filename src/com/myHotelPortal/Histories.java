package com.myHotelPortal;

import java.io.Serializable;

public class Histories implements Serializable {
    private String customerName;
    private String customerEmail;
    private String hotelName;
    private String hotelLocation;
    private int noOfSingleRoom;
    private int noOfDoubleRoom;
    private int noOfPresidentialSuit;
    private double totalCost;

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

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelLocation() {
        return hotelLocation;
    }

    public void setHotelLocation(String hotelLocation) {
        this.hotelLocation = hotelLocation;
    }

    public int getNoOfSingleRoom() {
        return noOfSingleRoom;
    }

    public void setNoOfSingleRoom(int noOfSingleRoom) {
        this.noOfSingleRoom = noOfSingleRoom;
    }

    public int getNoOfDoubleRoom() {
        return noOfDoubleRoom;
    }

    public void setNoOfDoubleRoom(int noOfDoubleRoom) {
        this.noOfDoubleRoom = noOfDoubleRoom;
    }

    public int getNoOfPresidentialSuit() {
        return noOfPresidentialSuit;
    }

    public void setNoOfPresidentialSuit(int noOfPresidentialSuit) {
        this.noOfPresidentialSuit = noOfPresidentialSuit;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}
