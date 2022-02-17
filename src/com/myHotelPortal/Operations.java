package com.myHotelPortal;

import java.util.List;
import java.util.Scanner;

public class Operations {
    List<Admins> admin;
    List <Hotels> hotelList ;
    List <Customers> customersList;
    List <BookingLog> bookingLog;
    List <History> history;



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
            do {
                if (input.hasNextInt()) {
                    localInput = input.nextInt();
                    isInteger = true;

                    if(localInput == 1) {
                        customerMenu();
                    }else if(localInput == 3){
                        System.out.println("welcome Back Again!!!");
                        System.exit(0);
                    }
                } else {
                    System.out.println("Input type mismatch, please insert an integer...");
                    isInteger = false;
                    input.next();
                }

            } while (!(isInteger));
        }
    }
    // Customer Menu
    private void customerMenu(){

        Scanner input = new Scanner(System.in);
        int localInput = 0;
        boolean isInteger = true;

        System.out.println("!!!Welcome to the Customer panel!!!");
        System.out.println("Please select from the following menu" +
                "\n1. Press 1 to see available hotels. " +
                "\n2. press 2 to book a hotel room." +
                "\n3. Press 3 to check your booking." +
                "\n4. Press 4 to update your booking." +
                "\n5. Press 5 to cancel your booking." +
                "\n6. Press 6 to exit.");

        do {
            if (input.hasNextInt()) {
                localInput = input.nextInt();
                isInteger = true;

                if(localInput == 1) {

                }else if(localInput == 2){

                    System.out.println("1. Press 1 if you are a new customer");


                }else if(localInput == 3){

                }else if(localInput == 4){

                }else if(localInput == 5){

                }else if(localInput == 6){

                }

            } else {
                System.out.println("Input type mismatch, please insert an integer...");
                isInteger = false;
                input.next();
            }

        } while (!(isInteger));
    }
    private void addCustomer(){
        Scanner input = new Scanner(System.in);
        Customers cust;

        String name;
        String address;
        String email;
        long phone;
        boolean bookingStatus = false;
        double id = 0;


        System.out.println("Enter your name");
        name = input.nextLine();
        System.out.println("Enter your address");
        address = input.nextLine();
        System.out.println("Enter your email");
        email = input.nextLine();
        System.out.println("Enter your phone");
        phone = input.nextLong();

        cust = new Customers(name,address,email,phone,bookingStatus,id);
        customersList.add(cust);
    }

    private void showAvailableHotel(){

    }

    private void bookRoom(){

    }
    // Admin menu
    private void adminMenu(){

    }


}
