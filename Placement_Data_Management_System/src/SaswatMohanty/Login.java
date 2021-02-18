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

public class Login implements ActionListener{
    JFrame frame;
    JLabel label1,label2;
    JTextField text1;
    JPasswordField text2;
    JButton button1,button2;

    Login(){

        frame=new JFrame("Login");

        frame.setBackground(Color.white);
        frame.setLayout(null);

        label1 = new JLabel("Username");
        label1.setBounds(40,20,100,30);
        frame.add(label1);
        
        label2 = new JLabel("Password");
        label2.setBounds(40,70,100,30);
        frame.add(label2);
 
        text1=new JTextField();
        text1.setBounds(150,20,150,30);
        frame.add(text1);

        text2=new JPasswordField();
        text2.setBounds(150,70,150,30);
        frame.add(text2);
        
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("SaswatMohanty/icons/login.png"));
        Image icon2 = icon1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon icon3 =  new ImageIcon(icon2);
        JLabel label3 = new JLabel(icon3);
        label3.setBounds(350,20,150,150);
        frame.add(label3);


        button1 = new JButton("Login");
        button1.setBounds(40,140,120,30);
        button1.setFont(new Font("serif",Font.BOLD,15));
        button1.addActionListener(this);
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        frame.add(button1);

        button2=new JButton("Cancel");
        button2.setBounds(180,140,120,30);
        button2.setFont(new Font("serif",Font.BOLD,15));
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.WHITE);
        frame.add(button2);

        button2.addActionListener(this);
        
        frame.getContentPane().setBackground(Color.WHITE);

        frame.setVisible(true);
        frame.setSize(600,300);
        frame.setLocation(400,300);

    }

    public void actionPerformed(ActionEvent actionEvevnt){

        try{
            conn c1 = new conn();
            String user = text1.getText();
            String pw = text2.getText();
            String querry = "select * from login where username='"+user+"' and password='"+pw+"'";
            ResultSet resultSet = c1.statement.executeQuery(querry); 
            if(resultSet.next()){
                new Details().frame.setVisible(true);
                frame.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Invalid Login Credentials");
                frame.setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] arg){
        Login login = new Login();
    }
}
