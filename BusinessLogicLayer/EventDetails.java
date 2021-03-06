//import java.util.Scanner;
package BusinessLogicLayer;
public class EventDetails{
     private int bookingnr;
    private int clientid;
    private String eventype;
    private int addressid;
    private int  noofadults; 
    private int  noofkids;
    private String foodselection;
    private String decoration;
    
//only reads the booking number since its automated
     public int getbookingnr()
     {
     //Scanner scannner = new Scanner (System.in);
     //int bookingnr;
     //System.out.println("Please Enter booking Number: ");
     // bookingnr=interger.parse(scannner.nextLine());
          return bookingnr;
     }
     public int setbookingnr(int bookingnr)
     {
          this.bookingnr=bookingnr;
          return bookingnr;
     }
//only reads the booking number since its automated
     public int getclientid()
     { 
          return clientid;
     }
     public void setclientid(int id)
     {
          this.clientid=id;
     }
     // get and sets cause it will read and write the event type
     public String geteventtype()
     {
          return eventype;
     }
     public void seteventtype(String eventype)
     {
          this.eventype=eventype;
     }
     public int getaddressid()
     { 
          return addressid;
     }

     public int getnoofadults()
     {
          return noofadults;
     }
     public void setnoofadults(int noofadults)
     {
          this.noofadults=noofadults;
     }
     public int getnoofkids()
     { 
          return noofkids;
     }
     public void setnoofkids(int noofkids)
     {
          this.noofkids=noofkids;
     }
     public String getfoodselection()
     { 
          return foodselection;
     }
     public void setfoodselection(String foodselection)
     {
          this.foodselection=foodselection;
     }
     public String getdecoration()
     { 
          return  decoration;

     }
     public EventDetails()
     {

     }
     public EventDetails( int bookingnr, int clientid,String eventype, int addressid,int noofadults,int noofkids,String foodselection,String decoration)
     {
          this.bookingnr=bookingnr;
          this.clientid=clientid;
          this.eventype=eventype;
          this.addressid=addressid;
          this.noofadults=noofadults;
          this.noofadults=noofkids;
          this.foodselection=foodselection;
          this.decoration=decoration;

     }
}
