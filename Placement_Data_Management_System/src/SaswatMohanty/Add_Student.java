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
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Add_Student implements ActionListener{
    JFrame frame;
    JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,label15,label16,label17,label18;
    JTextField text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11,text12,text13,text14;
    JButton button1,button2,button3,button4;

    Add_Student(int i){}
    
    Add_Student(){
        frame = new JFrame("Add Student");
        frame.setBackground(Color.white);
        frame.setLayout(null);

        label14=new JLabel();
        label14.setBounds(0,0,900,700);
        label14.setLayout(null);
        ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("SaswatMohanty/icons/add.jpg"));
        label14.setIcon(image);

        label9 = new JLabel("New Student Details");
        label9.setBounds(320,30,500,50);
        label9.setFont(new Font("serif",Font.ITALIC,25));
        label9.setForeground(Color.black);
        label14.add(label9);
        frame.add(label14);

 
        label2 = new JLabel("Name");
        label2.setBounds(50,150,100,30);
        label2.setFont(new Font("serif",Font.BOLD,20));
        label14.add(label2);

        text2=new JTextField();
        text2.setBounds(200,150,150,30);
        label14.add(text2);

        label3 = new JLabel("Father's Name");
        label3.setBounds(400,150,200,30);
        label3.setFont(new Font("serif",Font.BOLD,20));
        label14.add(label3);

        text3=new JTextField();
        text3.setBounds(600,150,150,30);
        label14.add(text3);

        label4= new JLabel("Age");
        label4.setBounds(50,200,100,30);
        label4.setFont(new Font("serif",Font.BOLD,20));
        label14.add(label4);

        text4=new JTextField();
        text4.setBounds(200,200,150,30);
        label14.add(text4);

        label5= new JLabel("DOB (yyyy/mm/dd)");  
        label5.setBounds(400,200,200,30);
        label5.setFont(new Font("serif",Font.BOLD,20));
        label14.add(label5);

        text5=new JTextField();
        text5.setBounds(600,200,150,30);
        label14.add(text5);

        label6= new JLabel("Company");
        label6.setBounds(50,250,100,30);
        label6.setFont(new Font("serif",Font.BOLD,20));
        label14.add(label6);

        text6=new JTextField();
        text6.setBounds(200,250,150,30);
        label14.add(text6);

        label7= new JLabel("Phone");
        label7.setBounds(400,250,100,30);
        label7.setFont(new Font("serif",Font.BOLD,20));
        label14.add(label7);

        text7=new JTextField();
        text7.setBounds(600,250,150,30);
        label14.add(text7);

        label8= new JLabel("Email Id");
        label8.setBounds(50,300,100,30);
        label8.setFont(new Font("serif",Font.BOLD,20));
        label14.add(label8);

        text8=new JTextField();
        text8.setBounds(200,300,150,30);
        label14.add(text8);

        label10= new JLabel("Package");
        label10.setBounds(400,300,100,30);
        label10.setFont(new Font("serif",Font.BOLD,20));    
        label14.add(label10);

        text9=new JTextField();
        text9.setBounds(600,300,150,30);
        label14.add(text9);

        label11= new JLabel("Placed?");
        label11.setBounds(50,350,100,30);
        label11.setFont(new Font("serif",Font.BOLD,20));
        label14.add(label11);

        text10=new JTextField();
        text10.setBounds(200,350,150,30);
        label14.add(text10);


        label12= new JLabel("Aadhar No");
        label12.setBounds(400,350,100,30);
        label12.setFont(new Font("serif",Font.BOLD,20));
        label14.add(label12);

        text11=new JTextField();
        text11.setBounds(600,350,150,30);
        label14.add(text11);

        label13= new JLabel("Student Id");
        label13.setBounds(50,400,150,30);
        label13.setFont(new Font("serif",Font.BOLD,20));
        label14.add(label13);

        text12=new JTextField();   
        text12.setBounds(200,400,150,30);
        label14.add(text12);

        

        label17=new JLabel();
        label17.setBounds(200,450,250,200);
	label14.add(label17);

        label18=new JLabel("");
        label18.setBounds(600,450,250,200);
        label14.add(label18);

        button1 = new JButton("Submit");
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        button1.setBounds(250,550,150,40);
        
        label14.add(button1);

        button2=new JButton("Cancel");   
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.WHITE);
        button2.setBounds(450,550,150,40);
        
        label14.add(button2);
        
        button1.addActionListener(this);
        button2.addActionListener(this);
        
        frame.setVisible(true);
        frame.setSize(900,700);
        frame.setLocation(400,150);
    }

    public void actionPerformed(ActionEvent actionEvevnt){
        
        String s1 = text2.getText();
        String s2 = text3.getText();
        String s3 = text4.getText();
        String s4 = text5.getText();
        String s5 = text6.getText();
        String s6 = text7.getText();
        String s7 = text8.getText();
        String s8 = text9.getText();
        String s9 = text10.getText();
        String s10 = text11.getText();
        String s11 = text12.getText();
        if(actionEvevnt.getSource() == button1){
            try{
                conn cc = new conn();
                String querry = "insert into student values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s9+"','"+s10+"','"+s11+"')";
                cc.statement.executeUpdate(querry);
                JOptionPane.showMessageDialog(null,"Details Successfully Inserted");
                frame.setVisible(false);
                new Details();
            }catch(Exception ee){
                System.out.println("The error is:"+ee);
            }
        }else if(actionEvevnt.getSource() == button2){
            frame.setVisible(false);
            new Details();
        }
    }
    public static void main(String[ ] arg){
        new Add_Student();
    }
}
