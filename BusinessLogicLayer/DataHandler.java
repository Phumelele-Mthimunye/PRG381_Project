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
            aList.add(new Address(AddressID, UnitNo, Street, Suburb, City, PhoneNo));


        }
        sc.close();
        return aList;


    
}
