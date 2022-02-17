package com.myHotelPortal;

public class Customers {
    private String customerName;
    private String customerAddress;
    private String customerEmail;
    private long customerPhone;
    private boolean bookingStatus;
    private double customerId;

    private int custTotalRooms;
    private int custTotalSingleRooms;
    private int custTotalDoubleRooms;
    private int custTotalPresidentialSuit;

    public Customers(String customerName, String customerAddress, String customerEmail, long customerPhone, boolean bookingStatus, double customerId) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.bookingStatus = bookingStatus;
        this.customerId = customerId;
    }

    public Customers(String customerName, String customerAddress, String customerEmail, long customerPhone, boolean bookingStatus, int custTotalRooms, int custTotalSingleRooms) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.bookingStatus = bookingStatus;
        this.custTotalRooms = custTotalRooms;
        this.custTotalSingleRooms = custTotalSingleRooms;
    }



    public Customers(String customerName, String customerAddress, String customerEmail, long customerPhone, boolean bookingStatus, int custTotalRooms, int custTotalSingleRooms, int custTotalDoubleRooms, int custTotalPresidentialSuit) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.bookingStatus = bookingStatus;
        this.custTotalRooms = custTotalRooms;
        this.custTotalSingleRooms = custTotalSingleRooms;
        this.custTotalDoubleRooms = custTotalDoubleRooms;
        this.custTotalPresidentialSuit = custTotalPresidentialSuit;
    }

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

    public void setCustomerPhone(long customerPhone) {
        this.customerPhone = customerPhone;
    }

    public boolean getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(boolean bookingStatus) {
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
