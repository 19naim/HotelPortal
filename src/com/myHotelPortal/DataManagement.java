package com.myHotelPortal;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class DataManagement implements Serializable {
    public abstract void saveHotelsDataInFile(List<Hotels> hotels) throws FileNotFoundException;
    public abstract void saveCustomersDataFile(List<Customers> customers) throws FileNotFoundException;
    public abstract void saveAdminsDataFile(List<Admins> admins) throws FileNotFoundException;
    public abstract void saveBookingLogsDataFile(List<BookingLogs> bookingLogs) throws FileNotFoundException;
    public abstract void saveHistoriesDataFile(List<Histories> histories) throws FileNotFoundException;



    public List<Hotels> rtvHotelData(String fileName){
        ObjectInputStream objectinputstream = null;
        List<Hotels> hotels = null;
        File file = new File(fileName);
        if(file.exists()){
            try {
                FileInputStream streamIn = new FileInputStream(fileName);
                objectinputstream = new ObjectInputStream(streamIn);
                hotels = (List<Hotels>) objectinputstream.readObject();
                objectinputstream .close();
                System.out.println("Data extracted from Hotel file...");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            hotels = new ArrayList<>();
        }
        return hotels;
    }



}
