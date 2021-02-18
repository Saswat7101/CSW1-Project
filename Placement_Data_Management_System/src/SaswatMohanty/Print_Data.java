/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SaswatMohanty;

/**
 *
 * @author SASWAT7101
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Print_Data implements ActionListener{
    JFrame frame;
    JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,label15,label16,label17,label18,label19,label20,label21,label22,label23,label24,label25,label26,label27;
    String stu_id,name,father,company,phone,email,packages,placed,age,dob,aadhar;
    JButton button1,button2;
    ImageIcon icon;

    Print_Data(String e_id){
        try{
            conn con = new conn();
            String str = "select * from Student where stu_id = '"+e_id+"'";
            ResultSet resultSet= con.statement.executeQuery(str);

            while(resultSet.next()){

               
                name = resultSet.getString("name");
                father = resultSet.getString("fname");
                age = resultSet.getString("age");
                dob = resultSet.getString("dob");
                company = resultSet.getString("company");
                phone = resultSet.getString("phone");
                email = resultSet.getString("email");
                packages = resultSet.getString("package");
                placed = resultSet.getString("placed_non_placed");
                aadhar = resultSet.getString("aadhar");
                stu_id = resultSet.getString("Stu_id");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
 
        frame=new JFrame("Print Data");
        frame.setVisible(true);
        frame.setSize(595,642);
        frame.setLocation(450,200);
        frame.setBackground(Color.white);
        frame.setLayout(null);


        label18=new JLabel();
        label18.setBounds(0,0,595,642);
        label18.setLayout(null);
        ImageIcon image=new ImageIcon(ClassLoader.getSystemResource("SaswatMohanty/icons/print.jpg"));
        label18.setIcon(image);

        label1 = new JLabel("Student Details");
        label1.setBounds(50,10,250,30);
        frame.add(label1);
        label1.setFont(new Font("serif",Font.BOLD,25));
        label18.add(label1);
        frame.add(label18);

        label2 = new JLabel("Student Id:");
        label2.setBounds(50,70,120,30);
        label2.setFont(new Font("serif",Font.BOLD,20));
        label18.add(label2);

        label3 = new JLabel(stu_id);
        label3.setBounds(200,70,200,30);
        label3.setFont(new Font("serif",Font.BOLD,20));
        label18.add(label3);

        label4 = new JLabel("Name:");
        label4.setBounds(50,120,100,30);
        label4.setFont(new Font("serif",Font.BOLD,20));
        label18.add(label4);

        label5 = new JLabel(name);
        label5.setBounds(200,120,300,30);
        label5.setFont(new Font("serif",Font.BOLD,20));
        label18.add(label5);

  
        label6 = new JLabel("Father's Name:"); 
        label6.setBounds(50,170,200,30);
        label6.setFont(new Font("serif",Font.BOLD,20));
        label18.add(label6);

        label7 = new JLabel(father);
        label7.setBounds(200,170,300,30);
        label7.setFont(new Font("serif",Font.BOLD,20));
        label18.add(label7);

        label8= new JLabel("Company:");
        label8.setBounds(50,220,100,30);
        label8.setFont(new Font("serif",Font.BOLD,20));
        label18.add(label8);

        label9= new JLabel(company);
        label9.setBounds(200,220,300,30);
        label9.setFont(new Font("serif",Font.BOLD,20));
        label18.add(label9);


        label10= new JLabel("Mobile No:");  
        label10.setBounds(50,270,100,30);
        label10.setFont(new Font("serif",Font.BOLD,20));
        label18.add(label10);

        label11= new JLabel(phone);
        label11.setBounds(200,270,300,30); 
        label11.setFont(new Font("serif",Font.BOLD,20));
        label18.add(label11);

        
        label12= new JLabel("Email Id:");
        label12.setBounds(50,320,100,30);
        label12.setFont(new Font("serif",Font.BOLD,20));
        label18.add(label12);

        label13= new JLabel(email);
        label13.setBounds(200,320,300,30);
        label13.setFont(new Font("serif",Font.BOLD,20));
        label18.add(label13);

        
        label14= new JLabel("Package:");
        label14.setBounds(50,370,100,30);
        label14.setFont(new Font("serif",Font.BOLD,20));
        label18.add(label14);

        label15= new JLabel(packages);
        label15.setBounds(200,370,300,30); 
        label15.setFont(new Font("serif",Font.BOLD,20));
        label18.add(label15);


        label16= new JLabel("Placed? :");
        label16.setBounds(50,420,100,30);
        label16.setFont(new Font("serif",Font.BOLD,20));
        label18.add(label16);

        label17= new JLabel(placed);
        label17.setBounds(200,420,300,30);
        label17.setFont(new Font("serif",Font.BOLD,20));
        label18.add(label17);

        
        button1=new JButton("Print");
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        button1.setBounds(100,520,100,30);
        button1.addActionListener(this);
        label18.add(button1);

        button2=new JButton("Cancel");
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.WHITE);
        button2.setBounds(250,520,100,30);
        button2.addActionListener(this);
        label18.add(button2);


    }

    public void actionPerformed(ActionEvent actionEvent){

        if(actionEvent.getSource()==button1){
            JOptionPane.showMessageDialog(null,"Printed Successfully");
            frame.setVisible(false);
            Details d=new Details();
        }
        if(actionEvent.getSource()==button2){
            frame.setVisible(false);
            new View_Student();
        }
    }
    public static void main(String[] args){
        new Print_Data("Print Data");
    }
}
