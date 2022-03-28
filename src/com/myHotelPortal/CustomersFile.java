package com.myHotelPortal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

public abstract class CustomersFile extends DataManagement implements Serializable {
    @Override
    public void saveCustomersDataInFile(List<Customers> customers)throws FileNotFoundException {
        ObjectOutputStream objectOutputStream = null;
        FileOutputStream fileOutputStream = null;
        try{
            fileOutputStream = new FileOutputStream("FileHotel.txt", false);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(customers);
            objectOutputStream.close();

            System.out.println("Hotel Data saved");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
