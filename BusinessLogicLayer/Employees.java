package BusinessLogicLayer;

public class Employees {
    String empfirstname;
    String emplastname;
    String emppassword;

    public String getFirstname(){
        return empfirstname;
    }
    public void setFirstname(String empfirstname){
        this.empfirstname = empfirstname;
    }
    public String getLastname(){
        return emplastname;
    }
    public void setLastname(String emplastname){
        this.emplastname = emplastname;
    }
    public String getPassword(){
        return emppassword;
    }
    public void setPassword(String emppassword){
        this.emppassword = emppassword;
    }
    
    public Employees(){}

    public Employees(String empfirstname, String emplastname, String emppassword){
        this.empfirstname = empfirstname;
        this.emplastname = emplastname;
        this.emppassword = emppassword;
    }
}
