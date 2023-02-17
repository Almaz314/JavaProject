package javaproject;

import java.util.LinkedList;
import java.io.*;

public class FileHandler {

    public LinkedList<Member> readFile() {

        LinkedList<Member> m = new LinkedList();
        String lineRead;
        String[] splitLine;
        Member mem;

        try (BufferedReader reader = new BufferedReader(new FileReader("member.cvs"))){
            lineRead = reader.readLine();
            while (lineRead != null) {
                splitLine = lineRead.split(", ");

            }
            catch (IOException e){
                    System.out.println(e.getMessage());
                }
                }
            }
        }
    }

    public void appendFile(){}

    public void overWriteFile(){}

}
