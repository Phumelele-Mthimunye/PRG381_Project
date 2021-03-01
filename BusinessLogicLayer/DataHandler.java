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

        Address address = new Address();
    
    public Void AddAddress() throws IOException {
        File file = new File("C:\\Users\\Aura\\Desktop\\PRG381 Project\\Address.txt");
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        
        try (Scanner scan = new Scanner(System.in)) {
            if(file.exists()){
                FileReader fr = new FileReader(file);
                LineNumberReader lr = new LineNumberReader(fr);
                int linecount = 0;
                while(lr.readLine()!=null){
                    linecount++;
                }
                address.setAddressID(linecount + 1);
                lr.close();
            }

            System.out.print(" Enter your Unit number");
            String UnitNo = scan.nextLine();
            address.setUnitNo(UnitNo);

            System.out.print(" Enter your street name");
            String Street = scan.nextLine();
            address.setStreet(Street);

            System.out.print(" Enter your suburb name ");
            String Suburb = scan.nextInt();
            address.setSuburb(Suburb);

           System.out.print(" Enter your City name ");
           String City = scan.nextLine();
           address.setCity(City);

           System.out.print(" Enter your phone number ");
           String PhoneNo = scan.nextLine();
           address.setPhoneNo(PhoneNo);

           pw.println(address.toString());
           pw.close();

        }
    }
    
    }
}
