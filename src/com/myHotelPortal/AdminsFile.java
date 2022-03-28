package com.myHotelPortal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

public abstract class AdminsFile extends DataManagement implements Serializable {
    @Override
    public void saveAdminsDataInFile(List<Admins> admins)throws FileNotFoundException {
        ObjectOutputStream objectOutputStream = null;
        FileOutputStream fileOutputStream = null;
        try{
            fileOutputStream = new FileOutputStream("FileHotel.txt", false);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(admins);
            objectOutputStream.close();

            System.out.println("Admins Data saved");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
