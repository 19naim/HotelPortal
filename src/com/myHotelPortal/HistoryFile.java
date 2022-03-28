package com.myHotelPortal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

public abstract class HistoryFile extends DataManagement implements Serializable {
    @Override
    public void saveHistoriesDataInFile(List<Histories> hotels)throws FileNotFoundException {
        ObjectOutputStream objectOutputStream = null;
        FileOutputStream fileOutputStream = null;
        try{
            fileOutputStream = new FileOutputStream("FileHotel.txt", false);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(hotels);
            objectOutputStream.close();

            System.out.println("Histories Data saved");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
