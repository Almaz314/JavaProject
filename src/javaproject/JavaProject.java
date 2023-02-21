package javaproject;
import java.lang.reflect.Member;
import java.util.LinkedList;
import java.util.logging.FileHandler;

public class JavaProject{

    public static void main(String[] args) {

        String mem;

        MembershipManagment mm = new MembershipManagment();
        FileHandler fh = new FileHandler();

        LinkedList<Member> members = fh.readFile();
        int choice = mm.getChoice();

        while (choice != -1){
            switch (choice){
                case 1:
                    mem = mm.addMembers(members);
                    fh.appendFile(mem);
                    break;
                case 2:
                    mm.removeMember(members);
                    fh.overwriteFile(members);
                    break;
                case 3:
                    mm.printMemberInfo(members);
                    break;
                default:
                    System.out.println("\nYou have selelcted an invalid option.\n\n");
                    break;
            }
            choice = mm.getChoice();
        }
        System.out.println("Good Bye");
    }
}