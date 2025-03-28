package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;



public class BalanceEnquiry extends JFrame implements ActionListener{
    
    JButton back;
    String pinnumber;
    
    BalanceEnquiry(String pinchange){
        this.pinnumber = pinchange;
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0,900, 700);
        add(image);
        
        back = new JButton("BACK");
        back.setBounds(355, 420, 150, 30);
        back.addActionListener(this);
        image.add(back);
        int balance = 0;
        Conn c= new Conn();
        try{
                ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
                
                while(rs.next()){
                   if(rs.getString("type").equals("Deposit")){
                       balance +=Integer.parseInt(rs.getString("amount"));
                   } 
                   else{
                        balance -=Integer.parseInt(rs.getString("amount"));
                   }
                }
              }catch(Exception e){
                  System.out.println(e);
              }    
         JLabel text = new JLabel("Your Current Account Balance is Rs " + balance);
         text.setForeground(Color.gray);
         text.setFont(new Font("Raleway", Font.BOLD,16));
         text.setBounds(170, 200, 400, 30);
         image.add(text);
        
        setSize(900,900);
        setLocation(300,0 );
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Transactions(pinnumber).setVisible(true);
    }

    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
}
