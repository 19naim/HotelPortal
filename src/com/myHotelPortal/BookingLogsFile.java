package com.myHotelPortal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

public abstract class BookingLogsFile extends DataManagement implements Serializable {

    @Override
    public void saveBookingLogsDataInFile(List<BookingLogs> bookingLogs)throws FileNotFoundException {
        ObjectOutputStream objectOutputStream = null;
        FileOutputStream fileOutputStream = null;
        try{
            fileOutputStream = new FileOutputStream("FileHotel.txt", false);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(bookingLogs);
            objectOutputStream.close();

            System.out.println("BookingLogs Data saved");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
