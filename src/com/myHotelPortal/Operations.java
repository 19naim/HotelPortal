package com.myHotelPortal;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operations implements Functions{

    public List<Admins> admin = new ArrayList<Admins>();
    public List<Hotels> hotelList = new ArrayList<Hotels>();
    public List<Customers> customersList = new ArrayList<Customers>();
    public List<BookingLogs> bookingLogList = new ArrayList<BookingLogs>();
    public List<Histories> historyList = new ArrayList<Histories>();






    // Show menu functions
    @Override
    public void showMenu() {
        Scanner input = new Scanner(System.in);
        int localInput = 0;
        boolean isInteger = true;

        while (true) {
            System.out.println("\n\nWelcome to the Outstanding Hotel Portal !!!" +
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
        BookingLogs bl = new BookingLogs();
        //loading data from file
        hotelList = fm.rtvHotelData("Hotels.txt");
        customersList = fm.rtvCustomersData("Customers.txt");
        bookingLogList = fm.rtvBookingLogsData("BookingLogs.txt");
        historyList = fm.rtvHistoriesData("Histories.txt");
        Scanner adminInput = new Scanner(System.in);
        int localInput = 0;
        //boolean isInteger = true;

        while (localInput != 12) {
            System.out.println("\n\n!!!Welcome to the Admin panel!!!");
            System.out.println(
                    "Please select from the following menu" +

                            "\n1. Press 1 to see available hotels. " +
                            "\n2. press 2 to insert new hotel." +
                            "\n3. Press 3 to check available booking." +
                            "\n4. Press 4 to delete booking." +                 // Edit booking or delete booking
                            "\n5. Press 5 to check registered customers" +
                            "\n6. Press 6 to delete one customer" +
                            "\n7. Press 7 to delete all the customers" +
                            "\n8. Press 8 to delete a hotel." +
                            "\n9. Press 9 to delete all hotels" +
                            "\n10. press 10 to see histories " +
                            "\n11. Press 11 to edit booking." +
                            "\n12. Press 12 to exit"
            );
            localInput = adminInput.nextInt();


            // display available hotels
            if (localInput == 1) {
                showAvailableHotel();
            }

            //insert new hotels to the portal
            else if (localInput == 2) {
                Hotels ht = new Hotels();
                Scanner in  = new Scanner(System.in);

                String hotelName = null;
                String place = null;
                int totalRoom = 0;
                int singleRoom = 0;
                double slRmPrice = 0;
                int doubleRoom = 0;
                double dblRmPrice = 0;
                int pdsSuit = 0;
                double pdsPrice = 0;



                System.out.println("Enter the name of the Hotel.");
                hotelName = in.nextLine();
                ht.setHotelName(hotelName);

                System.out.println("Enter Place of the hotel");
                place = in.nextLine();
                ht.setHotelLocation(place);

                System.out.println("Enter total number of rooms.");
                totalRoom = in.nextInt();
                ht.setTotalRooms(totalRoom);

                System.out.println("Enter total number of single rooms.");
                singleRoom = in.nextInt();
                ht.setTotalSingleRooms(singleRoom);

                System.out.println("Enter price per night for single room:");
                slRmPrice = in.nextDouble();
                ht.setSlRmPrPrNight(slRmPrice);

                System.out.println("Enter total number of double rooms.");
                doubleRoom = in.nextInt();
                ht.setTotalDoubleRooms(doubleRoom);

                System.out.println("Enter price per night for double room:");
                dblRmPrice = in.nextDouble();
                ht.setDblRmPrNight(dblRmPrice);

                System.out.println("Enter total number of Presidential Suit.");
                pdsSuit = in.nextInt();
                ht.setTotalPresidentialSuit(pdsSuit);

                System.out.println("Enter price per night for presidential suit:");
                pdsPrice = in.nextDouble();
                ht.setPdrsdtStPrNight(pdsPrice);

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
                System.out.println("All the active booking listed below:");
                for (int i = 0; i < bookingLogList.size(); i++) {
                    System.out.println("Customer name:" +bookingLogList.get(i).getCustomerName());
                    System.out.println("Customer email:" +bookingLogList.get(i).getCustomerEmail());
                    System.out.println("Hotel name:" +bookingLogList.get(i).getHotelName());
                    System.out.println("Hotel Location:" +bookingLogList.get(i).getLocation());
                    System.out.println("Single room:" +bookingLogList.get(i).getNumberOfSingleRoom()) ;
                    System.out.println("Double room:" +bookingLogList.get(i).getNumberOfDoubleRoom());
                    System.out.println("Presidential suit:" +bookingLogList.get(i).getNumberOfPrcdntSuit());
                    System.out.println("Total cost:" +bookingLogList.get(i).getTotalCost());
                }

            } else if (localInput == 4) {
                cancelBooking();

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
                // Delete one customer by admin
                Scanner in = new Scanner(System.in);
                String custEmail;
                System.out.println("Enter customer email:");
                    custEmail = in.nextLine();

                for (int i = 0; i < customersList.size(); i++) {
                    if(customersList.get(i).getCustomerEmail().equals(custEmail)){
                        customersList.remove(i);
                    }
                }

                cancelBooking();

            } else if (localInput == 7) {
                for (int i = 0; i < customersList.size(); i++) {
                    customersList.remove(i);
                }

            // Admin is removing all customer from register
                try{
                    fm.saveCustomersDataInFile(customersList);
                }catch (FileNotFoundException e){
                    e.printStackTrace();
                }

            } else if(localInput == 8){
                // delete one hotel by admin
                Scanner in = new Scanner(System.in);
                String hotelName;
                System.out.println("Enter hotel name:");
                hotelName = in.nextLine();
                for (int i = 0; i < hotelList.size(); i++) {
                    if(hotelList.get(i).getHotelName().equals(hotelName)){
                        hotelList.remove(i);
                    }
                }

                try{
                    fm.saveHotelsDataInFile(hotelList);
                }catch (FileNotFoundException e){
                    e.printStackTrace();
                }

                // removing all booking from that particular hotel
                for (int i = 0; i < bookingLogList.size(); i++) {
                    if(bookingLogList.get(i).getHotelName().equals(hotelName)){
                        bookingLogList.remove(i);
                    }
                }

                try{
                    fm.saveBookingLogsDataInFile(bookingLogList);
                }catch (FileNotFoundException e){
                    e.printStackTrace();
                }

            } else if(localInput == 9) {
                // admin deleting all the hotels
                for (int i = 0; i < hotelList.size(); i++) {
                    hotelList.remove(i);
                }
                //Admin is removing all hotel from the file

                try{
                    fm.saveHotelsDataInFile(hotelList);
                }catch (FileNotFoundException e){
                    e.printStackTrace();
                }

            }else if(localInput == 10){
                showHistory();

            }else if(localInput == 11){
               editBooking();

            }else if(localInput == 12){
                System.out.println("Getting out from admin menu..");
            }
            else {
                System.out.println("Input type mismatch, please insert an integer...()");


            }

        }
    }

    // Customer Menu
    private void customerMenu() {
        //loading data from file
        FileManagement fm = new FileManagement();
        hotelList = fm.rtvHotelData("Hotels.txt");
        customersList = fm.rtvCustomersData("Customers.txt");
        bookingLogList = fm.rtvBookingLogsData("BookingLogs.txt");

        Scanner input = new Scanner(System.in);

        int localInput = 0;

        while(localInput != 6) {
            System.out.println("\n\n!!!Welcome to the Customer panel!!!");
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
               showAvailableHotel();

            } else if (localInput == 2) {
                Scanner in = new Scanner(System.in);
                int optInput = 0;

                System.out.println("1. Press 1 if you are new to the Hotel Portal" +
                        "\n2. Press 2 if you already have an account");
                    optInput = in.nextInt();
                    if(optInput == 1){
                        addCustomer();
                    }else if(optInput == 2){
                        bookRoom();
                    }


            } else if (localInput == 3) {
                showOneBooking();

            } else if (localInput == 4) {
                    editBooking();

            } else if (localInput == 5) {
                    cancelBooking();

            } else if (localInput == 6) {
                System.out.println("Getting out from customer menu ....");
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
            System.out.println("Customer Registration complete :)");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }





// Show available Hotel
    private void showAvailableHotel(){
        System.out.println("All the hotel listed below");
        for (int i = 0; i < hotelList.size(); i++) {
            System.out.println("Hotel Name:" + hotelList.get(i).getHotelName());
            System.out.println("Place:" + hotelList.get(i).getHotelLocation());
            System.out.println("Total Number of rooms:" + hotelList.get(i).getTotalRooms());
            System.out.println("Available single Rooms:" + hotelList.get(i).getTotalSingleRooms());
            System.out.println("Single room price per night:" +hotelList.get(i).getSlRmPrPrNight());
            System.out.println("Available double rooms:" + hotelList.get(i).getTotalDoubleRooms());
            System.out.println("Double room price per night:" +hotelList.get(i).getDblRmPrNight());
            System.out.println("Available Presidential suit:" + hotelList.get(i).getTotalPresidentialSuit());
            System.out.println("Presidential suit price per night:" +hotelList.get(i).getPdrsdtStPrNight());
        }

    }


    // book rooms
    private void bookRoom(){
        Hotels ht = new Hotels();
        BookingLogs bl = new BookingLogs();
        Histories hs = new Histories();

        FileManagement fm = new FileManagement();
        Scanner in = new Scanner(System.in);

        String name;
        String address;
        String email;
        long phone;
        long id;
// extract price file and store here
        double  sglRmCost = 0;
        double dblRmCost = 0;
        double pdsCost = 0 ;


        String hotelName;
        String hotelLocation;
        int singleRoom = 0;
        int doubleRoom = 0;
        int prsdntSuit = 0;
        double totalcost = 0;

        System.out.println("Enter email:");
        email = in.nextLine();
        for (int i = 0; i < customersList.size(); i++) {
            if (customersList.get(i).getCustomerEmail().equals(email)){
                name = customersList.get(i).getCustomerName();
                address = customersList.get(i).getCustomerAddress();
                phone = customersList.get(i).getCustomerPhone();
                id = customersList.get(i).getCustomerId();

                System.out.println("Enter hotel name:");
                    hotelName = in.nextLine();
                    bl.setHotelName(hotelName);

                // Extracting price from hotel
                for (int j = 0; j < hotelList.size(); j++) {
                    if(hotelList.get(j).getHotelName().equals(hotelName)){
                        sglRmCost = hotelList.get(j).getSlRmPrPrNight();
                        dblRmCost = hotelList.get(j).getDblRmPrNight();
                        pdsCost = hotelList.get(j).getPdrsdtStPrNight();
                    }
                }

                //update to the BookingLog

                System.out.println("Enter hotel place:");
                    hotelLocation = in.nextLine();
                    bl.setLocation(hotelLocation);

                System.out.println("Single room (if no single room, just put 0):");
                    singleRoom = in.nextInt();
                    bl.setNumberOfSingleRoom(singleRoom);

                System.out.println("Double room if no double room, just put 0:");
                    doubleRoom = in.nextInt();
                    bl.setNumberOfDoubleRoom(doubleRoom);

                System.out.println("Presidential suit (if no presidential suit, just put 0):");
                    prsdntSuit = in.nextInt();
                    bl.setNumberOfPrcdntSuit(prsdntSuit);

                    bl.setCustomerName(name);
                    bl.setCustomerEmail(email);

                    totalcost = ((singleRoom*sglRmCost)+(doubleRoom*dblRmCost)+(prsdntSuit*pdsCost));

                    bl.setTotalCost(totalcost);

                    bookingLogList.add(bl);
                // booking update to file
                try{
                    fm.saveBookingLogsDataInFile(bookingLogList);
                    System.out.println("Booking Confirmed :)");
                }catch (FileNotFoundException e){
                    e.printStackTrace();
                }

                //update to the Hotel room

                for (int j = 0; j < hotelList.size(); j++) {
                    if(hotelList.get(i).getHotelName().equals(hotelName)){
                        hotelList.get(i).setTotalSingleRooms(hotelList.get(i).getTotalSingleRooms()-singleRoom);
                        hotelList.get(i).setTotalDoubleRooms(hotelList.get(i).getTotalDoubleRooms()-doubleRoom);
                        hotelList.get(i).setTotalPresidentialSuit(hotelList.get(i).getTotalPresidentialSuit()-prsdntSuit);
                        hotelList.get(i).setTotalRooms(hotelList.get(i).getTotalRooms()-(singleRoom+doubleRoom+prsdntSuit));
                    }
                }
                // update to the hotel file
                try{
                    fm.saveHotelsDataInFile(hotelList);
                    //System.out.println("Booking Confirmed :)");
                }catch (FileNotFoundException e){
                    e.printStackTrace();
                }

                //update to the History
                hs.setCustomerName(name);
                hs.setCustomerEmail(email);
                hs.setHotelName(hotelName);
                hs.setHotelLocation(hotelLocation);
                hs.setNoOfSingleRoom(singleRoom);
                hs.setNoOfDoubleRoom(doubleRoom);
                hs.setNoOfPresidentialSuit(prsdntSuit);
                hs.setTotalCost(totalcost);

                historyList.add(hs);

                //update to history file
                try{
                    fm.saveHistoriesDataInFile(historyList);
                }catch (FileNotFoundException e){
                    e.printStackTrace();
                }

            }else {
                System.out.println("");
            }

    }


  }

  // edit one specific booking
    private void editBooking(){
        FileManagement fm = new FileManagement();
        Scanner in = new Scanner(System.in);

        showOneBooking();


        String custEmail;

        String exHotelName = null;
        int exNumSingleRoom;
        double exSglRoomCost = 0;
        int exNumDoubleRoom;
        double exDoubleRoomCost = 0;
        int exNumPdSuit;
        double exPdCost = 0;


        int numSingleRoom;
        int numDoubleRoom;
        int numPdSuit;


        System.out.println("");

        System.out.println("Enter customer email again:");
            custEmail = in.nextLine();
        System.out.println("To edit your booking choose from the following menu:");

        System.out.println("Put desire number of single room:");
            numSingleRoom = in.nextInt();

        System.out.println("Put desire number of double room:");
            numDoubleRoom = in.nextInt();

        System.out.println("Put desire number of president suit:");
            numPdSuit = in.nextInt();

        for (int i = 0; i < bookingLogList.size(); i++) {
            if(bookingLogList.get(i).getCustomerEmail().equals(custEmail)){
                if((numSingleRoom == 0) && (numDoubleRoom == 0) && (numPdSuit == 0)){
                    cancelBooking();
                }else
//extracting existing booking data
                exHotelName = bookingLogList.get(i).getHotelName();
                exNumSingleRoom = bookingLogList.get(i).getNumberOfSingleRoom();
                exNumDoubleRoom = bookingLogList.get(i).getNumberOfDoubleRoom();
                exNumPdSuit = bookingLogList.get(i).getNumberOfPrcdntSuit();


                for (int j = 0; j < hotelList.size(); j++) {
                    if(hotelList.get(j).getHotelName().equals(exHotelName)){
// returning room like before
                        hotelList.get(i).setTotalRooms(hotelList.get(i).getTotalRooms()+exNumSingleRoom+exNumDoubleRoom+exNumPdSuit);
                        hotelList.get(j).setTotalSingleRooms(hotelList.get(i).getTotalSingleRooms()+exNumSingleRoom);
                        hotelList.get(i).setTotalDoubleRooms(hotelList.get(i).getTotalDoubleRooms()+exNumDoubleRoom);
                        hotelList.get(i).setTotalPresidentialSuit(hotelList.get(i).getTotalPresidentialSuit()+exNumPdSuit);
// extracting price of the room
                        exSglRoomCost = hotelList.get(i).getSlRmPrPrNight();
                        exDoubleRoomCost = hotelList.get(i).getDblRmPrNight();
                        exPdCost = hotelList.get(i).getPdrsdtStPrNight();

                    }
                }
// new booking data set
            bookingLogList.get(i).setNumberOfSingleRoom(numSingleRoom);
            bookingLogList.get(i).setNumberOfDoubleRoom(numDoubleRoom);
            bookingLogList.get(i).setNumberOfPrcdntSuit(numPdSuit);
            bookingLogList.get(i).setTotalCost(exSglRoomCost+exDoubleRoomCost+exPdCost);

                for (int j = 0; j < hotelList.size(); j++) {
                    if(hotelList.get(i).getHotelName().equals(exHotelName)){
                        hotelList.get(i).setTotalSingleRooms(hotelList.get(i).getTotalSingleRooms()-numSingleRoom);
                        hotelList.get(i).setTotalDoubleRooms(hotelList.get(i).getTotalDoubleRooms()-numDoubleRoom);
                        hotelList.get(i).setTotalPresidentialSuit(hotelList.get(i).getTotalPresidentialSuit()-numPdSuit);
                        hotelList.get(i).setTotalRooms(hotelList.get(i).getTotalRooms()-(numSingleRoom+numDoubleRoom+numPdSuit));
                    }
                }

            }
        }

        try{
            fm.saveBookingLogsDataInFile(bookingLogList);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        try{
            fm.saveHotelsDataInFile(hotelList);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }


  //cancel one specific booking
    private void cancelBooking(){
        Scanner in = new Scanner(System.in);
        FileManagement fm = new FileManagement();

        String custEmail;
        String hotelName;

        int bookedSingleRoom = 0;
        int bookedDoubleRoom = 0;
        int bookedPdSuit = 0;


        System.out.println("Enter customer email:");
            custEmail = in.nextLine();

        System.out.println("Enter hotel name:");
            hotelName = in.nextLine();

        for (int i = 0; i < bookingLogList.size(); i++) {
            if((bookingLogList.get(i).getCustomerEmail().equals(custEmail)) && (bookingLogList.get(i).getHotelName().equals(hotelName))){
                bookedSingleRoom = bookingLogList.get(i).getNumberOfSingleRoom();
                bookedDoubleRoom = bookingLogList.get(i).getNumberOfDoubleRoom();
                bookedPdSuit = bookingLogList.get(i).getNumberOfPrcdntSuit();

                //removing booking
                bookingLogList.remove(i);


            }
        }
        //bookingLog file updating
        try{
            fm.saveBookingLogsDataInFile(bookingLogList);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }


        for (int i = 0; i < hotelList.size(); i++) {
            if(hotelList.get(i).getHotelName().equals(hotelName)){
                hotelList.get(i).setTotalSingleRooms(hotelList.get(i).getTotalSingleRooms()+bookedSingleRoom);
                hotelList.get(i).setTotalDoubleRooms(hotelList.get(i).getTotalDoubleRooms()+bookedDoubleRoom);
                hotelList.get(i).setTotalPresidentialSuit(hotelList.get(i).getTotalPresidentialSuit()+bookedPdSuit);
                hotelList.get(i).setTotalRooms(hotelList.get(i).getTotalRooms()+bookedSingleRoom+bookedDoubleRoom+bookedPdSuit);


            }
        }

        //updating hotel
        try{
            fm.saveHotelsDataInFile(hotelList);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    // Show history function
    private void showHistory(){
        System.out.println("All the history listed below:");
        for (int i = 0; i < historyList.size(); i++) {
            System.out.println("\n\nCustomer name:"+ historyList.get(i).getCustomerName()+
                    "\tCustomer email:"+ historyList.get(i).getCustomerEmail()+
                    "\tHotel name:" + historyList.get(i).getHotelName()+
                    "\tHotel Location:"+ historyList.get(i).getHotelLocation()+
                    "\tSingle Room"+ historyList.get(i).getNoOfSingleRoom()+
                    "\tDouble room:"+ historyList.get(i).getNoOfDoubleRoom()+
                    "\tPresidential suit:" + historyList.get(i).getNoOfPresidentialSuit()+
                    "\tTotal Cost SEK: " +historyList.get(i).getTotalCost());
        }
    }

    private void showOneBooking(){
        Scanner in = new Scanner(System.in);
        String custEmail;

        System.out.println("Enter email address:");
        custEmail = in.nextLine();
        for (int i = 0; i < bookingLogList.size(); i++) {
            if(bookingLogList.get(i).getCustomerEmail().equals(custEmail)){
                System.out.println("Customer name:" +bookingLogList.get(i).getCustomerName());
                System.out.println("Customer email:" +bookingLogList.get(i).getCustomerEmail());
                System.out.println("Hotel name:" +bookingLogList.get(i).getHotelName());
                System.out.println("Hotel Location:" +bookingLogList.get(i).getLocation());
                System.out.println("Single room:" +bookingLogList.get(i).getNumberOfSingleRoom()) ;
                System.out.println("Double room:" +bookingLogList.get(i).getNumberOfDoubleRoom());
                System.out.println("Presidential suit:" +bookingLogList.get(i).getNumberOfPrcdntSuit());
                System.out.println("Total cost:" +bookingLogList.get(i).getTotalCost());
            }
        }
    }
}
