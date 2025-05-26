/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import javax.swing.JOptionPane;

public class Message {
    private String messageID;
    private String recipientCell;
    private String messageContent;
    private String messageCount;
    private static ArrayList<String> sentMessages = new ArrayList<>();
    private static int totalMessages = 0;
    
    
    public Message(String messageID, String recipientCell, String messageContent, String messageCount){
        this.messageID = messageID;
        this.recipientCell = recipientCell;
        this.messageContent = messageContent;
        this.messageCount = messageCount;
    }
    
    public boolean checkMessageId(){
        return messageID.length()<= 10; 
        
    }
    
    generateMessageID(){
        Random rand = new Random();
        long num = 1000000000L + (long)(rand.nextDouble()* 89999999999L);
        return String.valueOf(num);
        
    }
    // check recipient number format
    public boolean checkRecipientCell(){
        if(recipientCell.length() <= && recipientCell.matches("^\\+?[0-9]+$"){
            return number != null && number.trim().matches("//+27//d{9}");
        }
        return 0; //invalid
    }
    public String createMessageHash(){
      
      String[] words = content.trim() .split("//s+");
      String firstWord = words[0].toUpperCase();
      String lastWord =  words[words.length - 1].toUpperCase();
      return
              messageID.substring(0,2)+ ":" + messageCount + ":" + firstWord + lastWord;
    }
    public String SentMessages(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you waant to send, store or discard the message? ");
        String choice = scanner.nextLine().toLowerCase();
        
        switch (choice){
            case"send":
                sentMessages.add(messageContent);
                totalMessages++;
                return "Message sent.";
            case "store":
                return storeMessage();
                case"discard":
                    return "Message discarded.";
                default:
                    return "Invalid choice.";
        }
    }
    public boolean checkMessegesID(){
        return messageID.length() == 10;
    }
    public boolean checkRecipientCell(){
        return recipient != null && (recipient.matches("^0[6-8][0-9]{8}$"))/ recipient.matches("^/+27[6-8][0-9]{8}$");
    }
    
    public String createMessageHash(){
        String firstTwo = messageID.substring(0,2);
        String msgNum = String.valueOf(numMessagesSent);
        Sring[] words= words.length>1? words[0]:"";
        String last = words.length>1? words[words.length - 1]:"";
        return (firstTwo+ ":" + msgNum + ":" + first + last).toUpperCase();
    }
    
    
    public String sentMessage(){
        String[] options = {"Send message", "Discard Message", "Store message to sender "};
        int choice = JOptionPane.showOptionDialog(null,"Choose an option:","Send Message");
    }
    
    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,options,options[0]);
    switch (choice){
        case0->{
        sent.Messages.add(this.to.String());
            return "message sent";
    }
            case1->{
    return "message stored";
    }
            case2->{
    storeMessage();
    return"Message stored";
    default->{
    return "No action taken";
}
}
    }
    
    
    public String printMessages(){
        return String.join("/n", sentMessages);
    }
    public int returnTotalMessages(){
        return totalMessages;
    }
    
    public String storeMessage() {
    return "{"
            + "\"messageID\": \"" + messageID + "\", "
            + "\"recipientCell\": \"" + recipientCell + "\", "
            + "\"content\": \"" + messageContent + "\""
            + "}";
    
    public static String printMessage(){
        return 
                String.join("/n", sentMessages);
    }
    public static int returnTotalMessages(){
        return 
                return messageCount;
    }
    
    public void storeMessage(){
        try (FileWriter file = new FileWriter("storedMessages.txt", true)){
            file.write("""
                    {
            /"MessageID":/"" + messageID + "/",
            /"Reciient":/"" + recipient + "/",
            "Message":/"" + message + "/",
            "MessageHash":/"" + messageHash + "/",
        },
        """);
        
        }
    }
    
    
    
    @Override
    public String toString(){
        return"MessageID:" +  messageID+ "/Recipient:" + "/Message:" + message +"/nMessageHash:" + messageHash;
    }
  
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null,"Welcome Quick Chat.");
        String inputLimit = JOptionPane.showInputDialog("How many messages would you like to send?");
        int limit = Integer.parseInt(inputLimit);
    }
    
    OUTER:
    while(true){
        String[] options = {"Send Messages","Show recently sent messages", "quit"};
        int choice = 
                JOptionPane.showOptionDialog(null," Choose an option:","Main Menu");
    }
    
    
JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,options,options[0]);
switch (choice){
    case 0 ->{
        if(messageCount >= limit){
    
    
    JOptionPane.showMessageDialog(null, "Message limit reached");
    continue;
    }
    String recipient  = JOptionPane.showInputDialog("enter recipient number:");
    String message = JOptionPane.showInputDialog("enter your message:");
    if(message.length()>250 / message.length()<2) {
    JOptionPane.showMessageDialog(null, "please enter a message between 2 and 250 characters.");
     continue;
} Message msg = new Message(recipient,message);
    
    
String result = msg.sentMessage();
    
    JOptionPane.showMessageDialog(null, result);
    JOptionPane.showMessageDialog(null,msg.toString());
    }
    case1-> {
    JOptionPane.showMessageDialog(null,"Coming soon.");
    case2->{
        JOptionPane.showMessageDialog( messageID"Goodbye!");
        break OUTER;
    }
            default ->{
    
}
    }
}
    JOptionPane.showMessageDialog(null,"Total messages sent:" + returnTotalMessages());
}
} 
    

