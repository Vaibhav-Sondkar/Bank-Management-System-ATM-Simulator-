package bank.management.system;

import java.awt.*;
import javax.swing.*;

import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener {
    
     
     JTextField aadhar,pan;
     
     JButton next;
     JRadioButton eyes,eno,syes,sno;
     JComboBox religion,category,occupation,education,income;
    String formno;
             
    
    SignupTwo(String formno){
        this.formno=formno;
        
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
       
        
        JLabel additionaldeatils = new JLabel("Page 2: Additional Details");
        additionaldeatils.setFont(new Font("Raleway", Font.BOLD, 20));
        additionaldeatils.setBounds(290, 80, 400, 30);
        add(additionaldeatils);
        
        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        String valreligion[] ={"Hindu","Muslim","Christian","Sikh","Other"} ;
        religion = new JComboBox(valreligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
       
        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
       
        String valcategory[] ={"General","OBC","SC","ST","other"};
        category =new JComboBox(valcategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.white);
        add(category);
        
        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        String incomecategory[] ={"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
        income =new JComboBox(incomecategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.white);
        add(income);
        
        JLabel gender = new JLabel("Educational");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        
        String eduvalue[] ={"Non-Graduate","Graduate","Post-Graduation","Doctrate","Other"};
        education =new JComboBox(eduvalue);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.white);
        add(education);
        
        JLabel email = new JLabel("Qualification:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 315, 200, 30);
        add(email);
        
        JLabel soccupation = new JLabel("Occupation:");
        soccupation.setFont(new Font("Raleway", Font.BOLD, 20));
        soccupation.setBounds(100, 390, 200, 30);
        add(soccupation);
        
        String occupationvalue[] ={"Salaried","Self-Employed","Bussiness","Student","Retired","Other"};
        occupation =new JComboBox(occupationvalue);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.white);
        add(occupation);
        
        JLabel PanNo = new JLabel("Pan no:");
        PanNo.setFont(new Font("Raleway", Font.BOLD, 20));
        PanNo.setBounds(100, 440, 200, 30);
        add(PanNo);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);
        
         JLabel city = new JLabel("Aadhar no:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhar.setBounds(300, 490, 400, 30);
        add(aadhar);
       
        JLabel marital = new JLabel("Senior Citizen:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 540, 200, 30);
        add(marital);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
      
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);
        

        JLabel ExistingAccount = new JLabel("Existing Account:");
        ExistingAccount.setFont(new Font("Raleway", Font.BOLD, 20));
        ExistingAccount.setBounds(100, 590, 200, 30);
        add(ExistingAccount);
        
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
      
        ButtonGroup existinggroup = new ButtonGroup();
        existinggroup.add(eyes);
        existinggroup.add(eno);
        
   
        
        next = new JButton("Next");
        next.setBackground(Color.lightGray);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 645, 80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850, 720);
        setLocation(350,10);
        setVisible(true);
          
    }
    
    public void actionPerformed(ActionEvent ae)
    {
       
       
        String sreligion =(String)religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String saadhar = aadhar.getText();
        String span = pan.getText();
        
        String seniorcitizen = null;
        if(syes.isSelected()){
            seniorcitizen ="yes"; 
        }
        else if(sno.isSelected()){
            seniorcitizen = "No";
        }
        
       
        String existingaccount = null;
        if(eyes.isSelected()){
            existingaccount ="Yes";
        }
        else if(eno.isSelected()){
        existingaccount ="No";
        }
       
        try{
        
            Conn c = new Conn();
            String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+saadhar+"','"+span+"','"+seniorcitizen+"','"+existingaccount+"')";
            c.s.executeUpdate(query);
            
            setVisible(false);
            new SignupThree(formno).setVisible(true);
            
       
    }catch (Exception e){
            System.out.println(e);
    }
        
    }
    public static void main(String[] args) {
        new SignupTwo("");
    }
     
} 
