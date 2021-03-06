package BusinessLogicLayer;

import java.io.FileNotFoundException;
import java.util.List;

import DataAccessLayer.DataHandler;

public class Address {
    Integer AddressID;
    Integer UnitNo;
    String Street;
    String Suburb;
    String City;
    String PhoneNo;
    public Integer getAddressID()
    {
        return AddressID;
    }
    public void setAddressID(Integer AddressID)
    {
        this.AddressID = AddressID;
    }
    public Integer getUnitNo()
    {
        return UnitNo;
    }
    public void setUnitNo(Integer UnitNo)
    {
        this.UnitNo = UnitNo;
    }
    public String getStreet()
    {
        return Street;
    }
    public void setStreet(String Street)
    {
        this.Street = Street;
    }
    public String getSuburb()
    {
        return Suburb;
    }
    public void setSuburb(String Suburb)
    {
        this.Suburb = Suburb;
    }
    public String getCity()
    {
        return City;
    }
    public void setCity(String City)
    {
        this.City = City;
    }
    public String getPhoneNo()
    {
        return PhoneNo;
    }
    public void setPhoneNo(String PhoneNo)
    {
        this.PhoneNo = PhoneNo;
    }

    public Address()
    {

    }

    public Address(Integer AddressID, Integer UnitNo, String Street, String Suburb, String City, String PhoneNo)
    {
        this.AddressID = AddressID;
        this.UnitNo = UnitNo;
        this.Street = Street;
        this.Suburb = Suburb;
        this.City = City;
        this.PhoneNo = PhoneNo;
    }
    public List<Address> addresses( ) throws FileNotFoundException{
        DataHandler dh = new DataHandler();
        List<Address> aList = dh.GetAddress();
        if(!aList.isEmpty()){
            return aList;
        }
        else{
            return null;
        }
    }

    public String ToString()
    {
        return AddressID+ " "+ UnitNo + " "+ Street+ " "+ Suburb+ " "+City+ " "+ PhoneNo;
    }
}
