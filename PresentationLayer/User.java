package PresentationLayer;

import java.io.IOException;
import java.util.Scanner;

import DataAccessLayer.DataHandler;

public class User {
    public static void main(String[] args) throws IOException {
        User user = new User();
        user.printAppHeader();
        user.printUserTypeMenu();
        Scanner scan = new Scanner(System.in);
        
        
        int opt = scan.nextInt();

        switch (opt) {
            case 1:
                {
                    user.printClientVerMenu();
                    int opt1 = scan.nextInt();
                    switch (opt1) {
                        case 1:
                            {
                                DataHandler dh = new DataHandler();
                                dh.VerifyClientLogin();
                            }
                                break;
                        case 2: 
                            {
                                DataHandler dh = new DataHandler();
                                dh.AddClient();
                                
                            }
                    
                        default:
                            break;
                    }
                }
                break;
            case 2:
                {
                    user.printEmpVerMenu();
                }
                    break;
            case 3: {
                    System.exit(0);
                }
                    break;
            default: {
                    System.out.println("Invalid option");
                }
            }
            scan.close();
    }
    //Methods
    public void printAppHeader(){
        System.out.println("|---------------------------------|");
        System.out.println("|  Welcome to Delicious Catering  |");
        System.out.println("|---------------------------------|");
    }
    public void printUserTypeMenu(){

        System.out.println("What type of user are you?");
        System.out.println("1. Client\n2. Employee\n0. Exit");
    }
    public void printClientVerMenu(){
        System.out.println("Do you want to Login as existing client or Register as new client?");
        System.out.println("1. Login\n2. Register\n0. Exit");
    }
    public void printEmpVerMenu(){
        System.out.println("Do you want to Login as existing employee or Register as new employee?");
        System.out.println("1. Login\n2. Register\n0. Exit");
    }
}

