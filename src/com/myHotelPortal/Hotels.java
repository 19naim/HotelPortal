package com.myHotelPortal;

public class Hotels {
    private String hotelName;
    private String hotelLocation;
    private int totalRooms;
    private int totalSingleRooms;
    private int totalDoubleRooms;
    private int totalPresidentialSuit;

    public Hotels(String hotelName, String hotelLocation, int totalRooms) {
        this.hotelName = hotelName;
        this.hotelLocation = hotelLocation;
        this.totalRooms = totalRooms;
    }

    public Hotels(String hotelName, String hotelLocation, int totalRooms, int totalSingleRooms, int totalDoubleRooms) {
        this.hotelName = hotelName;
        this.hotelLocation = hotelLocation;
        this.totalRooms = totalRooms;
        this.totalSingleRooms = totalSingleRooms;
        this.totalDoubleRooms = totalDoubleRooms;
    }

    public Hotels(String hotelName, String hotelLocation, int totalRooms, int totalSingleRooms, int totalDoubleRooms, int totalPresidentialSuit) {
        this.hotelName = hotelName;
        this.hotelLocation = hotelLocation;
        this.totalRooms = totalRooms;
        this.totalSingleRooms = totalSingleRooms;
        this.totalDoubleRooms = totalDoubleRooms;
        this.totalPresidentialSuit = totalPresidentialSuit;
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

    public int getTotalRooms() {
        return totalRooms;
    }

    public void setTotalRooms(int totalRooms) {
        this.totalRooms = totalRooms;
    }

    public int getTotalSingleRooms() {
        return totalSingleRooms;
    }

    public void setTotalSingleRooms(int totalSingleRooms) {
        this.totalSingleRooms = totalSingleRooms;
    }

    public int getTotalDoubleRooms() {
        return totalDoubleRooms;
    }

    public void setTotalDoubleRooms(int totalDoubleRooms) {
        this.totalDoubleRooms = totalDoubleRooms;
    }

    public int getTotalPresidentialSuit() {
        return totalPresidentialSuit;
    }

    public void setTotalPresidentialSuit(int totalPresidentialSuit) {
        this.totalPresidentialSuit = totalPresidentialSuit;
    }

}
