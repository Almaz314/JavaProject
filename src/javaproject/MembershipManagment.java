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
        System.out.println("\n1) Club Mercury");
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
        System.out.println("\nPlease select an option (or Enter -1 to quit): ");
        choice = getIntInput();
        return choice;
    }

    public String addMembers(LinkedList<Member> m){

        String name;
        int club;
        String mem;
        double fees;
        int memberID;
        Member mbr;
        Calculator<Integer> cal;

        System.out.println("\nPlease enter you name: ");
        name = reader.nextLine();
        printCloubOptions();
        System.out.println("\nPlease enter the member's clubID: ");
        club = getIntInput();
        while (club < 1 || club > 4){
            System.out.println("\nInvalid ClubID. Please try again: ");
            club = getIntInput();
            if (m.size() > 0)
                memberID = m.getLast().getMemberID() + 1;
            else memberID = 1;
        }

        if (club !=4){
            cal = (n) -> {
            switch (n){
                case 1:
                    return 900;
                case 2:
                    return 950;
                case 3:
                    return 1000;
                default:
                    return -1;
            }
        };
            fees = cal.calculateFees(club);
            mbr = new SingleClubMember('S', memberID, name, fees, club);
            m.add(mbr);
            mem = mbr.toString();
            System.out.println("\nSTATUS: Single Club Member added\n");
    }else {
            cal = (n) -> {
                    if (n == 4)
                        return 1200;
                    else
                        return -1;
                };
            fees = new MultiClubMember('M', memberID, name, fees, 100);
            m.add(mbr);
            mem = mbr.toString();
            System.out.println("\nSTATUS: Multi Club Member added\n");
        }

        return mem;
}
    public void removeMember(LinkedList<Member> m){
        int memberID;
        System.out.println();
        m.getIntInput();
        for(int i = 0; i < m.size(); i++)
}
}

