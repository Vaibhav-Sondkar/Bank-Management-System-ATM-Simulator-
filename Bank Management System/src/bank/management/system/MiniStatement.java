package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class MiniStatement extends JFrame{
    
    String pinnumber;
    
     MiniStatement(String pinnumber) {
         
         this.pinnumber = pinnumber;
         
         setTitle("Mini-Statement");
         
          setLayout(null);
         
        
         JLabel mini = new JLabel();
         mini.setBounds(20,140,500,250);
         add(mini);
         
         JLabel bank = new JLabel("Bank Of India (Mini-Statement)");
         bank.setBounds(100, 20, 300, 20);
         add(bank);
         
         JLabel card = new JLabel();
         card.setBounds(20, 80, 300, 20);
         add(card);
         
         JLabel bblance = new JLabel();
         bblance.setBounds(20, 400, 300, 20);
         add(bblance);
         
         try{
             
             Conn conn = new Conn();
             ResultSet rs = conn.s.executeQuery("select * from login where pin ='"+pinnumber+"'");
             while(rs.next()){
                 card.setText("Card Number :" + rs.getString("Card_Number" ).substring(0,4)+ "XXXXXXXX" + rs.getString("Card_Number" ).substring(12));
              
            
             }
             
         }catch(Exception e){
             System.out.println(e);
         }
         
         try{
             int bal = 0;
             Conn conn = new Conn();
             ResultSet rs = conn.s.executeQuery("Select * from bank order by pin = '"+pinnumber+"' asc ");
             while(rs.next()){
                 mini.setText(mini.getText() +"<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount")+"<br><br><html>");
                  if(rs.getString("type").equals("Deposit")){
                       bal +=Integer.parseInt(rs.getString("amount"));
                   } 
                   else{
                        bal -=Integer.parseInt(rs.getString("amount"));
                   }
             }
             bblance.setText("Your Accoungt Balance is Rs "+bal);
         }
         catch(Exception e){
             System.out.println(e);
         }
         
        
         
         setSize(400,600);
         setLocation(20,20);
         getContentPane().setBackground(Color.WHITE);
         setVisible(true);
         
    }

    
    public static void main(String[] args) {
        new MiniStatement("");
    }
}
