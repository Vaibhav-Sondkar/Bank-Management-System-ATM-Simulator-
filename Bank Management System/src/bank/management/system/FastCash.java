package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;


public class FastCash extends JFrame implements ActionListener{
    
    JButton r1,r2,r3,r4,r5,r6,back;
    String pinnumber;
    
    FastCash(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 720);
        add(image);
        
        JLabel text = new JLabel("Select  Withdrawl Amount");
        text.setBounds(220,200,700,35);
        text.setForeground(Color.gray);
        text.setFont(new Font("System",Font.BOLD,15));
        image.add(text);
        
        r1 = new JButton("Rs 100");
        r1.setBounds(160,312,135,30);
        r1.addActionListener(this);
        image.add(r1);
        
        r2 = new JButton("Rs 500");
        r2.setBounds(380,312,135,30);
        r2.addActionListener(this);
        image.add(r2);
        
        r3 = new JButton("Rs 1000");
        r3.setBounds(160,347,135,30);
        r3.addActionListener(this);
        image.add(r3);
        
        r4 = new JButton("Rs 2000");
        r4.setBounds(380,347,135,30);
        r4.addActionListener(this);
        image.add(r4);
        
        r5 = new JButton("Rs 5000");
        r5.setBounds(160,381,135,30);
        r5.addActionListener(this);
        image.add(r5);
        
        r6 = new JButton("Rs 10000");
        r6.setBounds(380,381,135,30);
        r6.addActionListener(this);
        image.add(r6);
        
        back = new JButton("Back");
        back.setBounds(380,416,135,30);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900, 725);
        setLocation(300,0);
//        setUndecorated(true);
        setVisible(true);
        
      
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== back){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
        else  {
            String amount = ((JButton)ae.getSource()).getText().substring(3); //Rs 500
            Conn c= new Conn();
            
            try{
                ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
                int balance = 0;
                while(rs.next()){
                   if(rs.getString("type").equals("Deposit")){
                       balance +=Integer.parseInt(rs.getString("amount"));
                   } 
                   else{
                        balance -=Integer.parseInt(rs.getString("amount"));
                   }
                }
                
                if(ae.getSource()!= back && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficientn Balance");
                    return;
                }
                 Date date = new Date();
                 String query = "insert into bank values('"+pinnumber+"','"+date+"','Withdrawl','"+amount+"')";
                 c.s.executeUpdate(query);
                 JOptionPane.showMessageDialog(null, "Rs" +amount+ " Debited Successfully");
                 
                 setVisible(false);
                 new Transactions(pinnumber).setVisible(true);
                 
                 
            }catch(Exception e){
                System.out.println(e);
            }
            
        }
            
    }
    
    public static void main(String[] args) {
        new FastCash("");
    }
}
