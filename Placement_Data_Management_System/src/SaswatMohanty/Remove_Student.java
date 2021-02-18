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
import javax.swing.*;

public class Remove_Student implements ActionListener{
    JFrame frame;
    JTextField textField;
    JLabel label1,label2,label3,label4,label5,label6,label7,label8;
    JButton button1,button2,button3,button4;

    Remove_Student(){
        frame=new JFrame("Remove Student");
        frame.setBackground(Color.green);   
        frame.setLayout(null);

        label5=new JLabel();
        label5.setBounds(0,0,500,500);
        label5.setLayout(null);
        ImageIcon image=new ImageIcon(ClassLoader.getSystemResource("SaswatMohanty/icons/root.jpg"));
        label5.setIcon(image);
        frame.add(label5);

        
        label1=new JLabel("Student Id");
        label1.setBounds(50,50,250,30);
        label1.setForeground(Color.white);
        Font font1 = new Font("serif",Font.BOLD,25); 
        label1.setFont(font1);
        label5.add(label1);

        textField=new JTextField();
        textField.setBounds(250,50,150,30);
        label5.add(textField);


        button1=new JButton("Search");
        button1.setBounds(200,100,100,30);
        button1.addActionListener(this);
        label5.add(button1);

        button4=new JButton("Back");
        button4.setBounds(360,100,100,30);   
        button4.addActionListener(this);
        label5.add(button4);


        label2=new JLabel("Name:"); 
        label2.setBounds(50,150,250,30);
        label2.setForeground(Color.white);
        Font font2 = new Font("serif",Font.BOLD,20); 
        label2.setFont(font2);
        label5.add(label2);

        label6=new JLabel();    
        label6.setBounds(200,150,350,30);
        label6.setForeground(Color.white);
        Font font3=new Font("serif",Font.BOLD,20); 
        label6.setFont(font3);
        label5.add(label6);

        label3=new JLabel("Mobile No:");
        label3.setBounds(50,200,250,30);
        label3.setForeground(Color.white);
        Font font4 = new Font("serif",Font.BOLD,20); 
        label3.setFont(font4);
        label5.add(label3);


        label7=new JLabel();
        label7.setBounds(200,200,350,30);
        label7.setForeground(Color.white);
        Font font5=new Font("serif",Font.BOLD,20); 
        label7.setFont(font5);
        label5.add(label7);



        label4=new JLabel("Email Id:");
        label4.setBounds(50,250,250,30);
        label4.setForeground(Color.white);
        Font font6=new Font("serif",Font.BOLD,20); 
        label4.setFont(font6);
        label5.add(label4);

        label8=new JLabel();
        label8.setBounds(200,250,350,30);
        label8.setForeground(Color.white);
        Font font7=new Font("serif",Font.BOLD,20); 
        label8.setFont(font7);
        label5.add(label8);

        button2=new JButton("Remove");
        button2.setBounds(120,300,100,30);
        button2.addActionListener(this);
        label5.add(button2);


        button3=new JButton("Cancel");
        button3.setBounds(300,300,100,30);
        button3.addActionListener(this);
        label5.add(button3);
        label2.setVisible(false);
        label3.setVisible(false);
        label4.setVisible(false);
        button2.setVisible(false);
        button3.setVisible(false);

        frame.setSize(500,500);
        frame.setLocation(500,250);  
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent actionEvevnt){

        if(actionEvevnt.getSource()==button1){
            try{
                conn con = new conn();
                String string = "select name,phone,email from student where stu_id ='"+textField.getText()+"' ";
                ResultSet resultSet = con.statement.executeQuery(string);

                int i=0;
                if(resultSet.next()){
                    String name = resultSet.getString(1);
                    String mob = resultSet.getString(2);
                    String email=resultSet.getString(3);

                    label2.setVisible(true);
                    label3.setVisible(true);
                    label4.setVisible(true);
                    button2.setVisible(true);
                    button3.setVisible(true);    
                    i=1;
                    label6.setText(name);
                    label7.setText(mob);
                    label8.setText(email);
                }
                if(i==0)
                    JOptionPane.showMessageDialog(null,"Id not found");
            }catch(Exception exception){}
        }
        if(actionEvevnt.getSource()==button2){
            try{
                conn con = new conn();
                String str = "delete from student where stu_id = '"+textField.getText()+"'";
                con.statement.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"deleted successfully");
                label2.setVisible(false);
                label3.setVisible(false);
                label4.setVisible(false);
                label6.setVisible(false);
                label7.setVisible(false);
                label8.setVisible(false);
                button2.setVisible(false);
                button3.setVisible(false);

            }catch(Exception exception){
                JOptionPane.showMessageDialog(null,"Exception occured while delting record "+exception);
            }
        }
        if(actionEvevnt.getSource()==button3){
            frame.setVisible(false);
            Details details=new Details();
        }
        if(actionEvevnt.getSource()==button4){
            frame.setVisible(false);
            Details details=new Details();
        }
    }

    public static void main(String[]ar){
        new Remove_Student();
    }
}
