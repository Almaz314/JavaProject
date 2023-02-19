package javaproject;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;


public class MembershipManagment {

    final private Scanner reader = new Scanner(System.in);
    private int getIntInput(){
        int choice = 0;
        while (choice == 0){
        try {
            choice = reader.nextInt();
            if (choice == 0)
                throw new InputMismatchException();
            reader.nextLine();
        }
        catch (InputMismatchException e) {
            reader.nextLine();
            System.out.println("ERROR: INVALID INPUT. Please try again:");
            }
        }
        return choice;
    }

    private void printCloubOptions(){
        System.out.println("\1) Club Mercury");
        System.out.println(" 2) Club Neptune");
        System.out.println(" 3) Club Jupiter");
        System.out.println(" 4) Multi Clubs");
    }

    public int getChoice(){
        int choice;
        System.out.println("\nWELCOM TO OZONE FITNESS CENTER");
        System.out.println("=================================");
        System.out.println("1) Add Member");
        System.out.println("2) Remove Member");
        System.out.println("3) Display Member Information");
        System.out.println("\n Please select an option (or Enter -1 to quit): ");
        choice = getIntInput();
        return choice;
    }

    public String addMembers(LinkedList<Member> m){

    }
}

