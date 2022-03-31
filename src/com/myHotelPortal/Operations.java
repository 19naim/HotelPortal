package com.myHotelPortal;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operations implements Functions{

    public List<Admins> admin = new ArrayList<Admins>();
    public List<Hotels> hotelList = new ArrayList<Hotels>();
    public List<Customers> customersList = new ArrayList<Customers>();
    public List<BookingLogs> bookingLog = new ArrayList<BookingLogs>();
    public List<Histories> history = new ArrayList<Histories>();






    // Show menu functions
    @Override
    public void showMenu() {
        Scanner input = new Scanner(System.in);
        int localInput = 0;
        boolean isInteger = true;

        while (true) {
            System.out.println("Welcome to the Outstanding Hotel Portal !!!" +
                    "\n1. Press 1 if you are a Customer." +
                    "\n2. Press 2 if you are a admin." +
                    "\n3. Press 3 to exit.");
            // input validation

            localInput = input.nextInt();


            if (localInput == 1) {
                customerMenu();
            } else if (localInput == 2) {
                adminMenu();

            } else if (localInput == 3) {
                System.out.println("welcome Back Again!!!");
                System.exit(0);

            } else {
                System.out.println("Input type mismatch, please insert an integer...");
                isInteger = false;
                input.next();
            }


        }
    }

    // Admin menu
    private void adminMenu() {
        FileManagement fm = new FileManagement();
        //loading data from file
        hotelList = fm.rtvHotelData("Hotels.txt");
        customersList = fm.rtvCustomersData("Customers.txt");
        Scanner adminInput = new Scanner(System.in);
        int localInput = 0;
        //boolean isInteger = true;

        while (localInput != 10) {
            System.out.println("!!!Welcome to the Admin panel!!!");
            System.out.println(
                    "Please select from the following menu" +

                            "\n1. Press 1 to see available hotels. " +
                            "\n2. press 2 to insert new hotel." +
                            "\n3. Press 3 to check available booking." +
                            "\n4. Press 4 to update booking." +                 // Edit booking or delete booking
                            "\n5. Press 5 to check registered customers" +
                            "\n6. Press 6 to delete one customer" +
                            "\n7. Press 7 to delete all the customers" +
                            "\n8. Press 5 to delete a hotel." +
                            "\n9. Press 6 to delete all hotels" +
                            "\n10. Press 10 to exit."
            );
            localInput = adminInput.nextInt();


            // display available hotels
            if (localInput == 1) {
                System.out.println("All the hotel listed below");
                for (int i = 0; i < hotelList.size(); i++) {
                    System.out.println("Hotel Name:" + hotelList.get(i).getHotelName());
                    System.out.println("Place:" + hotelList.get(i).getHotelLocation());
                    System.out.println("Total Number of rooms:" + hotelList.get(i).getTotalRooms());
                    System.out.println("Available single Rooms:" + hotelList.get(i).getTotalSingleRooms());
                    System.out.println("Available double rooms:" + hotelList.get(i).getTotalDoubleRooms());
                    System.out.println("Available Presidential suit:" + hotelList.get(i).getTotalPresidentialSuit());
                }
            }

            //insert new hotels to the portal
            else if (localInput == 2) {
                Hotels ht = new Hotels();
                String hotelName;
                String place;
                int totalRoom;
                int singleRoom;
                int doubleRoom;
                int pdsSuit;



                System.out.println("Enter the name of the Hotel.");
                hotelName = adminInput.nextLine();
                ht.setHotelName(hotelName);

                System.out.println("Enter Place of the hotel");
                place = adminInput.nextLine();
                ht.setHotelLocation(place);

                System.out.println("Enter total number of rooms.");
                totalRoom = adminInput.nextInt();
                ht.setTotalRooms(totalRoom);

                System.out.println("Enter total number of single rooms.");
                singleRoom = adminInput.nextInt();
                ht.setTotalSingleRooms(singleRoom);

                System.out.println("Enter total number of double rooms.");
                doubleRoom = adminInput.nextInt();
                ht.setTotalDoubleRooms(doubleRoom);

                System.out.println("Enter total number of Presidential Suit.");
                pdsSuit = adminInput.nextInt();
                ht.setTotalPresidentialSuit(pdsSuit);

                //Hotels ht = new Hotels(hotelName, place, totalRoom,singleRoom, doubleRoom, pdsSuit);


                hotelList.add(ht);


                //saving in the file

                try{
                    fm.saveHotelsDataInFile(hotelList);
                }catch (FileNotFoundException e){
                    e.printStackTrace();
                }

            }
            // Check Available Bookings
            else if (localInput == 3) {

            } else if (localInput == 4) {

            } else if (localInput == 5) {
                System.out.println("All the registered customers are listed below:");
                for (int i = 0; i < customersList.size(); i++) {
                    System.out.println("Name:" +customersList.get(i).getCustomerName());
                    System.out.println("Address:" +customersList.get(i).getCustomerAddress());
                    System.out.println("Email:" +customersList.get(i).getCustomerEmail());
                    System.out.println("Phone:" +customersList.get(i).getCustomerPhone());
                    System.out.println("Id:" +customersList.get(i).getCustomerId());
                }

            } else if (localInput == 6) {

            } else if (localInput == 7) {

            } else {
                System.out.println("Input type mismatch, please insert an integer...");


            }

        }
    }

    // Customer Menu
    private void customerMenu() {
        //loading data from file
        FileManagement fm = new FileManagement();
        hotelList = fm.rtvHotelData("Hotels.txt");
        customersList = fm.rtvCustomersData("Customers.txt");
        Scanner input = new Scanner(System.in);

        int localInput = 0;

        while(localInput != 6) {
            System.out.println("!!!Welcome to the Customer panel!!!");
            System.out.println(
                    "Please select from the following menu" +

                            "\n1. Press 1 to see available hotels. " +
                            "\n2. press 2 to book a hotel room." +
                            "\n3. Press 3 to check your booking." +
                            "\n4. Press 4 to update your booking." +
                            "\n5. Press 5 to cancel your booking." +
                            "\n6. Press 6 to exit."
            );


            localInput = input.nextInt();


            if (localInput == 1) {
                System.out.println("All the hotel listed below");
                for (int i = 0; i < hotelList.size(); i++) {
                    System.out.println("Hotel Name:" + hotelList.get(i).getHotelName());
                    System.out.println("Place:" + hotelList.get(i).getHotelLocation());
                    System.out.println("Total Number of rooms:" + hotelList.get(i).getTotalRooms());
                    System.out.println("Available single Rooms:" + hotelList.get(i).getTotalSingleRooms());
                    System.out.println("Available double rooms:" + hotelList.get(i).getTotalDoubleRooms());
                    System.out.println("Available Presidential suit:" + hotelList.get(i).getTotalPresidentialSuit());
                }

            } else if (localInput == 2) {
                Scanner in = new Scanner(System.in);
                int optInput = 0;

                System.out.println("1. Press 1 if you are new to the Hotel Portal" +
                        "\n2. Press 2 if you already have an account");
                    optInput = in.nextInt();
                    if(optInput == 1){
                        addCustomer();
                    }else if(optInput == 2){
                        String name;
                        String address;
                        String email;
                        long phone;
                        long id;
                        System.out.println("Enter email:");
                        email = in.nextLine();
                        for (int i = 0; i < customersList.size(); i++) {
                            if (customersList.get(i).getCustomerEmail().equals(email)){
                                name = customersList.get(i).getCustomerName();
                                address = customersList.get(i).getCustomerAddress();
                                phone = customersList.get(i).getCustomerPhone();
                                id = customersList.get(i).getCustomerId();

                                //booking hotel
                                bookRoom();

                            }else {
                                System.out.println("Wrong email address !!! Try again ....");
                            }

                        }

                    }


            } else if (localInput == 3) {

            } else if (localInput == 4) {

            } else if (localInput == 5) {

            } else if (localInput == 6) {

            } else {

            }

        }
    }




    private void addCustomer() {
        FileManagement fm = new FileManagement();
        Scanner custInput = new Scanner(System.in);
        Customers cust = new Customers();

        String name;
        String address;
        String email;
        long phone;
        long id = 0;


        System.out.println("Enter your name");
        name = custInput.nextLine();
        cust.setCustomerName(name);

        System.out.println("Enter your address");
        address = custInput.nextLine();
        cust.setCustomerAddress(address);

        System.out.println("Enter your email");
        email = custInput.nextLine();
        cust.setCustomerEmail(email);

        System.out.println("Enter your phone");
        phone = custInput.nextLong();
        cust.setCustomerPhone(phone);

        System.out.println("Enter your personal number:");
        id = custInput.nextLong();
        cust.setCustomerId(id);

        customersList.add(cust);

        //saving in the file

        try{
            fm.saveCustomersDataInFile(customersList);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }






    private void showAvailableHotel(){

    }

    private void bookRoom(){


    }


}
