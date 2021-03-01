package BusinessLogicLayer;
import DataAccessLayer.*;
import java.io.*;
import java.util.*;


public class DataHandler {
    String filepath = "C:\\Users\\Aura\\Desktop\\PRG381 Project\\Address.txt";
    public List<Address> GetAddress() throws FileNotFoundException{
        List<Address> aList = new ArrayList<Address>();
        
        File file = new File(filepath);
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            String[] line = sc.nextLine().split(",");
            aList.add(new Address(Integer.parseInt(line[0]),Integer.parseInt(line[1]),line[2],line[3], line[4], line[5]));


        }
        sc.close();
        return aList;


    
    }
}
