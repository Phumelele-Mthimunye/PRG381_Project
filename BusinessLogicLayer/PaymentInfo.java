package BusinessLogicLayer;

public class PaymentInfo {
   private int payid;
   private int bookingnr;
   public static  double priceperguest=50;
   private int totalprice;
   private int noofguest;
   private int discount;

   public PaymentInfo(int payid, int bookingid, int totalprice, int percentagepayed, int noofguest, int disount) {
       this.payid = payid;
       this.bookingnr = bookingid;
       this.totalprice = totalprice;
       this.noofguest = noofguest;
       this.discount=disount;
       
   }


 
//default constructor
public PaymentInfo()
{
 noofguest=0;
 totalprice=0;

}
//Method to get payid 
public int getPayid()
{
    return payid;
}
public int setpayid(int payid)
{
 this.payid=payid;
   return payid;
}
//Method to get bookingnr 
public int Getbookingnr()
{
    return bookingnr;
}
public int setbooking(int bookingid)
{
this.bookingnr=bookingid;
  return bookingid;
}
//Method to set numberofguest
public int setguests(int numberofguest)
{
    this.noofguest=numberofguest;
   return noofguest;
    //computeprice(numberofguest);
}


// Method to get number of guest
public int getGuest()
{
    return noofguest;
}
//Method to get totalprice
public int gettotalprice()
{
    return totalprice;
}
public void settotalprice( int totalprice)
{
    this.totalprice= totalprice;

}

public int getnoofguest()
{
    return noofguest;
}
public int getdiscount()
{
    return discount;
}
public void setdiscount(int discount)
{
   this.discount= discount;

}
}


