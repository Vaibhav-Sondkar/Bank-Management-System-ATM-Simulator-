package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener{
    
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancle;
    String formno;
    
    
    SignupThree(String formno){
        this.formno = formno;
        setLayout(null);
        
    JLabel l1= new JLabel("Page 3: Account Details");
    l1.setFont(new Font("Raleway", Font.BOLD, 22));
    l1.setBounds(280, 40, 400, 40);
    add(l1);
    
    JLabel type= new JLabel("Page 3: Account Details");
    type.setFont(new Font("Raleway", Font.BOLD, 22));
    type.setBounds(100, 100, 300, 30);
    add(type);

    r1 = new JRadioButton("Savings Account");
    r1.setFont(new Font("Raleway", Font.BOLD, 16));
    r1.setBackground(Color.WHITE);
    r1.setBounds(100, 155, 250, 20);
    add(r1);
    
    r2 = new JRadioButton("Fixed deposite Account");
    r2.setFont(new Font("Raleway", Font.BOLD, 16));
    r2.setBackground(Color.WHITE);
    r2.setBounds(350, 155, 250, 20);
    add(r2);
    
    r3 = new JRadioButton("Current Account");
    r3.setFont(new Font("Raleway", Font.BOLD, 16));
    r3.setBackground(Color.WHITE);
    r3.setBounds(100, 195, 250, 20);
    add(r3);
    
    r4 = new JRadioButton("Recurring Deposite Account");
    r4.setFont(new Font("Raleway", Font.BOLD, 16));
    r4.setBackground(Color.WHITE);
    r4.setBounds(350, 195, 250, 20);
    add(r4);
    
    ButtonGroup groupbutton = new ButtonGroup();
    groupbutton.add(r1);
    groupbutton.add(r2);
    groupbutton.add(r3);
    groupbutton.add(r4);
    
    JLabel card= new JLabel("Card Number");
    card.setFont(new Font("Raleway", Font.BOLD, 22));
    card.setBounds(100, 260, 200, 30);
    add(card);
    
    JLabel number= new JLabel("XXXX-XXXX-XXXX-4271");
    number.setFont(new Font("Raleway", Font.BOLD, 22));
    number.setBounds(350, 260, 300, 30);
    add(number);
    
    JLabel carddetails= new JLabel("Your 16 Digit Card Number");
    carddetails.setFont(new Font("Raleway", Font.BOLD, 12));
    carddetails.setBounds(100, 290, 300, 20);
    add(carddetails);
    
    JLabel pin= new JLabel("Pin Number");
    pin.setFont(new Font("Raleway", Font.BOLD, 22));
    pin.setBounds(100, 330, 200, 30);
    add(pin);
    
    JLabel pindetails= new JLabel("Your 4 Digit Pin");
    pindetails.setFont(new Font("Raleway", Font.BOLD, 12));
    pindetails.setBounds(100, 360, 300, 20);
    add(pindetails);
    
    JLabel services= new JLabel("Services Required");
    services.setFont(new Font("Raleway", Font.BOLD, 22));
    services.setBounds(100, 410, 400, 30);
    add(services);
    
    JLabel pnumber= new JLabel("XXXX");
    pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
    pnumber.setBounds(350, 330, 300, 30);
    add(pnumber);
    
    c1= new JCheckBox("ATM CARD");
    c1.setBackground(Color.white);
    c1.setFont(new Font("Raleway", Font.BOLD, 16));
    c1.setBounds(100, 460, 200, 30);
    add(c1);
    
    c2= new JCheckBox("Internet Banking");
    c2.setBackground(Color.white);
    c2.setFont(new Font("Raleway", Font.BOLD, 16));
    c2.setBounds(350, 460, 200, 30);
    add(c2);
    
    c3= new JCheckBox("Mobile Banking");
    c3.setBackground(Color.white);
    c3.setFont(new Font("Raleway", Font.BOLD, 16));
    c3.setBounds(100, 510, 200, 30);
    add(c3);
    
    c4= new JCheckBox("Email & SMS Alerts");
    c4.setBackground(Color.white);
    c4.setFont(new Font("Raleway", Font.BOLD, 16));
    c4.setBounds(350, 510, 200, 30);
    add(c4);
    
    c5= new JCheckBox(" Cheque Book");
    c5.setBackground(Color.white);
    c5.setFont(new Font("Raleway", Font.BOLD, 16));
    c5.setBounds(100, 560, 200, 30);
    add(c5);
    
    c6= new JCheckBox("E-Statement");
    c6.setBackground(Color.white);
    c6.setFont(new Font("Raleway", Font.BOLD, 16));
    c6.setBounds(350, 560, 200, 30);
    add(c6);
    
    c7= new JCheckBox("I here by declare that the above details are correct to the best of my knowledge");
    c7.setBackground(Color.white);
    c7.setFont(new Font("Raleway", Font.BOLD, 12));
    c7.setBounds(100, 600, 600, 30);
    add(c7);
    
    submit = new JButton("SUBMIT");
    submit.setBackground(Color.gray);
    submit.setForeground(Color.BLACK);
    submit.setFont(new Font("Raleway", Font.BOLD, 14));
    submit.setBounds(220, 640, 100, 30);
    submit.addActionListener(this);
    add(submit);
    
    cancle = new JButton("CANCLE");
    cancle.setBackground(Color.gray);
    cancle.setForeground(Color.BLACK);
    cancle.setFont(new Font("Raleway", Font.BOLD, 14));
    cancle.setBounds(420, 640, 100, 30);
    cancle.addActionListener(this);
    add(cancle);
    
        setSize(850, 820);
        setLocation(350,0);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
}
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit){
            String accountType= null;
            if(r1.isSelected()){
                accountType = "Saving Account";
            }
            else if(r2.isSelected()){
                accountType = "Fixed Deposite Account";
            }
            else if(r3.isSelected()){
                accountType = "Current Account";
            }
            else if(r4.isSelected()){
                accountType = "Recurring Account";
            }
            
            Random random =  new Random();
            String cardnumber ="" + Math.abs((random.nextLong() % 90000000L) + 5040930600000000L);
            String pinnumber = "" + Math.abs((random.nextLong() % 9000L )+1000L);
            String facility = "" ;
            if (c1.isSelected()){
                facility = facility + "ATM CARD";
            }
            else if(c2.isSelected()){
                facility = facility + "Internet services";
            }
            else if(c3.isSelected()){
                facility = facility + "Mobile N=Banking";
            }
            else if(c4.isSelected()){
                facility = facility + "Email & SMS Alerts";
            }
            else if(c5.isSelected()){
                facility = facility + "Cheque Book";
            }
            else if(c2.isSelected()){
                facility = facility + "E-Statement";
            }
            
            try{
                
                if (accountType.equals("")){
                    JOptionPane.showMessageDialog(null, "Account Type is Required");
                }
                else{
                    Conn conn = new Conn();
                    String query1 = "insert into signupthree values('"+formno+"', '"+accountType+"', '"+cardnumber+"', '"+pinnumber+"', '"+facility+"')";
                    conn.s.executeUpdate(query1);
                    
                    String query2 = "insert into login values('"+formno+"','"+cardnumber+"', '"+pinnumber+"')";
                    conn.s.executeUpdate(query2);
                    
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\n Pin: " + pinnumber);
                }
                setVisible(false);
                new Deposit(pinnumber).setVisible(false);
                
            }catch(Exception e){
                System.out.println(e);
            }
        }
        else if(ae.getSource() == cancle){
            setVisible(false);
            new Login().setVisible(true);
            
        }
    }
    public static void main(String[] args) {
        new SignupThree("");
    }

   
}
