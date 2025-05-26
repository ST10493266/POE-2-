/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
public class Login {
   
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String cellPhoneNumber;
    private String role;
    
    //constructor to register a user 
    public Login(String firstname,String lastname,String username,String password,String cellphonenumber){
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.cellPhoneNumber = cellPhoneNumber;
        this.role = role;
    } 
    
        //Getter method
        public String getUserName(){
            return username;
        }   
      
        public String getPassword(){
            return password;
        }
                
        public String getCellPhoneNumber(){
            return cellPhoneNumber;
        }
        public String getFirstName(){
            return firstName;
        }
        public String getLastName(){
            return lastName;
        }  
               
        //Setter method
        public void setUserName(String username){
            this.username = username;
        }
          public void setPassword(String password){
            this.password = password;
        }
        public void setCellPhoneNumber(String cellPhoneNumber){
            this.cellPhoneNumber = cellPhoneNumber;
        }
        public void setLastName(String lastName){
            this.lastName = lastName;
        }
        public void setFirstName(String firstName){
            this.firstName = firstName;
        }  
 
            //Instant method(nonstatic)
        public boolean checkUsername(String username){
            return username != null && username.contains("_")&& username.length()<=5;
        }
            
            //Void method (no return)
        public void displayFullName(){
            System.out.println(firstName + "" +lastName);
        }
            
        public static boolean checkPasswordComplex(String password){
            return password.length() >= 8 &&
                    password.matches(".*[A-Z].*") && // At least one uppercase letter
                    password.matches(".*[a-z].*") && // At least one lowercase letter
                    password.matches(".*[0-9].*") && // At least one digit
                    password.matches(".*[!@#$%^&*()].*"); // At least one special character
        }
  
        
        public boolean checkCellPhoneNumber(String cellPhoneNumber){ 
            // Expecting format: +27 followed by 9 digits9
            return cellPhoneNumber.length()== 13 && cellPhoneNumber.startsWith("+27");
        } 
        
        public String registerUser(boolean checkUserName, boolean checkPassword, boolean checkCellPhoneNumber){
            
            if(!checkPasswordComplexity(password)){
                return "Password does not meet the complexity requirements.";
            }
            if(!checkUserName(username)){
                return " Username is incorrectly formatted.";
            }
            if(!checkCellPhoneNumber(cell)){
                return "Cellphone number is incorrectly formatted.";
            }
            return "User has been registerd successfully.";
            
        }
        public boolean loginUser(String username, String password){
            return 
                    this.username.equals(username()) &&
                    this.password.equals(password());
        }
        public String returnLoginStatus(String username, String password){
            if(loginUser){
                return "Welcome"+ "" + firstName + "" + lastName + ", it is great to see you again.";
            } else {
                return "Username or password incorrect, please try again.";
            }
        }
            public void displayRole(){
                System.out.println("User role:" + role);
                    
            
            
        }
    }
    


    

