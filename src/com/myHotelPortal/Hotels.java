package com.myHotelPortal;

import java.io.Serializable;

public class Hotels implements Serializable {
    private String hotelName;
    private String hotelLocation;
    private int totalRooms;
    private int totalSingleRooms;
    private double slRmPrPrNight;
    private int totalDoubleRooms;
    private double dblRmPrNight;
    private int totalPresidentialSuit;
    private double pdrsdtStPrNight;



    public Hotels(){

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

    public double getSlRmPrPrNight() {
        return slRmPrPrNight;
    }

    public void setSlRmPrPrNight(double slRmPrPrNight) {
        this.slRmPrPrNight = slRmPrPrNight;
    }

    public double getDblRmPrNight() {
        return dblRmPrNight;
    }

    public void setDblRmPrNight(double dblRmPrNight) {
        this.dblRmPrNight = dblRmPrNight;
    }

    public double getPdrsdtStPrNight() {
        return pdrsdtStPrNight;
    }

    public void setPdrsdtStPrNight(double pdrsdtStPrNight) {
        this.pdrsdtStPrNight = pdrsdtStPrNight;
    }
}
