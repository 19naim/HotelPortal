package com.myHotelPortal;

import java.io.Serializable;

public class Histories implements Serializable {
    private String customerName;
    private String customerEmail;
    private String hotelName;
    private String hotelLocation;
    private String noOfSingleRoom;
    private String noOfDoubleRoom;
    private String noOfPresidentialSuit;
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

    public String getNoOfSingleRoom() {
        return noOfSingleRoom;
    }

    public void setNoOfSingleRoom(String noOfSingleRoom) {
        this.noOfSingleRoom = noOfSingleRoom;
    }

    public String getNoOfDoubleRoom() {
        return noOfDoubleRoom;
    }

    public void setNoOfDoubleRoom(String noOfDoubleRoom) {
        this.noOfDoubleRoom = noOfDoubleRoom;
    }

    public String getNoOfPresidentialSuit() {
        return noOfPresidentialSuit;
    }

    public void setNoOfPresidentialSuit(String noOfPresidentialSuit) {
        this.noOfPresidentialSuit = noOfPresidentialSuit;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}
