package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Transactions extends JFrame implements ActionListener{
    
    JButton deposit,withdrawl,ministatement,pinchange,fastcash,balance,exit,loginp;
    String pinnumber;
    
    Transactions(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 695);
        add(image);
        
        JLabel text = new JLabel("Please Select your Transaction");
        text.setBounds(220,200,700,35);
        text.setForeground(Color.gray);
        text.setFont(new Font("System",Font.BOLD,15));
        image.add(text);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(160,312,135,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdrawl = new JButton("Cash Withdrawl");
        withdrawl.setBounds(380,312,135,30);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(160,347,135,30);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        ministatement = new JButton("Mini-Statement");
        ministatement.setBounds(380,347,135,30);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
        pinchange = new JButton("Change Pin");
        pinchange.setBounds(160,381,135,30);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        balance = new JButton("Balance Enquiry");
        balance.setBounds(380,381,135,30);
        balance.addActionListener(this);
        image.add(balance);
        
        exit = new JButton("EXIT");
        exit.setBounds(380,416,135,30);
        exit.addActionListener(this);
        image.add(exit);
        
        loginp = new JButton("Login Menu");
        loginp.setBounds(160,416,135,30);
        loginp.addActionListener(this);
        image.add(loginp);
        
        setSize(900, 725);
        setLocation(300,0);
//        setUndecorated(true);
        setVisible(true);
        
      
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== exit){
            System.exit(0);
        }
        else if(ae.getSource() == loginp){
            setVisible(false);
            new Login().setVisible(true);
        }
        else if (ae.getSource() == deposit){
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }
        else if(ae.getSource() == withdrawl){
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }
        else if(ae.getSource() == fastcash){
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        }
        else if(ae.getSource() == pinchange){
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        }
        else if(ae.getSource() == balance ){
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        }
         else if(ae.getSource() == ministatement ){
            setVisible(true);
            new MiniStatement(pinnumber).setVisible(true);
        }
    }
    
    public static void main(String[] args) {
        new Transactions("");
    }
}
