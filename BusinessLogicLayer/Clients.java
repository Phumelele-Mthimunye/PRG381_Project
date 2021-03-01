package BusinessLogicLayer;


public class Clients {
        String firstname;
        String lastname;
        String email;
        String password;
        String phoneNo;
        int age;

        public String getFirstname(){
            return firstname;
        }
        public void setFirstname(String firstname){
            this.firstname = firstname;
        }
        public String getLastname(){
            return lastname;
        }
        public void setLastname(String lastname){
            this.lastname = lastname;
        }
        public String getEmail(){
            return email;
        }
        public void setEmail(String email){
            this.email = email;
        }
        public String getPassword(){
            return password;
        }
        public void setPassword(String password){
            this.password = password;
        }
        public String getPhoneNo(){
            return phoneNo;
        }
        public void setPhoneNo(String phoneNo){
            this.phoneNo = phoneNo;
        }
        public int getAge(){
            return age;
        }
        public void setAge(int age){
            this.age = age;
        }
        public Clients(){}

        public Clients(String firstname, String lastname, int age, String phoneNo, String email, String password){
            this.firstname = firstname;
            this.lastname = lastname;
            this.age = age;
            this.phoneNo = phoneNo;
            this.email = email;
            this.password = password;
        }

}
    
