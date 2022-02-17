package com.myHotelPortal;

public class Customers {
    private String customerName;
    private String customerAddress;
    private String customerEmail;
    private double customerPhone;
    private String bookingStatus;

    private int custTotalRooms;
    private int custTotalSingleRooms;
    private int custTotalDoubleRooms;
    private int custTotalPresidentialSuit;


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public double getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(double customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public int getCustTotalRooms() {
        return custTotalRooms;
    }

    public void setCustTotalRooms(int custTotalRooms) {
        this.custTotalRooms = custTotalRooms;
    }

    public int getCustTotalSingleRooms() {
        return custTotalSingleRooms;
    }

    public void setCustTotalSingleRooms(int custTotalSingleRooms) {
        this.custTotalSingleRooms = custTotalSingleRooms;
    }

    public int getCustTotalDoubleRooms() {
        return custTotalDoubleRooms;
    }

    public void setCustTotalDoubleRooms(int custTotalDoubleRooms) {
        this.custTotalDoubleRooms = custTotalDoubleRooms;
    }

    public int getCustTotalPresidentialSuit() {
        return custTotalPresidentialSuit;
    }

    public void setCustTotalPresidentialSuit(int custTotalPresidentialSuit) {
        this.custTotalPresidentialSuit = custTotalPresidentialSuit;
    }
}
