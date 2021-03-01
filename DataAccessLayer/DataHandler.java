package DataAccessLayer;
import BusinessLogicLayer.*;
import java.io.*;
import java.util.*;


public class DataHandler {
    String filepathAdd = "C:\\Users\\Aura\\Desktop\\PRG381 Project\\Address.txt";
    public List<Address> GetAddress() throws FileNotFoundException{
        List<Address> aList = new ArrayList<Address>();
        
        File file = new File(filepathAdd);
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            String[] line = sc.nextLine().split(",");
            aList.add(new Address(Integer.parseInt(line[0]),Integer.parseInt(line[1]),line[2],line[3], line[4], line[5]));


        }
        sc.close();
        return aList;
    }
        Address address = new Address();
    
    public void AddAddress() throws IOException {
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
            Integer UnitNo = scan.nextInt();
            address.setUnitNo(UnitNo);

            System.out.print(" Enter your street name");
            String Street = scan.nextLine();
            address.setStreet(Street);

            System.out.print(" Enter your suburb name ");
            String Suburb = scan.nextLine();
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

    String filepathDeco = "C:\\Users\\Aura\\Desktop\\PRG381 Project\\Decorations.txt";
    public List<Decorations> GetDecorations() throws FileNotFoundException{
        List<Decorations> dList = new ArrayList<Decorations>();
        
        File file = new File(filepathDeco);
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            String[] line = sc.nextLine().split(",");
            dList.add(new Decorations(Integer.parseInt(line[0]), line[1], line[2], line[3]));

        }
        sc.close();
        return dList;
    }
    Decorations decorations = new Decorations();

    public void AddDecorations() throws IOException {
        File file = new File("C:\\Users\\Aura\\Desktop\\PRG381 Project\\Decorations.txt");
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
                decorations.setDecorID(linecount + 1);
                lr.close();
            }

            System.out.print(" Enter the theme you want");
            String Theme = scan.nextLine();
            decorations.setTheme(Theme);

            System.out.print(" Enter the colorscheme you want");
            String ColorScheme = scan.nextLine();
            decorations.setColorScheme(ColorScheme);

            System.out.print(" Enter the decor descriptions ");
            String DecorDescriptions = scan.nextLine();
            decorations.setDecorDescriptions(DecorDescriptions);

           pw.println(address.toString());
           pw.close();

        }
    }
    
}
