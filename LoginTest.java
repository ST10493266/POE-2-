/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class LoginTest {
    
    public LoginTest() {
    }
    @Test
    public void testCheckUserName(){
        Login login = new Login("", "","kyl_1","+838968976","Ch&&sec@ke99!");
        assertTrue(login.checkUsername());
    }
    public void testCheckUsernameIncorrectlyFormatted(){
        Login login = new Login("", "","kyl_1","+838968976","Ch&&sec@ke99!");
        assertFalse(login.checkUserName());
    }
     @Test
     public void testCheckPasswordComplexity(){
        Login login = new Login("", "","kyl_1","+838968976","Ch&&sec@ke99!");
        assertTrue(login.checkPasswordComplexity);
        
        public void testPasswordDoesNotMeetComplexity(){
              Login login = new Login("", "","kyl_1","+838968976","Ch&&sec@ke99!");
              asserFalse(login.checkPasswordComplexity);
        }
        
        @org.junit.jupiter.api.Test
        public void testCheckCellPhoneNumber(){
            Login login = new Login("", "","kyl_1","+838968976","Ch&&sec@ke99!");
            assertFalse(login.checkCellPhoneNumber());
            
            @Test
            public void testcheckCellphoneNumberIncorrectlyFormatted(){
              Login login = new Login("", "","kyl_1","+838968976","Ch&&sec@ke99!");
              assertFalse(login.checkCellPhoneNumber());
        }
          @Test
          public void testLoginUser(){
             Login login = new Login("", "","kyl_1","+838968976","Ch&&sec@ke99!");
             assertTrue(login.loginUser("kyl_1", "Ch&&sec@ke99!"));
             
       
