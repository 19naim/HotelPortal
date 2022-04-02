package com.myHotelPortal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

public class FileManagement extends DataManagement{
    //function for saving hotel data
    @Override
    public void saveHotelsDataInFile(List<Hotels> hotels)throws FileNotFoundException {
        ObjectOutputStream objectOutputStream = null;
        FileOutputStream fileOutputStream = null;
        try{
            fileOutputStream = new FileOutputStream("Hotels.txt", false);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(hotels);
            objectOutputStream.close();

            System.out.println("Hotels Data saved....");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
//function for saving customer data
    @Override
    public void saveCustomersDataInFile(List<Customers> customers) throws FileNotFoundException {

        ObjectOutputStream objectOutputStream = null;
        FileOutputStream fileOutputStream = null;
        try{
            fileOutputStream = new FileOutputStream("Customers.txt", false);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(customers);
            objectOutputStream.close();

            System.out.println("Customer Data saved.....");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }



    //function for saving bookingLog data
    @Override
    public void saveBookingLogsDataInFile(List<BookingLogs> bookingLogs) throws FileNotFoundException {

        ObjectOutputStream objectOutputStream = null;
        FileOutputStream fileOutputStream = null;
        try{
            fileOutputStream = new FileOutputStream("BookingLogs.txt", false);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(bookingLogs);
            objectOutputStream.close();

            System.out.println("BookingLogs Data saved");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
     //function for saving admin data
     /*
     @Override
    public void saveAdminsDataInFile(List<Admins> admins) throws FileNotFoundException {
        ObjectOutputStream objectOutputStream = null;
        FileOutputStream fileOutputStream = null;
        try{
            fileOutputStream = new FileOutputStream("Admins.txt", false);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(admins);
            objectOutputStream.close();

            System.out.println("Admins Data saved");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    }*/
    //function for saving history data
    @Override
    public void saveHistoriesDataInFile(List<Histories> histories) throws FileNotFoundException {
        ObjectOutputStream objectOutputStream = null;
        FileOutputStream fileOutputStream = null;
        try{
            fileOutputStream = new FileOutputStream("Histories.txt", false);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(histories);
            objectOutputStream.close();

            System.out.println("Histories Data saved");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
