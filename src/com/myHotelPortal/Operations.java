package com.myHotelPortal;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operations implements Functions{

    public List<Admins> admin = new ArrayList<>();
    public List<Hotels> hotelList = new ArrayList<Hotels>();
    public List<Customers> customersList = new ArrayList<>();
    public List<BookingLogs> bookingLog = new ArrayList<>();
    public List<Histories> history = new ArrayList<>();






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
        Scanner adminInput = new Scanner(System.in);
        int localInput = 0;
        //boolean isInteger = true;

        while (localInput != 7) {
            System.out.println("!!!Welcome to the Admin panel!!!");
            System.out.println(
                    "Please select from the following menu" +

                            "\n1. Press 1 to see available hotels. " +
                            "\n2. press 2 to insert new hotel." +
                            "\n3. Press 3 to check available booking." +
                            "\n4. Press 4 to update booking." +             // Edit booking or delete booking
                            "\n5. Press 5 to delete a hotel." +
                            "\n6. Press 6 to delete all hotels" +
                            "\n7. Press 7 to exit."
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
                hotelName = adminInput.next();
                ht.setHotelName(hotelName);

                System.out.println("Enter Place of the hotel");
                place = adminInput.next();
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

            } else if (localInput == 6) {

            } else if (localInput == 7) {

            } else {
                System.out.println("Input type mismatch, please insert an integer...");


            }

        }
    }

    // Customer Menu
    private void customerMenu() {

        Scanner input = new Scanner(System.in);
        int localInput = 0;
        boolean isInteger = true;

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


            if (input.hasNextInt()) {
                localInput = input.nextInt();
                isInteger = true;

                if (localInput == 1) {

                } else if (localInput == 2) {

                    System.out.println("1. Press 1 if you are a new customer");


                } else if (localInput == 3) {

                } else if (localInput == 4) {

                } else if (localInput == 5) {

                } else if (localInput == 6) {

                }

            } else {
                System.out.println("Input type mismatch, please insert an integer...");
                isInteger = false;
                input.next();
            }


    }




    private void addCustomer() {
        Scanner custInput = new Scanner(System.in);
        Customers cust;

        String name;
        String address;
        String email;
        long phone;
        boolean bookingStatus = false;
        double id = 0;


        System.out.println("Enter your name");
        name = custInput.nextLine();
        System.out.println("Enter your address");
        address = custInput.nextLine();
        System.out.println("Enter your email");
        email = custInput.nextLine();
        System.out.println("Enter your phone");
        phone = custInput.nextLong();

        cust = new Customers(name, address, email, phone, bookingStatus, id);
        customersList.add(cust);
    }






    private void showAvailableHotel(){

    }

    private void bookRoom(){

    }


}
