package com.myHotelPortal;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class DataManagement{
    public abstract void saveHotelsDataInFile(List<Hotels> hotels) throws FileNotFoundException;
    public abstract void saveCustomersDataInFile(List<Customers> customers) throws FileNotFoundException;
   /* public abstract void saveAdminsDataInFile(List<Admins> admins) throws FileNotFoundException;
    public abstract void saveBookingLogsDataInFile(List<BookingLogs> bookingLogs) throws FileNotFoundException;
    public abstract void saveHistoriesDataInFile(List<Histories> histories) throws FileNotFoundException;*/


    //

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



    public List<Customers> rtvCustomersData(String fileName){
        ObjectInputStream objectinputstream = null;
        List<Customers> customers = null;
        File file = new File(fileName);
        if(file.exists()){
            try {
                FileInputStream streamIn = new FileInputStream(fileName);
                objectinputstream = new ObjectInputStream(streamIn);
                customers = (List<Customers>) objectinputstream.readObject();
                objectinputstream .close();
                System.out.println("Data extracted from Customer file...");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            customers = new ArrayList<>();
        }
        return customers;
    }


    public List<Admins> rtvAdminsData(String fileName){
        ObjectInputStream objectinputstream = null;
        List<Admins> admins = null;
        File file = new File(fileName);
        if(file.exists()){
            try {
                FileInputStream streamIn = new FileInputStream(fileName);
                objectinputstream = new ObjectInputStream(streamIn);
                admins = (List<Admins>) objectinputstream.readObject();
                objectinputstream .close();
                System.out.println("Data extracted from Hotel file...");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            admins = new ArrayList<>();
        }
        return admins;
    }



    public List<BookingLogs> rtvBookingLogsData(String fileName){
        ObjectInputStream objectinputstream = null;
        List<BookingLogs> bookingLogs = null;
        File file = new File(fileName);
        if(file.exists()){
            try {
                FileInputStream streamIn = new FileInputStream(fileName);
                objectinputstream = new ObjectInputStream(streamIn);
                bookingLogs = (List<BookingLogs>) objectinputstream.readObject();
                objectinputstream .close();
                System.out.println("Data extracted from Hotel file...");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            bookingLogs = new ArrayList<>();
        }
        return bookingLogs;
    }


    public List<Histories> rtvHistoriesData(String fileName){
        ObjectInputStream objectinputstream = null;
        List<Histories> histories = null;
        File file = new File(fileName);
        if(file.exists()){
            try {
                FileInputStream streamIn = new FileInputStream(fileName);
                objectinputstream = new ObjectInputStream(streamIn);
                histories = (List<Histories>) objectinputstream.readObject();
                objectinputstream .close();
                System.out.println("Data extracted from Hotel file...");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            histories = new ArrayList<>();
        }
        return histories;
    }

}
